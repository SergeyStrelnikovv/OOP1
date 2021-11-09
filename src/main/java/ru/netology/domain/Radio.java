package ru.netology.domain;

public class Radio {
    private int currentStation;

    public void setNextStation(int currentStation) {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

    public int getNextStation() {
        return currentStation;
    }

    public void setPreviousStation(int currentStation) {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            this.currentStation = 9;
        }
    }

    public int getPreviousStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    private int currentVolume;

    public void increaseVolume(int currentVolume){
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10){
            return;
        }
    }

    public int getIncreaseVolume(){
        return currentVolume;
    }

    public void decreaseVolume(int currentVolume){
        if(currentVolume > 0){
            this.currentVolume=currentVolume - 1;
        }
        if(currentVolume <0){
            return;
        }
    }
    public int getDecreaseVolume(){
        return currentVolume;
    }

}
