package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.increaseStation();

        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationAfterNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationAfterTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationAfterEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.increaseStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.decreaseStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStationAfterZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStationBeforeZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.decreaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setupStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSwitchCurrentStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.setupStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSwitchCurrentStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setupStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchCurrentStationUpperLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setupStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchCurrentStationLowerLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setupStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeUpperLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeOnBoundaryValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}