import java.util.Arrays;


public class TaskFour {
    /*    Напишите алгоритм подсчета суммы всех элементов в массиве, за
        исключением минимальных и максимальных элементов. Необходимо сделать
        сложность алгоритма линейной. Желательно минимизировать потребление памяти.
        Например в массиве { 1, 3, 4, 2, 6, 5 } суммой будет 3+4+2+5 = 14
        Сигнатура метода: public int sum(int[] array) {...*/
    public static void main(String[] args) {
        int array1[] = {3, 5, 7, 12};  //12
        int array2[] = {1, 3, 4, 2, 6, 5};  //14
        int array3[] = {6, 7, 88, -1, 6, 5}; // 24
        int array4[] = {1, 0, 85, 7, 5}; // 13
        sum(array1);
        sum(array2);
        sum(array3);
        sum(array4);
    }

    public static int sum(int[] array) {
        int result = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max (max, array[i]);
            min = Math.min (min, array[i]);
            result = result + array[i];
        }
        result = result - max - min;
        System.out.printf("Массив: %s Max элемент = %d Min элемент:= %d Сумма:= %d \n", Arrays.toString(array),max,min,result);
        return result;
    }

}
