package com.yitianyigexiangfa.justcode.openclose;

/**
 * @author Bill Lau
 * @date 2018-10-12
 */
public class AliPay implements PayStrategy {

    @Override
    public void pay(int money) {
        System.out.println("支付宝支付：" + money + "元");
    }
}
