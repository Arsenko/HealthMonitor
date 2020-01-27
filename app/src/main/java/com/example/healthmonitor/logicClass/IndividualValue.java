package com.example.healthmonitor.logicClass;

public class IndividualValues {
    int upperPressure;
    int lowerPressure;
    int pulse;
    boolean tacihordia;
    int steps;
    public IndividualValues(int upperPressure,int lowerPressure,int pulse,boolean tachihordia,
                            int steps){
        this.upperPressure=upperPressure;
        this.lowerPressure=lowerPressure;
        this.pulse=pulse;
        this.tacihordia=tachihordia;
        this.steps=steps;
    }
}
