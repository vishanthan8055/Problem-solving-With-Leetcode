public class Leet1684CounttheNumberofConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            boolean isThere = true;
            for (int j = 0; j < words.length; j++) {
//                if(isThere == false){
//                    isThere = true;
//                    break;
//                }
                for (int k = 0; k < words[j].length(); k++) {
                    if(words[j].charAt(k) == c){
                        isThere = true;
                    }
                    else{
                        isThere = false;
                    }
                }
                ans += 1;
            }
        }
        return ans;
    }
//    public static char[] toCharArray(String s){
//        char[] arr = new char[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            arr[i] = s.charAt(i);
//        }
//        return arr;
//    }
}
