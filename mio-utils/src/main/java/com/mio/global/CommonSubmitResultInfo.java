package com.mio.global;


/**
 * 功能描述：统一提交信息返回类
 * 调用方式：
 * @author wfd
 * @date 2019/6/12
 * @return
 */
public class CommonSubmitResultInfo {

    // 操作结果信息
    private CommonResultInfo commonResultInfo;

    /*构造方法*/
    public CommonSubmitResultInfo(CommonResultInfo commonResultInfo) {
        this.commonResultInfo = commonResultInfo;
    }

    public CommonResultInfo getCommonResultInfo() {

        return commonResultInfo;
    }

    public void setCommonResultInfo(CommonResultInfo commonResultInfo) {
        this.commonResultInfo = commonResultInfo;
    }
}
