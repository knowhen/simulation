package com.sundray.simulation.util;

import com.sundray.simulation.response.DevData;
import com.sundray.simulation.response.DevStatus;
import com.sundray.simulation.response.TempHumidData;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-27  09:38
 **/
public class DevStatusFactory {
    public static Map<String, DevStatus> create(String devType) {
        Map<String, DevStatus> status;
        if (devType.equals("OneWayLoraSwitch")) {
            return generateOneWaySwitchStatus();
        } else if (devType.equals("TwoWayLoraSwitch")) {
            return generateTwoWaySwitchStatus();
        } else if (devType.equals("LoRaTempHumid")) {
            return generateTempHumidStatus();
        } else {
            return null;
        }
    }

    public static Map<String, DevStatus> generateOneWaySwitchStatus() {
        Map<String, DevStatus> status = new HashMap<>();
        DevData data1 = new DevData("GFG9390041", "-94.00", createTwoWayCloudState(), createTwoWaySyncState());
        DevData data2 = new DevData("GFG9390041", "-75.00", createTwoWayCloudState(), createTwoWaySyncState());
        DevStatus devStatus1 = createDevState("机房门口", data1);
        DevStatus devStatus2 = createDevState("过道", data2);

        status.put("GNK9420041", devStatus1);
        status.put("GNK9420116", devStatus2);

        return status;
    }

    public static Map<String, DevStatus> generateTwoWaySwitchStatus() {
        Map<String, DevStatus> status = new HashMap<>();
        DevData data1 = new DevData("GFG9390041", "-72.00", createTwoWayCloudState(), createTwoWaySyncState());
        DevData data2 = new DevData("GFG9390041", "-67.00", createTwoWayCloudState(), createTwoWaySyncState());
        DevStatus devStatus1 = createDevState("读报机上面", data1);
        DevStatus devStatus2 = createDevState("树中间", data2);

        status.put("GOK9300026", devStatus1);
        status.put("GOK9300029", devStatus2);

        return status;
    }

    private static Map<String, DevStatus> generateTempHumidStatus() {
        Map<String, DevStatus> status = new HashMap<>();
        TempHumidData data = new TempHumidData("GFG9390041", "-98.00", createTempHumidCloudState(),
                createTempHumidSyncState());
        data.setDEV_LUX("0.00");
        data.setDEV_MOISTURE("45.00");
        data.setDEV_SOC("0.00");
        data.setDEV_TEMPRATURE("18.00");
        DevStatus devStatus = createDevState("温度", data);
        status.put("GJK9292365", devStatus);

        return status;
    }

    private static DevStatus createDevState(String name, DevData data) {
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

    private static Map<String, String> createOneWayCloudState() {
        Map<String, String> cloudState = new HashMap<>();
        cloudState.put("DEV_SWITCH_STA_1", "0.00");
        return cloudState;
    }

    private static Map<String, String> createOneWaySyncState() {
        Map<String, String> syncState = new HashMap<>();
        syncState.put("DEV_SWITCH_STA_1", "");
        syncState.put("DEV_SWITCH_STA_1_BetaTime", "0");
        return syncState;
    }

    private static Map<String, String> createTwoWayCloudState() {
        Map<String, String> cloudState = new HashMap<>();
        cloudState.put("DEV_SWITCH_STA_1", "0.00");
        cloudState.put("DEV_SWITCH_STA_2", "0.00");
        return cloudState;
    }

    private static Map<String, String> createTwoWaySyncState() {
        Map<String, String> syncState = new HashMap<>();
        syncState.put("DEV_SWITCH_STA_1", "");
        syncState.put("DEV_SWITCH_STA_2", "");
        syncState.put("DEV_SWITCH_STA_1_BetaTime", "0");
        syncState.put("DEV_SWITCH_STA_2_BetaTime", "0");
        return syncState;
    }

    private static Map<String, String> createTempHumidCloudState() {
        return new HashMap<>();
    }

    private static Map<String, String> createTempHumidSyncState() {
        return new HashMap<>();
    }
}
