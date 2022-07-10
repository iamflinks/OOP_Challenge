package com.iamflinks.oopchallenge;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String medicalCondition, String actions, int heartRate) {
        super(name, medicalCondition, actions);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String changeHeartRate(int heartRate) {
        // Set the heart rate
        setHeartRate(heartRate);
        return "Heart rate was changed to: " + heartRate;
    }
}
