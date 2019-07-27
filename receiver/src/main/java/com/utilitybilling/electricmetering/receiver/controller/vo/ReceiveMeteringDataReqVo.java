package com.utilitybilling.electricmetering.receiver.controller.vo;

import java.util.Date;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 15:07
 */
public class ReceiveMeteringDataReqVo {
    private long meteringId;
    private Date date;

    public long getMeteringId() {
        return meteringId;
    }

    public void setMeteringId(long meteringId) {
        this.meteringId = meteringId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data;
}
