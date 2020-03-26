package com.sundray.simulation.util;

import com.sundray.simulation.response.AllDevType;
import com.sundray.simulation.response.DevData;
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

    private static Map<String, String> createCloudState() {
        Map<String, String> cloudState = new HashMap<>();
        cloudState.put("DEV_SWITCH_STA_1", "0.00");
        return cloudState;
    }

    private static Map<String, String> createSyncState() {
        Map<String, String> syncState = new HashMap<>();
        syncState.put("DEV_SWITCH_STA_1", "");
        syncState.put("DEV_SWITCH_STA_1_BetaTime", "0");
        return syncState;
    }

    private static DevData createDevData(String gateway, String loradbm) {
        return new DevData(gateway, loradbm, createCloudState(), createSyncState());
    }

    private static DevStatus createDevState(String name) {
        DevData data = createDevData("GFG9390041", "-94.00");

        DevStatus devStatus = new DevStatus();
        devStatus.setApp_id(2);
        devStatus.setApp_name("郑州师范学院附属小学");
        devStatus.setGroup_id(2);
        devStatus.setGroup_name("郑州师范学院附属小学阅读中心环境大数据");
        devStatus.setHardVer("SI-EWA-SW-T1-N-L");
        devStatus.setLastTime("2020-03-16 14:06:13");
        devStatus.setName(name);
        devStatus.setOnlineTime("2020-03-14 17:40:41");
        devStatus.setRoot_group_id(2);
        devStatus.setRoot_group_name("郑州师范学院附属小学阅读中心环境大数据");
        devStatus.setSoftVer("NLS2.19.0828");
        devStatus.setStates("online");
        devStatus.setSuccess(Boolean.TRUE);
        devStatus.setData(data);
        return devStatus;
    }

    public static Map<String, DevStatus> generateDevStatusMap1() {
        Map<String, DevStatus> result = new HashMap<>();
        DevStatus devStatus = createDevState("机房门口");

        result.put("GNK9420041", devStatus);
        return result;
    }

    public static Map<String, DevStatus> generateDevStatusMap2() {
        Map<String, DevStatus> result = new HashMap<>();
        DevStatus devStatus = createDevState("过道");

        result.put("GNK9420041", devStatus);
        return result;
    }
}
