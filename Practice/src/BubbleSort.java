import java.util.Arrays;

public class BubbleSort {

    public static void arrange(int[] a){

        for (int i=0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    ;
                }

            }

        }


    }

    public static void main(String[] args) {

        int[] a = {7,8,1,6,4,2,5,3};//{1,2,3,6,7,8,5,9};//{1,2,3,10,7,8,9};
        arrange(a);
      //  Arrays.stream(a).forEach(s->{System.out.print(s+" , ");});
        Arrays.stream(a).forEach(System.out::println);
        //for (int i : a) {
            
        }
    }

