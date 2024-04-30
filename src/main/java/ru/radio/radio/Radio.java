package ru.radio.radio;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
<<<<<<< Updated upstream
        if (newCurrentStation >= 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation >= 9) {
            setCurrentStation(0);
=======
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (maxStation <= currentStation) {
            setCurrentStation(minStation);
>>>>>>> Stashed changes
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
<<<<<<< Updated upstream
        if (currentStation <= 0) {
            setCurrentStation(9);
=======
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
>>>>>>> Stashed changes
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
<<<<<<< Updated upstream

        if (currentVolume < 100) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
=======
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
>>>>>>> Stashed changes

    public void decreaseVolume() {
        if (currentVolume > 0) {
<<<<<<< Updated upstream
            currentVolume--;
=======
            currentVolume = currentVolume - 1;
>>>>>>> Stashed changes
        }
    }
}



