package com.springcore;

public class Airtel {
    private Service simService;

    public void setSimService(Service simService) {
        this.simService = simService;
    }

    public void activateService(){
        simService.service();
    }
}
