public class A1_HowToMove extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.isTrail = true;
        plane.pausetime = 2;


        for (int x = 0; x < 4; x = x + 1) {
            plane.teleport(x * 200, 700);
            boat();
        }
        for (int x = 0; x < 4; x = x + 1) {
            plane.teleport(x * 200, 100);
            star();

        }
        for (int x = 0; x < 4; x = x + 1) {
            plane.teleport(x * 200, 500);
            house();
        }


    }

    public void boat() {
        plane.startingAngle(45);
        plane.isTrail = true;
        plane.trailWidth = 15;
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(135);
        plane.move(100);
        plane.turn(-90);
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(270);
        plane.move(135);


    }

    public void star() {
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.turn(216);
        plane.move(100);
        plane.turn(216);
        plane.move(100);
        plane.turn(216);
        plane.move(100);
        plane.turn(216);
        plane.move(100);
        plane.turn(216);
        plane.move(100);
    }

    public void house() {
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.startingAngle(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(45);
        plane.move(80);
        plane.turn(90);
        plane.move(70);


    }

}









