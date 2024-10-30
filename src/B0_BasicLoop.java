public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.pausetime = 1;
        plane.teleport(10, 100);


        for (int x = 0; x < 50; x = x + 5) {
            System.out.print("x: " + x);


        }
    }
    public void star(int size){
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.turn(216);
        plane.move(size);
        plane.turn(216);
        plane.move(size);
        plane.turn(216);
        plane.move(size);
        plane.turn(216);
        plane.move(size);
        plane.turn(216);
        plane.move(size);
    }



    }