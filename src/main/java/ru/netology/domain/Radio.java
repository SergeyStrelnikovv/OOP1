package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int setToMaxStation() {
        currentStation = 9;
        return 0;
    }

    public int setToMinStation() {
        currentStation = 0;
        return 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    // Работа с радиостанциями:
    public void nextTransferStation(int currentStation) {
        if (currentStation == 9) {
            currentStation = setToMinStation();
            return;
        }
        currentStation++;

        this.currentStation = currentStation;

    } //Переключаем на +1 станцию

    public void prevCurrentStation(int currentStation) {
        if (currentStation == 0) {
            currentStation = setToMaxStation();
            return;
        }
        currentStation--;

        this.currentStation = currentStation;
    } //Переключаем на -1 станцию

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    } //Устанавливаем конкретную станцию

    // Работа с уровнем громкости звука:
    public void IncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume++;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    } //Прибавляем уровень звука

    public void DecreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume--;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    } //Уменьшаем уровень звука

}
