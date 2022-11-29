package com.example.myapplication;

public class Apps{
    String apps,des;
    String password = "helloWorld";
    public Apps(int position) {

    }

    public Apps(String apps, String des) {
        this.apps = apps;
        this.des = des;
    }
    public String getApps() {

        return apps;
    }

    public void setApps(String apps) {

        this.apps = apps;
    }

    public String getDes() {

        return des;
    }

    public void setDes(String des) {

        this.des = des;
    }
}
