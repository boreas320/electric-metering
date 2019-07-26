package com.utilitybilling.electricmetering.dataprocess.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 03:21
 */
public class DateUtil {
    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static Date getDate(String dateString) {
        try {
            return df.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
