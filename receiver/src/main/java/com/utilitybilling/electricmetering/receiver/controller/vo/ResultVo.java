package com.utilitybilling.electricmetering.receiver.controller.vo;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 15:05
 */
public class ResultVo {
    private int status = 1;
    private int code = 200;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
