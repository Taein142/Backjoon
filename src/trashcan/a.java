package trashcan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] schedule = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            schedule[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - 1; i++) {
            if (schedule[i] == schedule[i + 1]) {
                int temp = findDifferentValue(schedule, i);
                swap(schedule, i + 1, temp);
            }
        }

        boolean result = checkConsecutiveWork(schedule);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int findDifferentValue(int[] arr, int idx) {
        int valueToFind = arr[idx];
        for (int i = idx + 2; i < arr.length; i++) {
            if (i < arr.length && arr[i] != valueToFind) {
                return i;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private static boolean checkConsecutiveWork(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}