package com.yitianyigexiangfa.justcode.openclose;

/**
 * @author Bill Lau
 * @date 2018-10-12
 */
public class WechatPay implements PayStrategy {

    @Override
    public void pay(int money) {
        System.out.println("微信支付：" + money + "元");
    }
}
