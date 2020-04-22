package com.springbroker.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import lombok.Data;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */

public class DateAdapter extends XmlAdapter<String, Date> {
    private String pattern = "yyyy-MM-dd HH:mm:ss";
    SimpleDateFormat fmt = new SimpleDateFormat(pattern);

    @Override
    public Date unmarshal(String dateStr) throws Exception {

        return fmt.parse(dateStr);
    }

    @Override
    public String marshal(Date date) throws Exception {

        return fmt.format(date);
    }



}
