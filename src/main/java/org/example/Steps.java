package org.example;

import java.util.Scanner;

/**
 * The main class reads the number of test cases,
 * the number of steps and the number of steps made at the same time,
 * then calculates and prints the minimum number of jumps required.
 */

public class Steps {
    /**
     * The main method reads the number of test cases,
     * the number of steps and the number of steps made at the same time,
     * then calculates and prints the minimum number of jumps required.
     * @param args No uses
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int numSteps = sc.nextInt();
            int numJump = sc.nextInt();
            int n = 1;
            if (n*numJump<numSteps){
                while (n*numJump<numSteps){
                    n++;
                }
                System.out.println(n);
            }
            else System.out.println(n);

        }
    }
}