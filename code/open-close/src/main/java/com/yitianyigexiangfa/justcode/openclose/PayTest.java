package com.yitianyigexiangfa.justcode.openclose;

/**
 * @author Bill Lau
 * @date 2018-10-12
 */
public class PayTest {

    public static void main(String[] args) {
        try {
            PayStrategy strategy = PayFactory.getStrategy(PayEnum.WECHATPAY.name());
            strategy.pay(10);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
