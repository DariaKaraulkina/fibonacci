/*Домашнее задание
1.У нас есть метод, который выводит в консоль последовательность Фибоначчи, ограничивая её числом, значение которого
мы подаём на вход метода.
Нужно переписать существующий метод (либо написать новый на базе прежнего), который будет делать то же самое,
но только ограничивать выводимую последовательность нужно не максимальным значением числа, а количеством чисел в
последовательности. Т.е. на вход нужно подавать целое число, которое будет говорить СКОЛЬКО всего чисел последовательности
Фибоначчи нужно вывести в консоль.
2.На базе последней реализации метода создать новый или исправить существующий метод, также принимающий на вход кол-во
элементов последовательности, которую нам нужно вывести в консоль. Но новый метод должен возвращать эту самую
последовательность Фибоначчи в виде массива целых чисел. Т.е. задание остаётся аналогичным заданию в п1 за той разницей,
что метод теперь должен возвращать массив целых чисел. */
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        fibonacci1pro(6);
    }

    public static void fibonacci0(int maxNumber) { //исходный метод
        int n0 = 1;
        int n1 = 1;
        int n2;
        while (n0 + n1 <= maxNumber) {
            System.out.println(n0 + " " + n1 + " ");
            n2 = n0 + n1;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
    public static void fibonacci1(int maxNumber) { //более наглядная реализация
        int n0 = 1;
        int n1 = 1;
        int n2;
        int[] myArray = new int[maxNumber];
        int i;
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.print(n0 + " " + n1 + " ");
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
    public static void fibonacci1pro(int maxNumber) { //финальная реализация
        int n0 = 1;
        int n1 = 1;
        int n2;
        int[] myArray = new int[maxNumber];
        int i;
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}

