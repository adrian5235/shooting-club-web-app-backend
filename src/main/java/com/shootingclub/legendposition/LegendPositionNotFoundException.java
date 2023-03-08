package com.shootingclub.legendposition;

public class LegendPositionNotFoundException extends RuntimeException {

    LegendPositionNotFoundException(Integer id) {
        super("Could not find legend position " + id);
    }
}
