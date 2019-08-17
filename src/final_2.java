import java.util.Arrays;
import java.util.Scanner;

public class final_2 {

    public static void main(String[] args) {
int i = 0;

        Scanner in = new Scanner(System.in);             // производим запись значений в массив

        System.out.print("Задайте размер массива: ");
        int len = in.nextInt();

        int massive[] = new int[len];
        int mas_temp[] = new int[len];


        System.out.println("Введите значения массива:");

        do {
            massive[i] = in.nextInt();
            i++;
        }
        while (i < len);


        int tmp;
        int min;

// алгоритм сортировки прямого выбора

        for (int j = 0; j < massive.length-1; j++){
            min = j;
            for (int e = j+1; e < massive.length; e++){
                if (massive[e] < massive[min])
                    min = e;
            }

            tmp = massive[min];

            massive[min] = massive[j];
            massive[j] = tmp;
        }
        System.out.println(Arrays.toString(massive));
    }
}