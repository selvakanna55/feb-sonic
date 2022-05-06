package Assignments;


import java.util.Scanner;

class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(input);

        int change = 0, notChange = 0, expected = 0;
        // String ="0";
        for (int i = 0; i < n; i++) {
            String num[] = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                expected = (i + j) % 2;
                if (Integer.parseInt(num[j]) == expected) notChange++;
                else change++;
            }
        }
        System.out.println(Math.min(change, notChange));
    }
}