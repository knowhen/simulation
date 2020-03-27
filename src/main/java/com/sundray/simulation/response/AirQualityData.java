package com.sundray.simulation.response;

/**
 * @author: when
 * @create: 2020-03-27  12:19
 **/
public class AirQualityData extends DevData {
    private String CO2;
    private String HCHO;
    private String PM2_5;
    private String VOC;

    public AirQualityData() {
    }

    public AirQualityData(String CO2, String HCHO, String PM2_5, String VOC) {
        this.CO2 = CO2;
        this.HCHO = HCHO;
        this.PM2_5 = PM2_5;
        this.VOC = VOC;
    }

    public String getCO2() {
        return CO2;
    }

    public void setCO2(String CO2) {
        this.CO2 = CO2;
    }

    public String getHCHO() {
        return HCHO;
    }

    public void setHCHO(String HCHO) {
        this.HCHO = HCHO;
    }

    public String getPM2_5() {
        return PM2_5;
    }

    public void setPM2_5(String PM2_5) {
        this.PM2_5 = PM2_5;
    }

    public String getVOC() {
        return VOC;
    }

    public void setVOC(String VOC) {
        this.VOC = VOC;
    }
}
