package fourtest;

import java.util.ArrayList;
public class WeekTest {
    public static void main(String[] args) {
    int [] listOfNumbers = {1,2,3,4,5,6,7,8,9};
    ArrayList<Integer> divisableBy3 = new ArrayList<>();
    for (int i = 1; i < listOfNumbers.length; i++) {
        int temp = listOfNumbers[i];
        if (temp %3 == 0) {
            divisableBy3.add(temp);
            for (int num : divisableBy3) {
                System.out.println("Number divisable by 3 : "+num);

            }
        }
    }
}
}

