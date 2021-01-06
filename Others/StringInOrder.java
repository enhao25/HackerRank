import java.util.*;

public class StringInOrder {
  public static void main(String [] args) {
    try {
      Scanner scan = new Scanner(System.in);
      if (scan.hasNextLine()) {
        String string = scan.nextLine();
        char[] charOfString = new char[string.length()];
        
        // Store each char into the charOfString Array
        for (int i = 0; i < string.length(); i++) {
          charOfString[i] = string.charAt(i);
        }
        
        // Sort them in lexico order by swapping
        for (int i = 0; i < string.length() - 1; i++) {
          for (int y = 0; y < string.length() - 1; y++) {
            if (charOfString[y] > charOfString[y+1]) {
              char temp = charOfString[y];
              charOfString[y] = charOfString[y+1];
              charOfString[y+1] = temp;
            }
          }
        }

        // Print Sorted Array
        for (int i = 0; i < string.length(); i++) {
          System.out.print(charOfString[i]);
        }

        scan.close();
      }
    } catch (Exception e) {}
  }
}