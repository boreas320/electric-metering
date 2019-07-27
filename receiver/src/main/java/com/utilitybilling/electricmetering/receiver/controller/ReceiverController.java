package com.utilitybilling.electricmetering.receiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utilitybilling.electricmetering.receiver.controller.vo.ReceiveMeteringDataReqVo;
import com.utilitybilling.electricmetering.receiver.controller.vo.ResultVo;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 12:52
 */
@RestController
public class ReceiverController {
    @Autowired
    private KafkaTemplate template;

    @GetMapping("/receive")
    public ResultVo receiveMeteringData(ReceiveMeteringDataReqVo reqVo) {
        ListenableFuture metering_data = template.send("metering_data", reqVo);
        return new ResultVo();
    }

}
