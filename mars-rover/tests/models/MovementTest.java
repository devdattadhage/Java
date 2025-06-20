package models;

import org.junit.jupiter.api.Test;

import static models.Directions.*;
import static org.junit.jupiter.api.Assertions.*;

class MovementTest {
    @Test
    void move() {
        Movement movement = new Movement(0, 0, N);
        assertEquals(1, movement.move());
        assertEquals(2, movement.move());
    }

    @Test
    void turnLeft() {
        Movement movement = new Movement(0, 0, N);
        assertEquals(Directions.W, movement.turnLeft());
        assertEquals(Directions.S, movement.turnLeft());
    }

    @Test
    void turnRight() {
        Movement movement = new Movement(0, 0, N);
        assertEquals(Directions.E, movement.turnRight());
    }

    @Test
    void getCurrentCoordinates() {
        Movement movement = new Movement(1, 1, N);
        assertEquals("x: 1 y: 1", movement.getCurrentCoordinates());
    }

    @Test
    void getDirection() {
        Movement movement = new Movement(1, 1, N);
        assertEquals(N, movement.getDirection());
    }
}