package com.utilitybilling.electricmetering.dataprocess.api.vo;

import java.util.Date;
import java.util.Map;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 03:18
 */
public class DailyMeteringResVo {
    private Date date;
    private Map<Date, Integer> meteringMap;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<Date, Integer> getMeteringMap() {
        return meteringMap;
    }

    public void setMeteringMap(Map<Date, Integer> meteringMap) {
        this.meteringMap = meteringMap;
    }
}
