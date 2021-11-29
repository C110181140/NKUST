import java.util.ArrayList;
import java.util.Collections;
public class UnHash {
    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static long revHash(long hash) {
        ArrayList<Character> Ch = new ArrayList<Character>();
        long s = hash;
        long h = 0L;
        int k = 0;
        for (int i = 0; i < 11; i++){
            h = s % 23;
            s = ( s - h ) / 23;
            char ans = letters.charAt((int) h);
            System.out.println(ans);
            Ch.add(ans);
            k++;
            if (s == 7){
                System.out.println(k);
                Collections.reverse(Ch);
                System.out.println(Ch);
                break;
            }
        }
        return s;

    }


    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
