import java.util.Arrays;

public class Leet1720DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(decode(encoded,first)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            ans[i+1] = encoded[i] ^ ans[i];
        }
        return ans;
    }
}
