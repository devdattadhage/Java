package com.step.batch10.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @Test
    void shouldReturnX() {
        Position position = new Position();
        assertEquals(2, position.getX(), "Never give up");
    }
}