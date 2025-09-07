public class RandomStats {

    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000; // Generates 1000 to 9999
        }
        return arr;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = sum / (double) numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        RandomStats rs = new RandomStats();
        int[] randomNumbers = rs.generate4DigitRandomArray(5);
        System.out.print("Random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        double[] stats = rs.findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f\nMin: %.0f\nMax: %.0f\n", stats[0], stats[1], stats[2]);
    }
}