package com.example.a2019_ncov;

import java.util.List;

public class Bean {

    /**
     * provinceName : 湖北省
     * provinceShortName : 湖北
     * confirmedCount : 1423
     * suspectedCount : 0
     * curedCount : 44
     * deadCount : 76
     * comment :
     * cities : [{"cityName":"武汉","confirmedCount":698,"suspectedCount":0,"curedCount":42,"deadCount":63},{"cityName":"黄冈","confirmedCount":154,"suspectedCount":0,"curedCount":2,"deadCount":4},{"cityName":"孝感","confirmedCount":100,"suspectedCount":0,"curedCount":0,"deadCount":1},{"cityName":"荆门","confirmedCount":90,"suspectedCount":0,"curedCount":0,"deadCount":3},{"cityName":"咸宁","confirmedCount":64,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"随州","confirmedCount":52,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"荆州","confirmedCount":47,"suspectedCount":0,"curedCount":0,"deadCount":2},{"cityName":"十堰","confirmedCount":40,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"黄石","confirmedCount":36,"suspectedCount":0,"curedCount":0,"deadCount":1},{"cityName":"襄阳","confirmedCount":36,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"宜昌","confirmedCount":31,"suspectedCount":0,"curedCount":0,"deadCount":1},{"cityName":"恩施州","confirmedCount":25,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"鄂州","confirmedCount":20,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"天门","confirmedCount":13,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"仙桃","confirmedCount":12,"suspectedCount":0,"curedCount":0,"deadCount":0},{"cityName":"潜江","confirmedCount":5,"suspectedCount":0,"curedCount":0,"deadCount":1}]
     */

    private String provinceName;
    private String provinceShortName;
    private int confirmedCount;
    private int suspectedCount;
    private int curedCount;
    private int deadCount;
    private String comment;
    private List<CitiesBean> cities;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceShortName() {
        return provinceShortName;
    }

    public void setProvinceShortName(String provinceShortName) {
        this.provinceShortName = provinceShortName;
    }

    public int getConfirmedCount() {
        return confirmedCount;
    }

    public void setConfirmedCount(int confirmedCount) {
        this.confirmedCount = confirmedCount;
    }

    public int getSuspectedCount() {
        return suspectedCount;
    }

    public void setSuspectedCount(int suspectedCount) {
        this.suspectedCount = suspectedCount;
    }

    public int getCuredCount() {
        return curedCount;
    }

    public void setCuredCount(int curedCount) {
        this.curedCount = curedCount;
    }

    public int getDeadCount() {
        return deadCount;
    }

    public void setDeadCount(int deadCount) {
        this.deadCount = deadCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<CitiesBean> getCities() {
        return cities;
    }

    public void setCities(List<CitiesBean> cities) {
        this.cities = cities;
    }

    public static class CitiesBean {
        /**
         * cityName : 武汉
         * confirmedCount : 698
         * suspectedCount : 0
         * curedCount : 42
         * deadCount : 63
         */

        private String cityName;
        private int confirmedCount;
        private int suspectedCount;
        private int curedCount;
        private int deadCount;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public int getConfirmedCount() {
            return confirmedCount;
        }

        public void setConfirmedCount(int confirmedCount) {
            this.confirmedCount = confirmedCount;
        }

        public int getSuspectedCount() {
            return suspectedCount;
        }

        public void setSuspectedCount(int suspectedCount) {
            this.suspectedCount = suspectedCount;
        }

        public int getCuredCount() {
            return curedCount;
        }

        public void setCuredCount(int curedCount) {
            this.curedCount = curedCount;
        }

        public int getDeadCount() {
            return deadCount;
        }

        public void setDeadCount(int deadCount) {
            this.deadCount = deadCount;
        }
    }
}
