package com.bianbian.makejardemolib;

public class LogUtil {
    private static final String TAG = "MakeJarDemo: ";

    public static void info(String tag, String logContent) {
        /* 这里 println 为换行输入; print 为整行输入 */
        System.out.println(TAG + tag + ": " + logContent);
    }
}
