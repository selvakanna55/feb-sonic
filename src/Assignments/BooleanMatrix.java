package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        boolean isOnePresent = false;
        int r, c;

        while (tc > 0) {
            String arr1[] = sc.nextLine().split(" ");
            r = Integer.parseInt(arr1[0]);
            c = Integer.parseInt(arr1[1]);

            String allOnes = "", allZeros = "";
            for (int i = 0; i < c; i++) {
                allOnes += "1 ";
                allZeros += "0 ";
            }

            for (int i = 0; i < r; i++) {
                String line = sc.nextLine();
                if (line.indexOf('1') == -1) { // -1 -> 1 not present
                    System.out.println(allZeros);
                } else {
                    System.out.println(allOnes);
                }
            }
            tc--;
        }
    }
}