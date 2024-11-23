
import java.util.Scanner;

public class ArrayOperations {
    static final int MAX_SIZE = 10;
    static int[] arr = new int[MAX_SIZE];
    static int size = 0;

    public static void add() {
        if (size >= MAX_SIZE) {
            System.out.println("*Array is full*");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int value = scanner.nextInt();

        arr[size] = value;
        size++;
    }

    public static void delete() {
        if (size == 0) {
            System.out.println("*Underflow*");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int position = scanner.nextInt();

        if (position < 0 || position >= size) {
            System.out.println("Invalid position...");
        } else {
            for (int i = position; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Value deleted successfully.");
        }
    }

    public static void display() {
        if (size == 0) {
            System.out.println("*Underflow*");
            return;
        }
        System.out.print("Elements in the Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] arr, int size, int target) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //It will sort the array by using selection sort
    public static void sort(int[] arr, int num) {
        for (int i = 0; i < num - 1; i++) {
            int min = i;
            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("\n*Sorted Successfully*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nEnter your choice..\n1. Add\n2. Delete\n3. Display\n4. Search\n5. Sort\n6. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;

                case 2:
                    delete();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.print("Enter the element: ");
                    int target = scanner.nextInt();
                    int result = binarySearch(arr, size, target);
                    if (result != -1) {
                        System.out.println("Element " + target + " is found at index " + result);
                    } else {
                        System.out.println("Element " + target + " is not found in the array");
                    }
                    break;

                case 5:
                    sort(arr, size);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice..");
            }
        }
    }
}
