package numberOfCaprekar;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Caprekar {
    public static void main(String[] args) {
        int randomNumber = getRandomNumber(1000, 9999);
        System.out.println("Random number = " + randomNumber);
        int different = getDifferentTwoNumbers(randomNumber);
        int count = 0;
        int result = 0;
        while (result != 6174) {
            result = different;
            different = getDifferentTwoNumbers(result);
            count++;
            System.out.println(count);
            System.out.println(result);
        }
    }

    static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    static int getDifferentTwoNumbers(int ran) {
        Integer[] number = new Integer[4];
        String str = ran + "";
        int chars[] = new int[4];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
            number[i] = Character.getNumericValue(chars[i]);
        }
        Integer[] minInt = Arrays.stream(number).sorted().toArray(Integer[]::new);
        Integer[] maxInt = Arrays.stream(number).sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
        int minMin = 0;
        int maxMax = 0;
        //   System.out.println(Arrays.toString(minInt));
        //  System.out.println(Arrays.toString(maxInt));
        String str1 = "";
        for (int i = 0; i < minInt.length; i++) {
            str1 += minInt[i];
        }
        minMin = Integer.parseInt(str1);
        String str2 = "";
        for (int i = 0; i < maxInt.length; i++) {
            str2 += maxInt[i];
        }
        maxMax = Integer.parseInt(str2);
        //  System.out.println(minMin);
        //  System.out.println(maxMax);
        return maxMax - minMin;
    }
}
