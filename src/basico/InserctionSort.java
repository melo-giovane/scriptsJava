package basico;

import java.util.Arrays;

public class InserctionSort {
    public static void main(String[] args){
        int[] arr = {31, 41, 59, 26, 41, 58};

        for(int j = 1; j < arr.length; j++){
            int chave = arr[j];

            int i = j-1;

            while(i>=0 && arr[i]>chave){
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i+1] = chave;
        }

        System.out.println(Arrays.toString(arr));
    }
}
