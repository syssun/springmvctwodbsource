package com.sys.commons.common;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {
	SUCCESS("1"), // 成功
	FAIL("0"), // 失败
	UNAUTHORIZED("-1"), // 未认证（签名错误）
	NOT_FOUND("-2"), // 接口不存在
	NO_DATA("201"), INTERNAL_SERVER_ERROR("-3"), // 服务器内部错误
	RE_FALL("3"),// 校验商品已过保质期
	OUTCODE("1000");// 外部接口返回命令
	private final String code;

	ResultCode(String code) {
		this.code = code;
	}

	public String code() {
		return code;
	}
}
