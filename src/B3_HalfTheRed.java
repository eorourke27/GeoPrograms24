public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    // int: thing that holds (integer)
    public int green;

    public void go() {
        plane.loadBackGround("CharlieBrown.png");
        plane.showBackGround();

        for (int y = 1; y < 100; y = y + 1) {
            for (int x = 1; x < 1000; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red<10&&green<10&&blue<10){
                    plane.setPixelColor(red , green*2, blue/3);
                    plane.setPixelColor(222 , 0, 0);

                    System.out.println(x);

                }

            }
        }
        for (int y =  350; y < 363; y = y + 1) {
            for (int x = 620; x < 680; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 20 && green < 10 && blue < 20) {
                    plane.setPixelColor(red / 3, green * 2, blue); 
                }

            }

        }
    }
}

//if (red<10&&green<10&&blue<10){
//                plane.setPixelColor(red / 3, green*2, blue);
//                }
