import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static void main(String[] args) {
        int [] numbers = oddNumbers(1,13);

        //Loop the list to print result
        for (int i:numbers) {
            System.out.println(i);
        }
    }


    public static int[] oddNumbers(int bottom, int top) {
        List<Integer> numbers = new ArrayList<Integer>();
        int lBound = bottom;

        if (!isOddNumber(lBound))
            lBound = lBound + 1;

        while (lBound <= top) {
            numbers.add(lBound);
            lBound = lBound + 2;
        }
        return toIntArray(numbers);
    }

    private static int[] toIntArray(List<Integer> numList) {
        int[] numbers = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            numbers[i] = numList.get(i);
        }
        return numbers;
    }

    private static boolean isOddNumber(int n) {
        return !(n % 2 == 0);
    }
}
