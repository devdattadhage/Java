import models.Directions;
import models.Movement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rover = sc.nextLine();
        String instructions = sc.nextLine();

        Movement movement = deployRover(rover, instructions);
        System.out.printf("%s Direction: %s",movement.getCurrentCoordinates(), movement.getDirection());
    } 

    private static Movement deployRover(String rover, String instructions) {
        String[] coordinates = rover.split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        Movement movement = new Movement(x, y, Directions.valueOf(coordinates[2]));

        for (int i = 0; i < instructions.length(); i++) {
            switch (instructions.charAt(i)) {
                case 'M':
                    movement.move();
                    break;
                case 'L':
                    movement.turnLeft();
                    break;
                case 'R':
                    movement.turnRight();
                    break;
                default:
                    System.out.println("Invalid Instruction");
            }
        }

        return movement;
    }
}