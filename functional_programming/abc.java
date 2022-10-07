package functional_programming;

import java.util.Arrays;

public class abc {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        Arrays.stream(arr).forEach(i-> System.out.println(i));
    }
}
