public class Leet476NumberComplement {
    public static void main(String[] args) {
        int num = 5;
        int c = num;
        int mask = 1;
        while(c>0){
            num = num^mask;
            mask = mask << 1;
            c = c >> 1;
        }
        System.out.println(num);
    }
}
