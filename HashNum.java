import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashNum {
    public static void main(String[] args) {

        ArrayList<String> HashNum = new ArrayList<String>();
        HashSet<String> Hash = new HashSet<String>();
        ArrayList<String> HashN = new ArrayList<String>();


        Hash.add("0");
        Hash.add("0");
        Hash.add("1");
        Hash.add("1");
        Hash.add("1");
        Hash.add("2");
        Hash.add("2");
        Hash.add("3");
        Hash.add("3");
        Hash.add("4");

        HashNum.add("0");
        HashNum.add("0");
        HashNum.add("1");
        HashNum.add("1");
        HashNum.add("1");
        HashNum.add("2");
        HashNum.add("2");
        HashNum.add("3");
        HashNum.add("3");
        HashNum.add("4");

        HashN.add("0");
        HashN.add("1");
        HashN.add("2");
        HashN.add("3");
        HashN.add("4");

        for (int i = 0; i < HashNum.size() - Hash.size(); i++ ){

            HashN.add("_");

        }

        System.out.println(HashNum);
        System.out.println(Hash);
        System.out.println(HashN);


    }
}
