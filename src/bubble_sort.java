import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args){
        int arr[] = new int[10];
        int tmp;
        boolean status = false;
        int c=0;
        for (int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*10);
        }
        while (!status){
            status = true;
            c++;
            for (int i=0; i < arr.length-1; i++){
                    if (arr[i]>arr[i+1]){
                        status = false;
                        tmp = arr[i];
                        arr[i]= arr[i+1];
                        arr[i+1] = tmp;
                    }
                }
            System.out.println(c+" - "+Arrays.toString(arr));
        }
    }

}
