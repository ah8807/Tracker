package com.example.tracker;

public class Tracker {
    private int study;
    private int guitar;
    private int exercise;

    public void resetTracker(){
        study=0;
        guitar=0;
        exercise=0;
    }
    public void incStudy(){
        if(study<=11)
            study++;
    }
    public void decStudy(){
        if(study>0)
            study--;
    }
    public void incGuitar(){
        if(guitar==0)
            guitar++;
    }
    public void decGuitar(){
        if(guitar==1)
            guitar--;
    }
    public void incExercise(){
        if(exercise==0)
            exercise++;
    }
    public void decExercise(){
        if(exercise==1)
            exercise--;
    }

    public int getStudy() {
        return study;
    }

    public int getGuitar() {
        return guitar;
    }

    public int getExercise() {
        return exercise;
    }
}
