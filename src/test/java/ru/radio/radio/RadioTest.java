package ru.radio.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio(10);
    Radio radio1 = new Radio();

    @Test
    void choiceStation() {

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void nextMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextStationAboveMax() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void nextStation() {
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());
    }
    @Test
    void nextOnMaxStation1() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(4);
        radio.prevStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void prevMinStation1() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void prevMinStation2() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    void choiceVolume() {

        radio.setCurrentVolume(35);
        assertEquals(35, radio.getCurrentVolume());
    }
    @Test
    void increaseVolume() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseMaxVolume1() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseMaxVolume2() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(60);
        radio.decreaseVolume();
        assertEquals(59, radio.getCurrentVolume());
    }

    @Test
    void decreaseMinVolume1() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void decreaseMinVolume2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}

