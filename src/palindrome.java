import java.util.Locale;

public class palindrome {

    static boolean Palindromeis(String str){
        int i,j;
        i = 0; j = str.length()-1;

        while (i<j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;



        }



    public static void main(String[] args) {
        String str = "abba";
        str= str.toLowerCase();
        if (Palindromeis(str))
            System.out.print("yes");
        else
            System.out.print("No");






    }
}
