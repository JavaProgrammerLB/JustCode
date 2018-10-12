package com.yitianyigexiangfa.justcode.openclose;

/**
 * @author Bill Lau
 * @date 2018-10-12
 */
public interface PayStrategy {

    /**
     * 支付接口
     * @param money 支付金额
     */
    void pay(int money);
}
