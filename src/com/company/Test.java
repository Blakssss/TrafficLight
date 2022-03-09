package com.company;

public class Test {

    public static void main(String[] args) {
       TrafficLight decide = new TrafficLight();

        System.out.println(decide.timeToStop);
        System.out.println(decide.timeToDecide);
        System.out.println(decide.timeToWalk);
    }
}
