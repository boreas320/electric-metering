package com.utilitybilling.electricmetering.billing.controller;

import java.util.Date;
import java.util.Map;

import com.utilitybilling.electricmetering.dataprocess.api.DataProcessClient;
import com.utilitybilling.electricmetering.dataprocess.api.vo.DailyMeteringResVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 01:38
 */
@RestController
public class BillingController {

    @Autowired
    private DataProcessClient dataProcessClient;

    @RequestMapping("/getBilling")
    public Map<Date, Integer> getBilling() {
        DailyMeteringResVo dailyMetering = dataProcessClient.getDailyMetering();
        return dailyMetering.getMeteringMap();
    }

}
