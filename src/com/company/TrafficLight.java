package com.company;

public class TrafficLight {

    public TrafficLight() {//DET HER ER DET ENESTE DER FOR DET TIL AT VIRKE INDTIL VIDERE
    }

    private enum trafficLightColor{
        RED,
        YELLOW,
        GREEN,
    }
    public trafficLightColor oneColor;

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
    }
    trafficLightColor timeToStop = trafficLightColor.RED;
    trafficLightColor timeToDecide = trafficLightColor.YELLOW;
    trafficLightColor timeToWalk = trafficLightColor.GREEN;

}
