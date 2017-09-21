package com.lnsdlhfem.framework.util;

/**
 * 转型操作工具类
 * Created by lnsdlhfem on 2017/6/27.
 */
public final class CaseUtil {

    /**
     * 转为String型
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return castString(obj, "");
    }

    /**
     * 转为String型（提供默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为Double型
     * @param obj
     * @return
     */
    public static double castDouble(Object obj) {
        return castDouble(obj, 0);
    }

    /**
     * 转为double型（提供默认值）
     * @param obj
     * @param defaulValue
     * @return
     */
    public static double castDouble(Object obj, double defaulValue) {
        double doubleValue = defaulValue;
        if (obj != null) {
            String str = castString(obj);
            if (StringUtil.isNotEmpty(str)) {
                try {
                    doubleValue = Double.parseDouble(str);
                } catch (NumberFormatException e) {
                    doubleValue = defaulValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为long型
     * @param obj
     * @return
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }

    /**
     * 转为long型（提供默认值）
     * @param obj
     * @param defaulValue
     * @return
     */
    public static long castLong(Object obj, long defaulValue) {
        long longValue = defaulValue;
        if (obj != null) {
            String str = castString(obj);
            if (StringUtil.isNotEmpty(str)) {
                try {
                    longValue = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    longValue = defaulValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int型
     * @param obj
     * @return
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转为int型（提供默认值）
     * @param obj
     * @param defaulValue
     * @return
     */
    public static int castInt(Object obj, int defaulValue) {
        int intValue = defaulValue;
        if (obj != null) {
            String str = castString(obj);
            if (StringUtil.isNotEmpty(str)) {
                try {
                    intValue = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    intValue = defaulValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean型
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj)  {
        return castBoolean(obj, false);
    }

    /**
     * 转为boolean型（提供默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }

        return booleanValue;
    }
}
