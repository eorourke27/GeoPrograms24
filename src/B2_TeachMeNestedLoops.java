public class B2_TeachMeNestedLoops extends World {

   public void go() {
      System.out.println("This will be printed to the  window. ");
      plane.teleport(0, 0);
      plane.pausetime = 1;


// backrounds are below

      for (int y = 10; y < 300; y = y + 1) {
         for (int x = 0; x < 1000; x = x + 1) {
            plane.teleport(x, y);
            plane.setPixelColor(255, x / 4, y / 4);
            System.out.println("Pixel (" + x + ", " + y + ") has r: " + 200 + ", g: " + (x / 4) + ", b: " + (y / 3));
         }
      }
      for (int y = 300; y < 600; y = y + 1) {
         for (int x = 0; x < 1000; x = x + 1) {
            plane.teleport(x, y);
            plane.setPixelColor(0, 100, 0);
            if (plane.random(0,10)<2){
               plane.setPixelColor(0,0,0);
            }
            System.out.println("Pixel (" + x + ", " + y + ") has r: " + 200 + ", g: " + (x / 4) + ", b: " + (y / 3));
         }
      }
      for (int y = 600; y < 900; y = y + 1) {
         for (int x = 0; x < 1000; x = x + 1) {
            plane.teleport(x, y);
            plane.setPixelColor(0, 0, 100);
            if (plane.random(0,10)<2){
               plane.setPixelColor(22,22,22);
            }
            System.out.println("Pixel (" + x + ", " + y + ") has r: " + 200 + ", g: " + (x / 4) + ", b: " + (y / 3));
         }
      }

      // location of shapes are below


      for (int x = 0; x < 5; x = x + 1) {
         plane.teleport(x * 200, 600);
         boat();
      }
      for (int x = 0; x < 5; x = x + 1) {
         plane.teleport(x * 200, 90);
         star();

      }
      for (int x = 0; x < 5; x = x + 1) {
         plane.teleport(x * 200, 300);
         house();
      }
      for (int x = 0; x < 35; x = x + 1) {
         plane.teleport(x * 50, 750);
         waves();
      }

   }

   // dimensions of shape are bellow
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
      public void waves() {
      plane.setColor(plane.random(0, 100), plane.random(0, 100), plane.random(0, 255));
      plane.startingAngle(0);
      plane.move(20);
      plane.turn(20);
      plane.move(20);
      plane.turn(30);
      plane.move(20);
      plane.turn(30);
      plane.move(20);
      plane.turn(-30);
      plane.move(20);
      plane.turn(-30);
      plane.move(20);
      plane.turn(-30);
      plane.move(20);


      }
}

