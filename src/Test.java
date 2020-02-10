public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        int count1 = 0;
        int count2 = 0;
        for (int i : array) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                count1++;
            } else {
                count2++;
            }

        }
        System.out.println("");
        int[] guusuu = new int[count1];
        int[] kisuu = new int[count2];
        int countArray1 = 0;
        int countArray2 = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                guusuu[countArray1] = i;
                countArray1++;
            } else {
                kisuu[countArray2] = i;
                countArray2++;
            }

        }
        System.out.print("偶数は：");
        for (int i : guusuu) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.print("奇数は：");
        for (int i : kisuu) {
            System.out.print(i + " ");
        }
    }

    public static void test(String[] args) {

    }
}


