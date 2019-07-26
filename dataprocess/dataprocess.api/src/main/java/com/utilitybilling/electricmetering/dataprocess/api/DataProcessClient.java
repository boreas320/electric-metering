package com.utilitybilling.electricmetering.dataprocess.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utilitybilling.electricmetering.dataprocess.api.vo.DailyMeteringResVo;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 01:48
 */
@FeignClient("dataprocess")
public interface DataProcessClient {
    @RequestMapping("/getDailyMetering")
    DailyMeteringResVo getDailyMetering();
}
