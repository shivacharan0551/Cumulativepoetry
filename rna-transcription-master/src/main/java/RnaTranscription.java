import java.util.Scanner;
import java.io.*;

public class RnaTranscription {

    String transcribe(String s1) {

        String s2 = "";
        int len= s1.length();
        for(int i = 0; i < len; i++)
        {
            if(s1.charAt(i) == 'G')
            {
                s2 = s2.concat("C");
            } else if(s1.charAt(i) == 'C')
            {
                s2 = s2.concat("G");
            } else if(s1.charAt(i) == 'T')
            {
                s2 = s2.concat("A");
            } else if(s1.charAt(i) == 'A')
            {
                s2 = s2.concat("U");
            } else {
                System.out.println("wrong input");
            }
        }
        return s2;
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    //    Scanner in = new Scanner(System.in);
    //    String s = in.nextLine();
    //    StringBuilder sb = new StringBuilder();
      //  sb.append("line 1");
      //  System.out.println(sb.toString());
    }

 /*   public static void main(String[] args)
    {
        RnaTranscription obj= new RnaTranscription();

        obj.transcribe("G");

    }
*/
}
