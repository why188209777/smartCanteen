/*
 * 购物车
 */
$(function(){
	var cartValue=sessionStorage.getItem("cart");
	var cartObj;
	var item;
	if(cartValue!=null){
		cartObj=JSON.parse(cartValue);//转为为json对象
		item=cartObj.items;
		getAllCheckout(item);
	}else{
		var dom=$("#cartContainer");
		dom.html("");
		dom.append("<h1 style='text-align:center'>暂无商品</h1>");
		$("#goPay").html(" ");
	}
	
	
	function getAllCheckout(data){
		var dom=$("#cartContainer");
		dom.html(" ");
		if(data.length==0){
			dom.append("<h1 style='text-align:center'>暂无商品</h1>");
			
			return false;
		}
		$("#cartNum").text(data.length);
		var str="";
		for (var i=0;i<data.length;i++) {
			str+=`
				<div class="cart-header">
					<div class="removeCart" data-foodName="${data[i].foodName}"> </div>
					<div class="cart-sec simpleCart_shelfItem">
						<div class="cart-item cyc">
							<img src="images/foodimg/${data[i].foodImg}.jpg" class="img-responsive" alt="">
						</div>
						<div class="cart-item-info">
							<h3><a href="#">${data[i].foodName}  </a></h3>
							<ul class="qty">
								<li>
									<p>FREE delivery</p>
								</li>
							</ul>
							<div class="delivery">
								<p>
									<span>单价: ¥<span class="foodPrice">${data[i].foodPrice}</span></span>
									<span style="margin-right:40px">数量: <span class="foodNum">${data[i].foodNum}</span></span>
								</p>
								
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			`;
		}
		dom.append(str);
		//计算价格和数量
		var foodPrices=$(".foodPrice");
		var foodNums=$(".foodNum");
		var sum=0;
		var count=0;
		for (var i=0;i<data.length;i++) {
			count+=foodNums[i].innerText*1;
			sum+=foodPrices[i].innerText*foodNums[i].innerText;
		}
		//将食物总价存入session
		sessionStorage.setItem("foodTotal",sum);
		$(".foodTotalPrice").val(sum);
		$(".foodTotalNum").val(count);
		//生成唯一订单号
		var vNow = new Date();
		var sNow = "";
		sNow += String(vNow.getFullYear());
		sNow += String(vNow.getMonth() + 1);
		sNow += String(vNow.getDate());
		sNow += String(vNow.getHours());
		sNow += String(vNow.getMinutes());
		sNow += String(vNow.getSeconds());
		sNow += String(vNow.getMilliseconds());
		document.getElementById("WIDout_trade_no").value =  sNow;
	}
	
	//删除
	$(document).on("click", ".removeCart", function(event) {
		var thisParent=$(this).parent();
		thisParent.slideUp();
		thisParent.remove();
		var foodName=$(this).attr("data-foodName");
		$(item).each(function(index,value){
			if(value.foodName==foodName){
				item.splice(index,1);
				var cartNum=$("#cartNum").text();
				//若删除则购物车数量相应变化
				$("#cartNum").text(eval(cartNum-1));
				var foodPrices=$(".foodPrice");
				console.log(foodPrices.length);
				var foodNums=$(".foodNum");
				var sum=0;
				var count=0;
				for (var i=0;i<foodPrices.length;i++) {
					count+=foodNums[i].innerText*1;
					sum+=foodPrices[i].innerText*foodNums[i].innerText;
				}
				console.log("数量："+count+"总价："+sum);
				$(".foodTotalPrice").val(sum);
				$(".foodTotalNum").val(count);
				//session中相应也同步变化，存入同键自动替换
				sessionStorage.setItem("foodTotal",sum);
				
				var cart = {};
				cart.items=item;
				var jsonStr = JSON.stringify(cart); //转换为json字符串
				sessionStorage.setItem("cart", jsonStr); //存入session
				
			}
		})
	});
	
		
})
