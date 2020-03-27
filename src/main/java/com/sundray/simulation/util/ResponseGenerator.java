package com.sundray.simulation.util;

import com.sundray.simulation.response.AllDevType;
import com.sundray.simulation.response.DevStatus;
import com.sundray.simulation.response.DevType;

import java.util.*;

/**
 * @author: when
 * @create: 2020-03-26  22:26
 **/
public class ResponseGenerator {
    public static AllDevType generateAllDevType() {
        List<DevType> result = new ArrayList<>();
        DevType oneWay = new DevType("OneWayLoraSwitch", "智能单路触控开关", "SI-EWA-SW-T1-N-L");
        DevType twoWay = new DevType("TwoWayLoraSwitch", "智能双路触控开关", "SI-EWA-SW-T2-N-L");
        DevType threeWay = new DevType("ThreeWayLoraSwitch", "智能三路触控开关", "SI-EWA-SW-T3-N-L");
        DevType tempHumid = new DevType("LoRaTempHumid", "温湿度传感器", "WS-TH-01-L");
        DevType airQuality = new DevType("空气质量检测仪4合1", "空气质量检测仪4合1", "SI-MA-SEN-ENV-M4");
        result.addAll(Arrays.asList(oneWay, twoWay, threeWay, tempHumid, airQuality));
        return new AllDevType(result, Boolean.TRUE, result.size());
    }

    public static Map<String, Object> generateDevStatus(String key) {
        Map<String, Object> result = new HashMap<>();
        Map<String, DevStatus> devStatus = DevStatusFactory.create(key);
        result.put(key, devStatus);
        result.put("success", Boolean.TRUE);
        return result;
    }

}
