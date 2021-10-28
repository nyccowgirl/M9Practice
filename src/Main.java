public class Main {

    public static void main(String[] args) {
        String[] stringArrayList = {"Hello", "World", "Bonjour", "Mode", "Hola", "Mundo"};
        String stringBenchmark = "howdy";
        printEveryOther(stringArrayList);
        System.out.println("Number of items in list greater than " + stringBenchmark + ": " +
                countGreaterThan(stringArrayList, stringBenchmark));

        Integer[] integerArrayList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer integerBenchmark = 5;
        printEveryOther(integerArrayList);
        System.out.println("Number of items in list greater than " + integerBenchmark + ": " +
                countGreaterThan(integerArrayList, integerBenchmark));
    }

    public static <T> void printEveryOther(T[] list) {
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                System.out.println(list[i]);
            }
        }
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T benchmark) {
        int count = 0;

        for (T item : list) {
            if (item instanceof String) {
                if (((String) item).compareToIgnoreCase((String) benchmark) > 0) {
                    count++;
                }

            } else {
                if (item.compareTo(benchmark) > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
