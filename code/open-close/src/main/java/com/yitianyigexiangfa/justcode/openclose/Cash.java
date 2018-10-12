package com.yitianyigexiangfa.justcode.openclose;

/**
 * @author Bill Lau
 * @date 2018-10-12
 */
public class Cash implements PayStrategy{

    @Override
    public void pay(int money) {
        System.out.println("现金支付：" + money + "元");
    }
}
