package com.mio.global;

import java.io.Serializable;

/**
 * 功能描述：自定义系统异常返回类
 * 调用方式：
 * @author wfd
 * @date 2019/6/12 14:19
 * @return
 */
public class CommonExceptionResultInfo extends Exception implements Serializable {

	// 系统统一使用的结果类，包括了 提示信息类型和信息内容
	private CommonResultInfo commonResultInfo;
	public CommonExceptionResultInfo() { }

	public CommonExceptionResultInfo(CommonResultInfo commonResultInfo) {
		this.commonResultInfo = commonResultInfo;
	}

	public CommonResultInfo getCommonResultInfo() {
		return commonResultInfo;
	}

	public void setCommonResultInfo(CommonResultInfo commonResultInfo) {
		this.commonResultInfo = commonResultInfo;
	}
}
