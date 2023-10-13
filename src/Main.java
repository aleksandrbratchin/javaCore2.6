import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);
    }

    public static void task1(List<Integer> nums){
        System.out.print("Чётные числа: ");
        printEven(nums);
    }

    public static void task2(List<Integer> nums){
        System.out.print("Нечетные числа: ");
        printOdd(nums);
    }

    public static void task3(List<String> strings){
        System.out.print("Уникальные слова : ");
        printDistinct(strings);
    }

    public static void task4(List<String> strings){
        System.out.println("Количество уникальныx слов : ");
        printDistinctCount(strings);
    }

    private static void printDistinct(List<String> strings) {
        if(strings == null) {
            System.out.println();
            return;
        }
        Set<String> integers = new TreeSet<>(strings);
        integers.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }

    private static void printDistinctCount(List<String> strings) {
        if(strings == null) {
            System.out.println();
            return;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str,1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        map.forEach((s, integer) -> System.out.println(s + ": " + integer));
    }

    private static void printEven(List<Integer> nums) {
        if(nums == null) {
            System.out.println();
            return;
        }
        Set<Integer> integers = new TreeSet<>(nums);
        integers.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }

    private static void printOdd(List<Integer> nums) {
        if(nums == null) {
            System.out.println();
            return;
        }
        Set<Integer> integers = new TreeSet<>(nums);
        integers.stream()
                .filter(integer -> integer % 2 != 0)
                .forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }



}