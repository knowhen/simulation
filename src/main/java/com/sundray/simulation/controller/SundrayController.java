package com.sundray.simulation.controller;

import com.sundray.simulation.request.ApiToken;
import com.sundray.simulation.request.Pagination;
import com.sundray.simulation.request.QueryParam;
import com.sundray.simulation.response.AccessToken;
import com.sundray.simulation.response.AllDevType;
import com.sundray.simulation.response.DevData;
import com.sundray.simulation.response.DevStatus;
import com.sundray.simulation.util.ResponseGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: when
 * @create: 2020-03-26  17:05
 **/
@RestController
@RequestMapping("/api/v1")
public class SundrayController {
    private static final Logger logger = LoggerFactory.getLogger(SundrayController.class);

    @PostMapping("/accessToken")
    public AccessToken getAccessToken(@RequestBody ApiToken apiToken) {
        logger.info("Get access token");
        String token = apiToken.getApi_token();
        if (token.equals("098f6bcd4621d373cade4e832627b4f6")) {
            return new AccessToken("5c860a0a6a23f72b516877f679758cba", 3890L);
        } else {
            return new AccessToken();
        }
    }

    @PostMapping("/device/getAllDevType")
    public AllDevType getAllDevType(@RequestBody Pagination pagination) {
        logger.info("Get all device type [" + pagination.getCurrent() + "," + pagination.getRowCount() + "]");
        return ResponseGenerator.generateAllDevType();
    }

    @PostMapping("/device/getStatus")
    public Map<String, Set<Map<String, DevStatus>>> getDevStatus(@RequestBody Map<String, QueryParam> params) {
        logger.info("Get device status");
        Map<String, Set<Map<String, DevStatus>>> result = new HashMap<>();
        Map<String, DevStatus> dev1 = ResponseGenerator.generateDevStatusMap1();
        Map<String, DevStatus> dev2 = ResponseGenerator.generateDevStatusMap2();
        Set<Map<String, DevStatus>> set = new HashSet<>();
        set.add(dev1);
        set.add(dev2);
        result.put("OneWayLoraSwitch", set);
        return result;
    }
}
