import java.util.Scanner;

public class work1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Введите количество чисел в массиве:");
        n = scan.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i){
            System.out.println("Введиете число");
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        float avg = (float)sum / n;
        System.out.println("Сумма всех чисел в массиве: " + sum);
        System.out.println("Среднее арифметическое всех чисел в массиве: " + avg);
    }
}
