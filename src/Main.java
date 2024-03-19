public class Main {
    public static void main(String[] args) {

        int [] array = {2, 9, 3, 1, 5, 6, 4};

        int minElement = findMinElement(array);
        System.out.println("The minimum array element: " + minElement);

        int sumBetweenPositive = sumBetweenFirstAndLastPositive(array);
        System.out.println("The sum of array elements between the first and last positive elements: " + sumBetweenPositive);

        transformArray(array);


        // Виводимо результат
        System.out.println("Масив після перетворення:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sumBetweenFirstAndLastPositive(int[] arr) {
        int firstPositiveIndex = -1;
        int lastPositiveIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                firstPositiveIndex = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                lastPositiveIndex = i;
                break;
            }
        }

        int sum = 0;
        if (firstPositiveIndex != -1 && lastPositiveIndex != -1) {
            for (int i = firstPositiveIndex + 1; i < lastPositiveIndex; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void transformArray(int[] arr) {
        int zeroCount = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        int index = 0;
        for (int i = 0; i < zeroCount; i++) {
            arr[index++] = 0;
        }
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
    }
}