package com.company;

public class Test {

    public static void main(String[] args) {
       TrafficLight decide = new TrafficLight();
        System.out.println(decide.stop());
        System.out.println(decide.decide());
        System.out.println(decide.walk());
        System.out.println(decide.timeToStop);
        System.out.println(decide.timeToDecide);
        System.out.println(decide.timeToWalk);
    }
}
