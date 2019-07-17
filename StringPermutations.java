import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {


    public static void main(String[] args) {
        printPermutations("ABCDEFGHIJ");
    }

    public static void printPermutations(String str){

        Set<String> perms = generatePermutations(str);
        System.out.println(perms);

    }

    public static Set<String> generatePermutations (String str) {
        if(str == null || str.length() == 0) {
            return null;
        }

        if(str.length() == 1) {
            Set perms = new HashSet();
            perms.add(str);
            return perms;
        }

        char first = str.charAt(0);
        String subStr = str.substring(1);

        Set<String> subPerms = generatePermutations(subStr);

        Set<String> perms = new HashSet<>();

        for(String subPerm: subPerms) {
            for(int i=0; i< subPerm.length(); i++) {
                String p1 = subPerm.substring(0,i);
                String p2 = subPerm.substring(i);
                perms.add(p1+first+p2);
            }
            perms.add(subPerm+first);
        }

        return perms;
    }

}
