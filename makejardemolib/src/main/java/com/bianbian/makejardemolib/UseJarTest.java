package com.bianbian.makejardemolib;

public class UseJarTest {
    private static final String TAG = "UseJarTest";

    /* 在cmd调用适用jar包时命令如下 */
    /* java -jar 参数1 参数2 参数3 */
    public static void main(String[] args) {
        /* jar中配置的main class 中的 main方法参数 数组 args，会接受上述  参数1 参数2 参数3 */
        LogUtil.info(TAG, "args length: " + args.length);
        for (String str : args) {
            LogUtil.info(TAG, "args: " + str);
        }
    }
}