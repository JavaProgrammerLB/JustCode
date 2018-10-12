package com.yitianyigexiangfa.justcode.openclose;

/**
 * @author Bill Lau
 * @date 2018-10-12
 */
public enum PayEnum {
    ALIPAY("com.yitianyigexiangfa.justcode.openclose.AliPay"),
    CASH("com.yitianyigexiangfa.justcode.openclose.CASH"),
    WECHATPAY("com.yitianyigexiangfa.justcode.openclose.WechatPay");

    private String className;

    PayEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
