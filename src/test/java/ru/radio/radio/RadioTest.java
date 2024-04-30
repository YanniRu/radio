package ru.radio.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
<<<<<<< Updated upstream
    public void choiceStation() {
        Radio radio = new Radio();
=======
    public void choiceStation() { // Выбор станции
>>>>>>> Stashed changes

        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
<<<<<<< Updated upstream
    public void SwitchStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchStationOnMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSwitchStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
=======
    public void nextStation() {  // след станция
        radio.setCurrentStation(5);
>>>>>>> Stashed changes
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
<<<<<<< Updated upstream
    public void prevSwitchStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
=======
    public void nextStationAboveMax() { // переключение свыше макс
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationOnMax() { // переключение с макс станции
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void prevStation() { // пред станция
        radio.setCurrentStation(5);
>>>>>>> Stashed changes
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
<<<<<<< Updated upstream
=======
    public void prevStationUnderMin() { // переключение ниже мин
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStationUnderMin2() { // переключение ниже мин 2
        radio.setCurrentStation(-1);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void choiceVolume() { // выбор звука
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(3);
        assertEquals(3, radio.getCurrentVolume());
    }
    @Test
>>>>>>> Stashed changes
    public void increaseVolume() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }
    @Test
    public void choiceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
<<<<<<< Updated upstream


=======
    @Test
    public void increaseVolumeAboveMax2() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
>>>>>>> Stashed changes
    @Test
    public void decreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
    @Test
    public void decreaseVolumeUnderMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
<<<<<<< Updated upstream
}
=======
    @Test
    public void decreaseVolumeUnderMin2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
>>>>>>> Stashed changes
