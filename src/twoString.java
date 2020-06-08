import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

        Scanner dp = new Scanner(System.in);

        String allElements = dp.nextLine();

        String[] elements = allElements.split(" ");

        String s1 = elements[0];

        String s2 = elements[1];

        // code start here use s1 and s2 as words

        int a = s1.length(); // abc , a=3
        int b = s2.length(); //cat  , b=3


        if (s1.substring(a - 1, a).equals(s2.substring(0, 1)))
            System.out.println(s1 + s2.substring(1));

        else System.out.println(s1 + s2);

    }
}

/* dogans way

        String firstWord = s1.substring(s1.length()-1);
        String secondWord = s2.substring(0,1);

        if (firstWord.equals(secondWord)) {

            firstWord = s1.substring(0, s1.length() - 1);
            System.out.println(firstWord + s2);
        } else {
            System.out.println(s1 + s2);
        }

 */