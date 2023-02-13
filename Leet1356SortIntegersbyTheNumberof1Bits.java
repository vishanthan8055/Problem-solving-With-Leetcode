import java.util.Arrays;

public class Leet1356SortIntegersbyTheNumberof1Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwap = false;
            for (int j = 1; j < arr.length - i; j++) {

                if(countsetBits(arr[j]) == countsetBits(arr[j - 1])){
                    if (arr[j] < (arr[j - 1])){
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        isSwap = true;
                    }
                }
                if (countsetBits(arr[j]) < countsetBits(arr[j - 1])){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
        return arr;
    }
    public static int countsetBits(int n) {
        int count = 0;
        while(n>0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
    public static void swap(int[] arr, int x,int y){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
}
