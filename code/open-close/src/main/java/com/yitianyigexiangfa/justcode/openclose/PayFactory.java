package com.yitianyigexiangfa.justcode.openclose;

/**
 * @author Bill Lau
 * @date 2018-10-12
 */
public class PayFactory {

    public static PayStrategy getStrategy(String strategyType)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = PayEnum.valueOf(strategyType).getClassName();
        return (PayStrategy) Class.forName(className).newInstance();
    }
}
