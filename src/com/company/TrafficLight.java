package com.company;

public class TrafficLight {

    public TrafficLight() {
    }

    private enum trafficLightColor{
        RED,
        YELLOW,
        GREEN,
    }
    trafficLightColor timeToStop = trafficLightColor.RED;
    trafficLightColor timeToDecide = trafficLightColor.YELLOW;
    trafficLightColor timeToWalk = trafficLightColor.GREEN;

    /*public trafficLightColor oneColor;

     public trafficLightColor gettraficLightColor0 (){
       return oneColor;
     }
     public trafficLightColor gettraficLightColor1 (){
        return oneColor;
     }
     public trafficLightColor gettraficLightColor2 (){
        return oneColor;
     }
     public void settrafficLightColor0(trafficLightColor light1){
         oneColor = light1;
     }
     public void settrafficLightColor1(trafficLightColor light2){
         oneColor = light2;
     }
    public void settrafficLightColor2(trafficLightColor light3){
        oneColor = light3;
    }
    public TrafficLight(trafficLightColor RED, trafficLightColor YELLOW, trafficLightColor GREEN){
        settrafficLightColor0(RED);
        settrafficLightColor1(YELLOW);
        settrafficLightColor2(GREEN);
    }
    public trafficLightColor stop (){
         return gettraficLightColor0();
    }
    public trafficLightColor decide (){
        return gettraficLightColor1();
    }
    public trafficLightColor walk (){
        return gettraficLightColor2();
    }*/

}
