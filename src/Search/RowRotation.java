package Search;

import java.util.Arrays;

public class RowRotation {
    public static void main(String[] args) {
        String name = "12345qwertyytrewq54321";
        boolean answer = isPolindrom(name);
        System.out.println(answer);
    }
    public static boolean isPolindrom(String str){
        char [] charArray = str.toCharArray();
        for (int i = 0,j = charArray.length-1; i < charArray.length/2; i++,j--) {
            char c = charArray[i];
            charArray[i] =charArray[j];
            charArray[j] = c;
        }

        String polindrom = "";

        for (int i = 0; i < charArray.length; i++) {
            polindrom += String.valueOf(charArray[i]);
        }

       return  str.equalsIgnoreCase(polindrom);

    }


}
