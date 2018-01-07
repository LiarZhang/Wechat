package com.zhangxf.constants;

import java.util.Properties;

import com.zhangxf.start.InterfaceUrlInti;

/**
 * ClassName: GlobalConstants
 * @Description: 配置文件全局变量
 * @author dapengniao
 * @date 2016年8月20日 下午3:27:54
 */
public class GlobalConstants {
 
    public static Properties interfaceUrlProperties;
    static {
        if (GlobalConstants.interfaceUrlProperties == null) {
            InterfaceUrlInti.init();
        }
    }
 
    /**
     * 
     * @Description: 根据不同类型取值
     * @param @param key
     * @param @return
     * @author dapengniao
     * @date 2015年10月13日 下午4:59:14
     */
    public static String getString(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Properties;
    }
 
    public static Integer getInt(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Integer.parseInt(Properties);
    }
 
    public static Boolean getBoolean(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Boolean.valueOf(Properties);
    }
 
    public static Long getLong(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Long.valueOf(Properties);
    }
 
}
