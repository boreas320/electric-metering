package com.utilitybilling.electricmetering.dataprocess.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utilitybilling.electricmetering.dataprocess.api.vo.DailyMeteringResVo;
import com.utilitybilling.electricmetering.dataprocess.common.DateUtil;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 01:48
 */
@RestController
public class DataProcessController {
    @RequestMapping("/getDailyMetering")
    public DailyMeteringResVo getDailyMetering() {
        DailyMeteringResVo dailyMeteringResVo = new DailyMeteringResVo();
        dailyMeteringResVo.setDate(new Date());

        HashMap<Date, Integer> map = new HashMap<>();
        map.put(DateUtil.getDate("2019-01-01 22:00:00"), 123);
        map.put(DateUtil.getDate("2019-01-01 23:00:00"), 134);
        dailyMeteringResVo.setMeteringMap(map);
        return dailyMeteringResVo;
    }
}
