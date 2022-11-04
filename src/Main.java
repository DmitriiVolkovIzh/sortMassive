import java.util.Arrays;

public class Main {
   public static int[] removeDuplicates(int[] arr){
       return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
       int[] arr = {5,6,2,5,7,3,8,5,2,7,3,0,4,4,6,8};
       int[] sort = removeDuplicates(arr);
        System.out.println(Arrays.toString(sort));


    }
}