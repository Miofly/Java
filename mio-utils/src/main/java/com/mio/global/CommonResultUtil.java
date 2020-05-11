package com.mio.global;

import com.mio.util.ResourcesUtil;

import java.io.Serializable;

/**
 * 功能描述：系统结果工具类
 * 调用方式：
 * @author ME
 * @date 2019/6/12
 * @return
 */
public class CommonResultUtil implements Serializable {

	/**
	 * 功能描述：创建提交结果信息
	 * 调用方式：
	 * @author ME
	 * @date 2019/5/14
	 * @param commonResultInfo
	 * @return com.mio.result.SubmitResultInfo
	 */
	public static CommonSubmitResultInfo createSubmitResult(CommonResultInfo commonResultInfo) {
		return new CommonSubmitResultInfo(commonResultInfo);
	}

	/**
	 * 功能描述：成功返回结果
	 * 调用方式： return CommonResultUtil.createSuccess(Config.MESSAGE, result, 118, null);
	 * @author ME
	 * @date 2019/5/14
	 * @param fileName 资源名称 Config.MESSAGE
	 * @param data	返回数据
	 * @param messageCode 返回信息编码
	 * @param objs
	 * @return com.mio.global.CommonResultInfo
	 */
    public static CommonResultInfo createSuccess(String fileName, Object data, int messageCode, Object[] objs) {
    	String message = null;
    	if (objs == null) {
    		message = ResourcesUtil.getValue(fileName, messageCode + "");
    	} else {
    		message = ResourcesUtil.getValue(fileName, messageCode + "", objs);
    	}
    	return new CommonResultInfo(CommonResultInfo.STATUS_SUCCESS, data, message, messageCode);
    }

	/**
	 * 功能描述：失败返回结果
	 * 调用方式： return CommonResultUtil.createSuccess(Config.MESSAGE, result, 118, null);
	 * @author ME
	 * @date 2019/5/14
	 * @param fileName
	 * @param data
	 * @param messageCode
	 * @param objs
	 * @return com.mio.global.CommonResultInfo
	 */
	public static CommonResultInfo createFail(String fileName, Object data, int messageCode, Object[] objs) {
		String message = null;
		if (objs == null) {
			message = ResourcesUtil.getValue(fileName, messageCode + "");
		} else {
			message = ResourcesUtil.getValue(fileName, messageCode + "", objs);
		}
		return new CommonResultInfo(CommonResultInfo.STATUS_FAIL, data, message, messageCode);
	}

	/**
	 * 功能描述：提示信息结果
	 * 调用方式： return CommonResultUtil.createSuccess(Config.MESSAGE, result, 118, null);
	 * @author ME
	 * @date 2019/5/14
	 * @param fileName
	 * @param data
	 * @param messageCode
	 * @param objs
	 * @return com.mio.global.CommonResultInfo
	 */
	public static CommonResultInfo createInfo(String fileName, Object data, int messageCode, Object[] objs) {
		String message = null;
		if (objs == null) {
			message = ResourcesUtil.getValue(fileName, messageCode + "");
		} else {
			message = ResourcesUtil.getValue(fileName, messageCode + "", objs);
		}
		return new CommonResultInfo(CommonResultInfo.STATUS_INFO, data, message, messageCode);
	}

	/**
	 * 功能描述：抛出异常
	 * 调用方式：CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, 108, null));
	 * @author ME
	 * @date 2019/5/14
	 * @param commonResultInfo
	 * @return void
	 */
	public static void throwExcepion(CommonResultInfo commonResultInfo) throws CommonExceptionResultInfo {
		throw new CommonExceptionResultInfo(commonResultInfo);
	}
}
