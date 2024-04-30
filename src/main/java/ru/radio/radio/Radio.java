package ru.radio.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            setCurrentStation(currentStation + 1);
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            setCurrentStation(currentStation - 1);
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }
        currentVolume = volume;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        }
    }
    public void decreaseVolume() {

        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}



