package com.ua.task2;

public class Iron implements Substance {
    private State state = State.SOLID;
    private double temperature = 20;


    private static final double crystallization = 1538;
    private static final double gaseous = 2862;

    @Override
    public State heatUp(double t) {
        temperature = temperature + t;
        System.out.println("Current temperature = " + temperature);
        if (temperature <= crystallization) {
            state = State.SOLID;
            return State.SOLID;
        } else if (temperature > crystallization && temperature < gaseous) {
            state = State.LIQUID;
            return State.LIQUID;
        } else {
            state = State.GASEOUS;
            return State.GASEOUS;
        }
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public State getState() {
        return state;
    }
}
