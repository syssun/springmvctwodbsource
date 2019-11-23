package com.sys.commons.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author ☪wl
 * @program TPLSaas-HdApps
 * @description BigDecimal工具类
 * @create 2019-11-05 10:09
 */
public class BigDecimalUtils {

    /**
     * Object转BigDecimal
     *
     * @param value 要转的object类型
     * @return 转成的BigDecimal类型数据
     */
    public static BigDecimal getBigDecimal(Object value) {
        BigDecimal ret = null;
        if (value != null) {
            if (value instanceof BigDecimal) {
                ret = (BigDecimal) value;
            } else if (value instanceof String) {
                ret = new BigDecimal((String) value);
            } else if (value instanceof BigInteger) {
                ret = new BigDecimal((BigInteger) value);
            } else if (value instanceof Number) {
                ret = new BigDecimal(((Number) value).doubleValue());
            } else {
                throw new ClassCastException("Not possible to coerce [" + value + "] from class " + value.getClass() + " into a BigDecimal.");
            }
        }
        return ret;
    }

}
