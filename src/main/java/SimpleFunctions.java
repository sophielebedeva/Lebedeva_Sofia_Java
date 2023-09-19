
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class SimpleFunctions {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        isNumberMoreThanSeven();
        isNameVyacheslav();
        isArrayMultipleBy3();
    }

    /* Задание 1 */
    public static void isNumberMoreThanSeven() {
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    /* Задание 2 */
    public static void isNameVyacheslav() {
        scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        if (Objects.equals(name, "Вячеслав")) {
            System.out.printf("Привет, %s\n", name);

        } else {
            System.out.println("Нет такого имени");
        }
    }

    /* Задание 3 */
    public static void isArrayMultipleBy3() {
        System.out.println("Введите значения для массива через пробел:");
        String userArray = scanner.nextLine();
        String[] stringArray = userArray.split(" ");
        int[] intArray = Arrays.stream(stringArray)
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int number : intArray) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}


/* Задание 4 */
   /*   [((())()(())]] эту последовательность скобок нельзя считать правильной, потому что в ней
   есть предпоследняя квадратная закрывающая скобка для которой нет пары (открывающей квадратной скобки).
   Чтобы последовательность стала правильной необходимо либо добавить открывающую квадратную скобку в
   начало последовательности, либо удалить последнюю/предпоследнюю закрывающую квадратную скобку
    */




