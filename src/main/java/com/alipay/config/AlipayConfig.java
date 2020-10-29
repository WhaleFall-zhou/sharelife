package com.alipay.config;
public class AlipayConfig {
	// 商户appid
	public static String APPID = "2021000116692507";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCAv+5vUpSgpFkHjE7pdV4ROZKTj+JEvW7fC4yPbgGBUSJ3x/ZJShdfA2D7OYKgzDAEHECDyQyt3r0SKk79dRexc6/j4cUh0IXfNbRMZjYzKLy2nqCFi1pDDW9tDV4ysFnJ47p3J9vxswTmOpmZN3kw2UCIwoOZ0erkmlf36dhWVYfox06pdwH22OXnJxnBmTObtg9UKrF/hrB/GAMJlNG1TQnGKaxSYk/UCIBtRrEu5kQ+zeFchOJEbCnF8itC0m3ZKh7LGjorurb4pzHpQimJ91td9Kc5wBknKO+3sIxO6QJyhY9FxeyKw5R4Lfj+2LycpM9o/KQwZgbVm2MX1Fu9AgMBAAECggEAEk85MUulJ1M39gLWFg1C22A8oA+ONghahA24Z41VWXaYWEBvneyTdkecux1qnkNrcKoz4ons660JZlPt9813GR1Cnj21MyHcZ+nTQiom+w+IBtB4M4WlyHNYrUGBa+P4YOWp1tgsRysWP0eGIGvrKC89JjXDUVSw+uGYMQFoap55zNY3SEbdE0E38jPQ5768faA1AuIOl3AQenH+VoS2iQGiTPaerCBqjniiXMF5MzvEDshPjoXhud7+JUxPJPlaTJhQBNZ38R1sCHvgYMsuNvccfXCy6Bjp8SYePw+cl9+WukqRXPvGFNFcSMBiWwsZrt7isnCwyGZKQ+6ZfC0vYQKBgQDsSNppfUaJSwP/LONbakDbAOA5YPvsf4FE2XYOlxasSxyeeo/tcr8HjaMErHKkBpFBTjCsbv4Mizn7uskkzr3cwkIv1H30eJmwLWrFLnfQx06wq4/0/MX4HmivOV1ZzgyDDTA1OO0JkZSotsffAlM5XeblQq7nFaMpK0N2RLihhwKBgQCLfhWnd2RnQN0p3/T9h3qCdLDYuMG8m9sDM0x0GoMPuRJxfJPus7bgJclxfz1dO/j1dzI83t/S36GWvi7WEykF1ECVKrsf6ltWLa7jCuYPvzdnjOUELiY9w4fLcrzLBM/KfwH4Dq8NJc5sd2/nkjxtp/uehZQv//pjNTJrijC5mwKBgQDGafMGrE0kExs7F32gERx/C0A+zqMeGH/7ycRqQhOnALf6mJ7t3PJvLE/dJ9ZoyJ8HQNp8ogOxkuRQ76vivb0PeQzNT1mphfBA0hKbnAa/Ce6ZSqfrKKwxS4/KvJgYRn+ZOOTnfHMIGvjDqCE0sqYiQSkYEaP/ptrJQmw3D0QfVwKBgEY56ejvoKqi6zVDvPFOnYzD9qyFB3RO+sn3r4vcNRNbVz+vOkK4U18xZuMu7dPcd5AMvEwM4J4nXBCqGqZH6yU2IHV4l9CPigAu65b+S6it2dTWCA48tZ/uqpTwZL/I4lvN6U3bBqIV4ICW+M2av7VtFq5ODbbEpmf/xiyB29n1AoGBAJyBa0ZsQktCrbr19EfhptrbtFnEsv4KDdHRWMCXtAKlZhHJRRWp0SHEkuZc85NnHwZuNPlKWUQ+13vPGg9brOa6J/dznWkJjQptOhE5tfOREpFhRWRgla2HWV0VSYfegL6Ixp4yI6W8pNJCAtVOzQKf0uTHvbNUA4VdYSzyYaOw";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://localhost:8080/goods";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp4UaihhSQPPRaBGwKPmcYMLZLJ8RX3fFRvnC5ZlwNVYW757su83gROCkeeafQgaFwvnYLi5N5Vi3ds/38rH8Q7KWYXQX651IIsdGN5RySJJuP65uKj+6pMLX3q5Vxj3U6MYFC7XKiAfdwVnTNylFz12HF+6MBXAZvn+KBvdQSmOFV7PrJJz8s9eyPUtgBvAnjc3hV8Fl1c8lyQRJPvAoFIRarUYSwhsOCuIZujppI+nBy1GqB0JGnJV8+ofUcLdA5arYeJBHB7E0fzPJDqtiUznBQng8DJM1fzWG0brcos6aJtTAl2mjAwW0kTazIiGksQu4uSIHm7NNLBL71W6dHwIDAQAB";
	// 日志记录目录
	public static String log_path = "D:\\log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}