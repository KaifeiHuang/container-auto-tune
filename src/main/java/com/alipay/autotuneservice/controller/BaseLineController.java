/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.autotuneservice.controller;

import com.alipay.autotuneservice.configuration.NoLogin;
import com.alipay.autotuneservice.controller.model.baseLine.BaseLineVO;
import com.alipay.autotuneservice.controller.model.baseLine.HistoryBaseLineVO;
import com.alipay.autotuneservice.controller.model.baseLine.JvmDateVO;
import com.alipay.autotuneservice.controller.model.baseLine.PodLineVO;
import com.alipay.autotuneservice.controller.model.tuneparam.AppTuneParamsVO;
import com.alipay.autotuneservice.controller.model.tuneparam.TuneParamItem;
import com.alipay.autotuneservice.model.ServiceBaseResult;
import com.alipay.autotuneservice.service.BaseLineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huoyuqi
 * @version BaseLineController.java, v 0.1 2022年08月09日 10:17 上午 huoyuqi
 */
@Slf4j
@RestController
@RequestMapping("/api/baseLine")
public class BaseLineController {

    @Autowired
    private BaseLineService baseLineService;

    @GetMapping("/LastJvm")
    @NoLogin
    public ServiceBaseResult<BaseLineVO> LastJvm(@RequestParam(value = "appId") Integer appId) {
        return ServiceBaseResult
                .invoker()
                .makeResult(() -> baseLineService.getJvm(appId));

    }

    @GetMapping("/jvmDateList")
    @NoLogin
    public ServiceBaseResult<List<JvmDateVO>> jvmDateList(@RequestParam(value = "appId") Integer appId) {
        return ServiceBaseResult
                .invoker()
                .makeResult(() -> baseLineService.getJvmDate(appId));
    }

    @GetMapping("/historyJvm")
    @NoLogin
    public ServiceBaseResult<List<HistoryBaseLineVO>> historyJvm(@RequestParam(value = "appId") Integer appId) {
        return ServiceBaseResult
                .invoker()
                .makeResult(() -> baseLineService.getHistoryJvm(appId));
    }

    @GetMapping("/jvmCompare")
    @NoLogin
    public ServiceBaseResult<AppTuneParamsVO> jvmComPare(@RequestParam(value = "appId") Integer appId,
                                                         @RequestParam(value = "currentMarketId") Integer currentMarketId,
                                                         @RequestParam(value = "historyJvmMarketId", required = false) Integer jvmMarketId,
                                                         @RequestParam(value = "version") String version) {
        return ServiceBaseResult
                .invoker()
                .makeResult(() -> baseLineService.getCompare(appId, currentMarketId, jvmMarketId, version));
    }

    @GetMapping("/podLine")
    @NoLogin
    public ServiceBaseResult<List<PodLineVO>> podLine(@RequestParam(value = "appId") Integer appId) {
        return ServiceBaseResult
                .invoker()
                .makeResult(() -> baseLineService.getPodLine(appId));
    }
}