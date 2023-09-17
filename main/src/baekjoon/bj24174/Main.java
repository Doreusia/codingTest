package baekjoon.bj24174;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        heapSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        buildMinHeap(arr, n);

        for (int i = n - 1; i > 0; i--) {
            // 가장 작은 값을 배열 끝으로 이동
            swap(arr, 0, i);
            // 힙 크기를 줄이고 최소 힙 성질을 복원
            heapify(arr, 0, i);
        }
    }

    public static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    public static void heapify(int[] arr, int k, int n) {
        int left = 2 * k + 1;
        int right = 2 * k + 2;
        int smallest = k;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != k) {
            swap(arr, k, smallest);
            heapify(arr, smallest, n);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
