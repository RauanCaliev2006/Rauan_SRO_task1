public class SRO_task1 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int X = 9;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == X) {
                    System.out.println("Индексы: " + i + " и " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Нет подходящих элементов");
        }
    }
}
