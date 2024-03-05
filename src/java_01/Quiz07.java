package java_01;

public class Quiz07 {
    public static void main(String[] args) {

        //문항7】 아래 주어진 배열에서 최솟값을 구하는 코드를 작성하세요. (10점)
        int[] arrays = {90, 87, 50, 65, 20};

        int min = arrays[0];

        for ( int i = 0; i < arrays.length; i++) {
            if (min > arrays[i]) min = arrays[i];
        }

        System.out.println("주어진 배열의 최솟값: " + min);
    }
}
