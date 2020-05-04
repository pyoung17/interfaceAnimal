package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

public class yak implements Animal {
    private int idCounter =0;
    private int idTag;
    private static final int minTemperature = -40;
    private static final int maxTemperature = 55;

    public yak() {
    }

    public String getAnimalType() {
        String animalType = "Yak";
        return animalType;
    }

    @Override
    public String getAnimaType() {
        return null;
    }

    public int getIdTag() {
        var i = idCounter+1;
        return i;
    }

    public void setIdTag(int anIdTag) {
        this.idTag = anIdTag;
        idCounter = anIdTag++;
    }

    @Override
    public int getMinTemperatur() {
        return 0;
    }

    @Override
    public int getMaxTemperatur() {
        return 0;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
}

