package com.company;

/*Yak, (Bos grunniens), long-haired, short-legged oxlike mammal found throughout the Himalayan region
 that was probably domesticated in Tibet but has been introduced wherever there are people at elevations
 of 4,000–6,000 metres (14,000–20,000 feet), mainly i in Central Asia, Mongolia, and Nepal.


Yak have many characteristics and attributes that must be regarded as adaptations to many factors:
 extreme cold; high altitude with low oxygen content of the air and high solar radiation;
 difficult, often treacherous terrain; and cyclical nutrition with short growing seasons for grazing herbage
as well as a variety of herbage. In general, temperature is the single most important factor determining the distribution, stocking density
 and, indirectly, the growth rate of yak. Yak survive and perform adequately if the annual mean temperature is below 41 F
 and the average in the hottest month is not above 55 F
They can also survive satisfactorily at ambient temperatures down to - 40 F
*/

import java.lang.*;

interface Animal {
    public String getAnimaType();
    public int getIdTag();
    public void setIdTag(int anIdTag);
    public int getMinTemperatur();
    public int getMaxTemperatur();

}


public class Main {

    public  static void main(String[] args) {

        int anIdTag, minTemperature, maxTemperature;

        yak coldie = new yak();
        anIdTag = coldie.getIdTag();
        coldie.setIdTag(anIdTag);
        minTemperature = coldie.getMinTemperature();
        maxTemperature = coldie.getMaxTemperature();
        System.out.println(" Coldie Basic Information");
        System.out.println(" Animal Type        : " + coldie.getAnimalType());
        System.out.println(" ID Tag             : " + anIdTag);
        System.out.println(" Minimum Temperature: " + minTemperature + " F");
        System.out.println(" Maximum Temperature: " + maxTemperature + " F");
    }
}


