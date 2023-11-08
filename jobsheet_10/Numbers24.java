import java.util.Arrays;

public class Numbers24 {
    public static void main(String[] args) {
        //Array 2 dimensi dengan length berbeda tiap baris
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }   
    }
}