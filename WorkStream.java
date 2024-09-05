import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

// Задание:
// [x] Напишите удаление всех повторяющихся элементов из списка
// [x] Напишите подсчет количества строк в списке, которые начинаются с определенной буквы
// [x] Используя оператор findFirst напишите поиск второго по величине элемента в списке целых чисел

public class WorkStream {
    public static void main(String[] args) {

        NumberOne();
        System.out.println("++++++++++++++++");
        NumberTwo();
        System.out.println("++++++++++++++++");
        NumberThree();
        System.out.println("++++++++++++++++");
    
    }

        private static void NumberOne() {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 6, 8, 1, 4, 5, 5, 6, 7, 8);                
                System.out.println("С дубликатами: " + list);

            List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
                System.out.println("Без дубликатов: " + newlist);
        }
        
        private static void NumberTwo() {
            List<String> names = Arrays.asList("Vanya", "Petya", "Vasiliy", "Vitaliy", "Igor", "Ivan");
                System.out.println(names);
            
            char startLetter = 'V';
            long result = names.stream().filter(e -> e.startsWith(String.valueOf(startLetter))).count();
                System.out.println("Строки начинающиеся на букву V : " + result);
        }

        private static void NumberThree() {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 6, 8, 1, 4, 5, 5, 6, 7, 8); 
            int result = list.stream().distinct().sorted(Comparator.reverseOrder())
                .limit(2).skip(1).findFirst().get();
                System.out.println("Второй по величине число: " + result);
        }
    }
 

