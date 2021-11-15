package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;



    public void increaseStation() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            this.currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            this.currentStation = 9;
        }
    }

    public void setupStation() {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void increaseVolume(){
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10){
            currentVolume = 0;
        }
    }


    public void decreaseVolume(){
        if(currentVolume > 0){
            this.currentVolume=currentVolume - 1;
        }
        if(currentVolume <0){
            return;
        }
    }
    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

}
