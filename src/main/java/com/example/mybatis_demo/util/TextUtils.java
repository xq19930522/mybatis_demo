package com.example.mybatis_demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TextUtils {
    /**
     * @param str
     * @return 字符串空判
     */
    public static boolean Isempty(String str) {
        return str == null || str.length() == 0;

    }

    /**
     * 获取当前时间
     *
     * @return
     */

    public static String getTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        return date;
    }


}
