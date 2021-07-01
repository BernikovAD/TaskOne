import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


public class TaskFour {
    /*    Напишите алгоритм подсчета суммы всех элементов в массиве, за
        исключением минимальных и максимальных элементов. Необходимо сделать
        сложность алгоритма линейной. Желательно минимизировать потребление памяти.
        Например в массиве { 1, 3, 4, 2, 6, 5 } суммой будет 3+4+2+5 = 14
        Сигнатура метода: public int sum(int[] array) {...*/
    public static void main(String[] args) {
        int[] array1 = {3, 5, 7, 12};  //12
        int[] array2 = {1, 3, 4, 2, 6, 5};  //14
        int[] array3 = {6, 7, 88, -1, 6, 5}; // 24
        int[] array4 = {1}; // 13
        System.out.println (sum(array1));
        System.out.println (sum(array2));
        System.out.println (sum(array3));
        System.out.println (sum(array4));
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }
        result = result  - Arrays.stream(array).min().getAsInt()- Arrays.stream(array).max().getAsInt();
        //System.out.printf("Массив: %s Max элемент = %d Min элемент:= %d Сумма:= %d \n", Arrays.toString(array),max,min,result);
        return  result;
    }

}
