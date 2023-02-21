//...code in Java... mikhi_mh 
//import java.util,*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     //   Scanner input = new Scanner(System.in);
       
        String s = "is2 sentence4 This1 a3";
        int length = s.length();
        int space = 0, words = 0;

        for(int i=0; i<length; i++)
            if(s.charAt(i) == ' ')
                space++;
        words = space + 1;

        String[] arr = s.split(" ");

        ArrayList<String> myList = new ArrayList<String>(words);


        for(String str : arr)
        {
            int len = str.length();
            //int num = length - 1;
            int index = len - 1;
            StringBuilder temp = new StringBuilder(str);
            temp.delete(index,len);
            myList.add(index, temp.toString());
        }
        // return myList.toString();
    }
}