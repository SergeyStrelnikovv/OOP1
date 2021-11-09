package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setNextStation(2);

        int expected = 3;
        int actual = radio.getNextStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationAfterNine() {
        Radio radio = new Radio();
        radio.setNextStation(9);

        int expected = 0;
        int actual = radio.getNextStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationAfterTen() {
        Radio radio = new Radio();
        radio.setNextStation(10);

        int expected = 0;
        int actual = radio.getNextStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationAfterEight() {
        Radio radio = new Radio();
        radio.setNextStation(8);

        int expected = 9;
        int actual = radio.getNextStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStation() {
        Radio radio = new Radio();
        radio.setPreviousStation(2);

        int expected = 1;
        int actual = radio.getPreviousStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStationAfterZero() {
        Radio radio = new Radio();
        radio.setPreviousStation(-1);

        int expected = 9;
        int actual = radio.getPreviousStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStationBeforeZero() {
        Radio radio = new Radio();
        radio.setPreviousStation(1);

        int expected = 0;
        int actual = radio.getPreviousStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPreviousStationZero() {
        Radio radio = new Radio();
        radio.setPreviousStation(0);

        int expected = 9;
        int actual = radio.getPreviousStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSwitchCurrentStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSwitchCurrentStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchCurrentStationUpperLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchCurrentStationLowerLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume(5);

        int expected = 6;
        int actual = radio.getIncreaseVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeOverLimit() {
        Radio radio = new Radio();
        radio.increaseVolume(11);

        int expected = 0;
        int actual = radio.getIncreaseVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeUpperLimitValue() {
        Radio radio = new Radio();
        radio.increaseVolume(10);

        int expected = 0;
        int actual = radio.getIncreaseVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume(5);

        int expected = 4;
        int actual = radio.getDecreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeOnBoundaryValue() {
        Radio radio = new Radio();
        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getDecreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.decreaseVolume(-1);

        int expected = 0;
        int actual = radio.getDecreaseVolume();
        assertEquals(expected, actual);
    }

}