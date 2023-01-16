import java.util.*;

import static java.util.Arrays.deepToString;

//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//Избавиться от повторяющихся элементов в строке.
//Вывести результат на экран.
public class Task_Stroka {
    public static void main(String[] args) {
        String text = "1, 2, 3, 4, 4, 5, 5, 5, 6, 7";
        String[] words = text.split(", ");
        System.out.println(deepToString(words));
        HashSet<String>set=new HashSet<>(List.of(words));
        System.out.println(set);






//        String[] words = text.split(", ");
//        System.out.println(Arrays.toString(words));
//        System.out.println(words.length);
//        List<String> list = Arrays.asList(words);
//        Set<String> set = new HashSet<>(list);
//
//        System.out.println(set);
    }
}
