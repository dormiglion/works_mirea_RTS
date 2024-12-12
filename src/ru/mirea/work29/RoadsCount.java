package ru.mirea.work29;

import java.util.Scanner;

public class RoadsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int roadCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (matrix[i][j] == 1) {
                    roadCount++;
                }
            }
        }

        System.out.println(roadCount);
    }
}
