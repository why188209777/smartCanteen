/*
 * menu
 */
$(function() {

	//初始化餐厅列表
	function getAllCanteen() {
		$.ajax({
			type: "post",
			url: "http://localhost:8080/smartCanteen/canteen/getAllCanteen.do",
			dataType: "json",
			success: function(data) {
				let dom = $("#canteenList");
				dom.html("");
				let str = ""; //通用字符串模板
				for(let i = 0; i < data.length; i++) {
					str += `
						<option value="${i+1}">${data[i].cname}</option>
					`;
				}
				dom.append(str);
			},
			error: function(error) {
				console.log(error);
			}
		});
	}

	//初始化店铺列表
	function getAllMerchant(cid) {
		$.ajax({
			type: "post",
			url: "http://localhost:8080/smartCanteen/merchant/getMerchantByCid.do",
			data: {
				cid: cid
			},
			dataType: "json",
			success: function(data) {
				let dom = $("#storeList");
				dom.html("");
				let str = ""; //通用字符串模板
				for(let i = 0; i < data.length; i++) {
					str += `
						<option value="${data[i].mid}">${data[i].mname}</option>
					`;
				}
				dom.append(str);
			},
			error: function(error) {
				console.log(error);
			}
		});
	}

	//初始化商品列表
	function getFoodByCanteenAndMerchant(cid, mid) {
		$.ajax({
			type: "post",
			url: "http://localhost:8080/smartCanteen/food/getFoodByCanteenAndMerchant.do",
			data: {
				cid: cid,
				mid: mid
			},
			dataType: "json",
			success: function(data) {
				getAllFoods(data);
			},
			error: function(error) {
				console.log(error);
			}
		});
	}

	getAllCanteen();
	getAllMerchant(1);
	//初始化进来第一家餐厅的第一家店铺
	getFoodByCanteenAndMerchant(1, 1);
	//点击餐厅改变店铺列表
	$(document).on('change', '#canteenList', function(event) {
		var cid = this.value;
		getAllMerchant(cid);
	})

	/*//店铺change事件
	$(document).on('change', '#storeList', function(event){
	})*/

	//遍历填充Food商品列表
	function getAllFoods(data) {
		let dom = $("#menu");
		dom.html("");
		let str = ""; //通用字符串模板
		for(let i = 0; i < data.list.length; i++) {
			str += `
				<div class="col-md-4 menu-grid1 simpleCart_shelfItem">
					<img src="images/foodimg/${data.list[i].image}.jpg" class="img-responsive" style="width: 350px;height: 350px;"/>
					<div class="cur">
						<div class="cur-left">
							<div>
								<span class="item_price">
									<a>
										<span  style="cursor: pointer;" class="glyphicon glyphicon-shopping-cart" aria-hidden="true" data-foodImg="${data.list[i].image}" data-foodName="${data.list[i].fname}" data-foodPrice="${data.list[i].price}" data-foodNum="${data.list[i].number}"></span>
									</a>
								</span>
							</div>
						</div>
						<div class="cur-right">
							<div>
								<span class="item_price">
									<h6>
									<span style="display:none">${data.list[i].image}</span>
									<span class="foodName" style="margin-right: 30px;">${data.list[i].fname}</span>
									<span class="foodPrice" style="margin-right: 20px;">￥${data.list[i].price}</span>
									<span class="foodNum">剩余:${data.list[i].number}份</span>
						
									</h6>
								</span>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
			`;
		}
		str += `<div class="clearfix"></div>`;
		dom.append(str);
	}

	$(document).on("click", "#searchFood", function(event) {
		event.preventDefault();
		let cid = $("#canteenList").val(); //餐厅id
		let mid = $("#storeList").val(); //餐厅下属店铺id
		console.log("cid:" + cid + "\tmid:" + mid);
		getFoodByCanteenAndMerchant(cid, mid);
	});

	//加入购物车
	var cart = {};
	cart.items = [];
	$(document).on("click", ".glyphicon-shopping-cart", function(event) {
		event.preventDefault();

		var user = sessionStorage.getItem("user");
		if(user == null) {
			alert("请先登录！");
			return false;
		}

		var foodImg = $(this).attr("data-foodimg"); //图片地址
		console.log(foodImg);
		var foodName = $(this).attr("data-foodname"); //食物名称
		var foodPrice = $(this).attr("data-foodprice");
		var foodNum = 1; //点击一次加入一次
		var product = {
			foodName: foodName,
			foodPrice: foodPrice,
			foodNum: foodNum,
			foodImg: foodImg
		}

		var cartValue = sessionStorage.getItem("cart");
		
		if(cartValue != null) {
			var cartObj = JSON.parse(cartValue); //转为为json对象
			console.log(cartObj);
			var item = cartObj.items;
			var flag = false;
			$(item).each(function(index, value) {
				if(product.foodName == value.foodName) {
					flag = true;
					value.foodNum++;
					cart.items.splice(index, 1, value); //替换				
				}
			})
			if(flag == false) {
				cart.items.push(product);
			}
		} else {
			cart.items.push(product);
		}

		var jsonStr = JSON.stringify(cart); //转换为json字符串
		sessionStorage.setItem("cart", jsonStr); //存入session
		alert("添加购物车成功！");
	});
	
	
	//购物车滑过高亮
	$("#cartImg").on("mouseover",function(){
		$(this).attr("src","images/carthover.png");
		
	})
	$("#cartImg").on("mouseout",function(){
		$(this).attr("src","images/cart.png");
	})
})