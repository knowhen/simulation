package com.sundray.simulation.controller;

import com.sundray.simulation.request.ApiToken;
import com.sundray.simulation.request.Pagination;
import com.sundray.simulation.response.AccessToken;
import com.sundray.simulation.response.AllDevType;
import com.sundray.simulation.util.ResponseGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public AllDevType getDevStatus(@RequestBody Pagination pagination) {
        logger.info("Get status all of device type [" + pagination.getCurrent() + "," + pagination.getRowCount() + "]");
        return ResponseGenerator.generateAllDevType();
    }
}
