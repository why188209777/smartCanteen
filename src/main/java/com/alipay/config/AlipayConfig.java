package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092900626486";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCFUEKUp1J6MeyOvUgUMWGJY7RaAL4rRhs6JqlPfp4+uLv9Ev5cHNbBrw7HTI6ApDWmv7ZzY3OjDYfTTllBCQdX7cnoZ3ApLvy7clsUCCsyF6aNxH9/AvWz1KSHSaP+0D2F4L9jbYHfF4rmYEY3IYiV0Bu/TVKgaGAW6VXDUEJDwfMCNNqk0ZimAy+o70XzUMgxFQ+ncerj2tg4dfTgdhyEu2vT9lmYBspNT8p3WoJblACW/QmjpgZabZPWvLOZVk3N34srmsNlKPOt7cxRJoHu+8vCAl/T0MF1aATjkZg75N4H+4hgu4FtT4O+gAa1/Gh3wwxfVriwC6xWlVV+ZtHFAgMBAAECggEAKLU1X4coXD/aaEvMMr5Rdk6Hx+PqLfSeY8dic+/KCoUGgmTGXwI/Ya0+6gSqjwWVjHGGGP4JVYTQMOn/vyguod7uhJTxXuIGMobc4OUNq6IlLa0O8Y3J0TvhcZ4/AZQ89SCH0Kiju6fItkg3qKYIuxZtIqFN1cWJcfWWRqm/Ukj26hXESFxIOYDag+Ir9OXR2rJ5oPl5Tp8C8hMOf9lBfuIqIj7wJC7pOXfvS++dy/q+A4uH6q34jK91McbEeTYClF9IUG3cSxpcLxa7+Vd3oKpanLiIQyLxnCsbEfXWzEBL0wHFGS9rCfH3IE821yvqCCo3XbhyCFii3fo1qQtyEQKBgQDrnLzxxBzblQyPx/E+pHCzLnEfq9RqbcsLlZOwqa61h5ug94+qupwpHC1rN2rZu78I3buRoBM/0ZiOrahRXi7FgHKhLOM3zoFtrXOs5y/r+DV+ggGYlcIXIAT3NSwsVixvWvXsDaBjcr+K/KGaPprIAuZ5WL4ppGFMZvIywBtpnwKBgQCQ2WjI0Y179MFbZ6k+OYPW/IwJhf0Ojp5wd2pelIYyBtnHocxtoqKXQp6M198o9k0WcngFrGhqzh2AxQtMR5ujZEY4pVj5pC4os6J0w2oQAERKMRKSl+u1Cg569xibTfbBbPAEDuQBQV4rlynoxvct4y3wg0xEvNSmkURtDPqSGwKBgGg41yOi+pjvX7UiXsa0+t1oB8ZYvgeuNYkUS1Z0WMIYEHGt0LFXBsjwm+63ft59vE1xuAz84Eb0siU7EB+eJ9ZZsVs2ffQrtvkLJwYu5fXdv9wMKiSS6l5MXaX0sWuTWuiPNgWLKY2ULsKOafXPB6y+C7FV3hiRjDC9wRlN/VJFAoGABt+qT01Sb31v54yFxYQpM3yMkK8hER3HewLPs2lM7PbSQtz0vIcpPBBXQcvEtUbq5ZPNCkfiNJ9PWxr+rEIBqsFJa8q87CvUXO4ZWX0kfVnl47dscDRxZQfzI/ax3jzW5trqkOa7/ytA8sSbooY+mJjdRzqT1fc4CCeAncQt590CgYAZoJqvcQi4Qh5zPAyY9AADmb+9mCpZ718ioiNgepsYHO0JYvCsw9c/EBaM4HACLqBZypX2EPXKBXaFvXNEeDymp8VefJDBmOlh/zN4Yt5UhamzG2yC8XbHy3LUOP6CU50da3QbHBFKwnml2MzeJie1o01EJ0iaOCT9JNYv6iVoGQ==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhmkXrMiL9gTo/f+5ED6LNb2kXIaDlG615U4uaiKIobJ1yu+Yr7OAxpsA40IAmi98IPO6xOdZSoDxfWbI7UKP/Qej9dWHPxshLg2RkHvwT+H+7QbrmgFxyTVeuQnWVxDivwo9CNPpWW3MBHefxXd3/y0LzAKTSqQ8KQHYoDC2kh7Nb86J6qkaTNbu+zrr1og8j5tlK43F0mo+dwRSzxjRS52/SkFd/DYpmDlsEOhZeSXT+p6a8/IT+/vCvprWLoXeJWduSVe/lbbQ9pfnF+PZv3roG5ito4g/08rt7/ZXYnqiy0t3EcF/Rk5EDtsolJFNd7oVBaq60SB9VGHzaGdJdQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/smartCanteen/alipay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/smartCanteen/alipay/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

