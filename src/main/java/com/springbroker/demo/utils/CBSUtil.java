package com.springbroker.demo.utils;

import java.util.zip.CRC32;

public  class CBSUtil {

    static String CRC32_PASSWORD ="CMBChina2009"; //"";
    static String CRC32_PREFIX ="Z";
    static String key ="44ece84c0f484d0080b644d97c702daf"; //密匙 Z95B41D71
    /**
     * 生成规则: CRC32_PASSWORD + key + xmlData(需去掉回车换行符) 拼接成一个字符串,通过crc32校验规则生成字符串.
     *把该字符串转换成16进制,然后再大写,如果不足八位,则左补0,最后再加前缀CRC32_PREFIX
     * @param key
     * @param xmlData
     * @return
     */
    public static String GetCheckSumWithCRC32(String xmlData){
        CRC32 crc32 = new CRC32();
        String str = CRC32_PASSWORD + key + xmlData.replaceAll("\n","").replaceAll("\r", "");
        try {
            crc32.update(str.getBytes("GBK"));  //如果不指定gbk，就会取平台默认字符集
        }
        catch (Exception ex){
            System.out.print(ex.getMessage());
        }
        String result = Long.toHexString(crc32.getValue()).toUpperCase();
        String pattern="00000000";
        return CRC32_PREFIX + pattern.substring(0, pattern.length()-result.length()) + result ;
    }


}
