package main.java;

public class Argyle {
    
    public static void main(String[] args) {
        weave(argyle(11,11));
    }

    public static void weave(String[][] rug) {
        // Method to print 2D emoji!
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j]);
            }
            // Break line at end of every row.
            System.out.println("");
        }
    }
    public static String[][] argyle(int width, int height) {
        String[][] rug = new String[width][height];
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                String emoji;
                if (((i - j) % 5 == 0) || ((i + j) % 5 == 0)) {
                    emoji = "🥕";
                } else {
                    emoji = "💻";
                }
                rug[i][j] = emoji;
            }
        }
        return rug;
  }
}
 


