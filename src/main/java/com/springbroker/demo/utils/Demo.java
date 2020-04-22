package com.springbroker.demo.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
public class Demo {
    public static void main(String[] args) {

        String url = "http://192.168.88.60:9999";
        URL u = null;
        HttpURLConnection conn = null;
        StringBuffer sb = new StringBuffer();
        StringBuffer headBuffer = new StringBuffer();
        headBuffer.append("<?xml version=\"1.0\" encoding=\"GBK\"?><PGK><DATA><![CDATA[");

        StringBuffer buffer = new StringBuffer();

        //经办支付输入
        buffer.append("<?xml version=\"1.0\" encoding =\"GBK\"?>");
        buffer.append("<CBSERPPGK>");
        buffer.append("<INFO>");
        buffer.append("<FUNNAM>ERPAYSAV</FUNNAM>");
        buffer.append("</INFO>");
        buffer.append("<APPAYSAVX>");
        buffer.append("<BNKTYP>CMB</BNKTYP>");
        buffer.append("<BUSTYP>0</BUSTYP>");
        buffer.append("<CCYNBR>10</CCYNBR>");
        buffer.append("<CLTACC>000110100002</CLTACC>");
        buffer.append("<CLTNBR>0003</CLTNBR>");
        buffer.append("<EPTDAT>2020-03-04</EPTDAT>");
        buffer.append("<EPTTIM>11:01:00</EPTTIM>");
        buffer.append("<EXTTX1>摘要信息03</EXTTX1>");
        buffer.append("<OPRMOD>3</OPRMOD>");
        buffer.append("<OPRTYP>202</OPRTYP>");
        buffer.append("<PAYSON>N</PAYSON>");
        buffer.append("<PAYTYP>2</PAYTYP>");
        buffer.append("<INNACC></INNACC>");
        buffer.append("<INTDAT></INTDAT>");
        buffer.append("<ITMNBR></ITMNBR>");
        buffer.append("<PLNNBR></PLNNBR>");
        buffer.append("<RECNUM>1</RECNUM>");
        buffer.append("<REFNBR>TEST20190704</REFNBR>");
        buffer.append("<REVACC>8512384214654654</REVACC>");
        buffer.append("<REVBNK>招商银行科技园支行</REVBNK>");
        buffer.append("<REVCIT>深圳市</REVCIT>");
        buffer.append("<REVEML></REVEML>");
        buffer.append("<REVMOB></REVMOB>");
        buffer.append("<REVNAM>招商银行</REVNAM>");
        buffer.append("<REVPRV>广东省</REVPRV>");
        buffer.append("<TRSAMT>200.00</TRSAMT>");
        buffer.append("<TRSUSE>摘要信息01</TRSUSE>");
        buffer.append("<REVCAT></REVCAT>");
        buffer.append("<PAYCAT></PAYCAT>");
        buffer.append("</APPAYSAVX>");
        buffer.append("</CBSERPPGK>");

        //批量查询支付状态
//        buffer.append("<?xml version=\"1.0\" encoding =\"GBK\"?>");
//        buffer.append("<CBSERPPGK>");
//        buffer.append("<INFO>");
//        buffer.append("<FUNNAM>ERPAYSTA</FUNNAM>");
//        buffer.append("</INFO>");
//        buffer.append("<ERPAYSTAX>");
//        buffer.append("<REFNBR>201908190211</REFNBR>");
//        buffer.append("<BUSNBR>AP2001034947</BUSNBR>");
//        buffer.append("</ERPAYSTAX >");
//        buffer.append("<ERPAYSTAX >");
//        buffer.append("<REFNBR >20190819011</REFNBR >");
//        buffer.append("<BUSNBR >AP2001034948</BUSNBR >");
//        buffer.append("</ERPAYSTAX >");
//        buffer.append("</CBSERPPGK >");

        //离岸查询
//        buffer.append("<?xml version=\"1.0\" encoding =\"GBK\"?>");
//        buffer.append("<CBSERPPGK>");
//        buffer.append("<INFO>");
//        buffer.append("<FUNNAM>APQYRTGS</FUNNAM>");
//        buffer.append("</INFO>");
//        buffer.append("<APQYRTGSX>");
//        buffer.append("<CCYNBR>21</CCYNBR>");
//        buffer.append("<BEITYP>CMB</BEITYP>");
//        buffer.append("<RTGSNM>CREDIT AGRICOLE CORPORATE AND INVESTMENT BANK</RTGSNM>");
//        buffer.append("</APQYRTGSX>");
//        buffer.append("</CBSERPPGK>");

        //明细对接查询
//        buffer.append("<?xml version=\"1.0\" encoding =\"GBK\"?>");
//        buffer.append("<CBSERPPGK>");
//        buffer.append("<INFO>");
//        buffer.append("<FUNNAM>ERCURDTL</FUNNAM>");
//        buffer.append("</INFO>");
//        buffer.append("<ERCURDTLA>");
//        buffer.append("<DTLSEQ></DTLSEQ>");
//        buffer.append("<ITMDIR>A</ITMDIR>");
//        buffer.append("</ERCURDTLA>");
//        buffer.append("<ERCURDTLB>");
//        buffer.append("<ACTNBR>22221011</ACTNBR>");
//        buffer.append("</ERCURDTLB>");
//        buffer.append("</CBSERPPGK>");

        //历史明细数据查询对接
//        buffer.append("<?xml version=\"1.0\" encoding =\"GBK\"?>");
//        buffer.append("<CBSERPPGK>");
//        buffer.append("<INFO>");
//        buffer.append("<FUNNAM>EREXPTRS</FUNNAM>");
//        buffer.append("</INFO>");
//        buffer.append("<EREXPTRSB>");
//        buffer.append("<BGNDAT>2015-12-21</BGNDAT>");
//        buffer.append("<ENDDAT>2015-12-22</ENDDAT>");
//        buffer.append("<ITMDIR>A</ITMDIR>");
//        buffer.append("<WHRFRM>U</WHRFRM>");
//        buffer.append("</EREXPTRSB>");
//        buffer.append("<EREXPTRSA>");
//        buffer.append("<ACTNBR>12345678</ACTNBR>");
//        buffer.append("</EREXPTRSA>");
//        buffer.append("</CBSERPPGK>");

        //历史数据查询
//        buffer.append("<?xml version=\"1.0\" encoding =\"GBK\"?>");
//        buffer.append("<CBSERPPGK>");
//        buffer.append("<INFO>");
//        buffer.append("<FUNNAM>ERQRYTRS</FUNNAM>");
//        buffer.append("</INFO>");
//        buffer.append("<ERQRYTRSA>");
//        buffer.append("<BGNDAT>2015-12-22</BGNDAT>");
//        buffer.append("<ENDDAT>2015-12-22</ENDDAT>");
//        buffer.append("</ERQRYTRSA>");
//        buffer.append("<ERDTLSEQZ>");
//        buffer.append("<DTLSEQ>0</DTLSEQ>");
//        buffer.append("</ERDTLSEQZ>");
//        buffer.append("</CBSERPPGK>");


        //虚拟户开户
//        buffer.append("<?xml version=\"1.0\" encoding =\"GBK\"?>");
//        buffer.append("<CBSERPPGK>");
//        buffer.append("<INFO>");
//        buffer.append("<FUNNAM>ACVACOPN</FUNNAM>");
//        buffer.append("</INFO>");
//        buffer.append("<ACVACOPNX>");
//        buffer.append("<ACTACC>1234567890</ACTACC>");
//        buffer.append("<TYPNBR >100</TYPNBR>");
//        buffer.append("<BACNBR>0000000001</BACNBR>");
//        buffer.append("<ACTNAM>虚拟户户名</ACTNAM>");
//        buffer.append("<ACTRMK>我是备注</ACTRMK>");
//        buffer.append("</ACVACOPNX>");
//        buffer.append("<SYCOMSRCX>");
//        buffer.append("<USECOD>HTTP</USECOD>");
//        buffer.append("</SYCOMSRCX>");
//        buffer.append("</CBSERPPGK>");


        String checkCode = CBSUtil.GetCheckSumWithCRC32(buffer.toString());

        StringBuffer endBuffer = new StringBuffer();
        endBuffer.append("]]></DATA><CHECKCODE>");
        endBuffer.append(checkCode);
        endBuffer.append("</CHECKCODE></PGK>");


        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append(headBuffer);
        resultBuffer.append(buffer);
        resultBuffer.append(endBuffer);

        System.out.println("send_url:" + url);
        System.out.println("send_data:" + resultBuffer.toString());
        try {
            u = new URL(url);
            conn = (HttpURLConnection) u.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setReadTimeout(30000);
            conn.setConnectTimeout(30000);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream(), "GBK");
            osw.write(resultBuffer.toString());
            osw.flush();
            osw.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "GBK"));
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.print(temp);
                buffer.append(temp);
                buffer.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
