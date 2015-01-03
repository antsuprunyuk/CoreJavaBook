import java.io.Console;
import java.util.*;
/**
 * This program displays a greeting from the authors.
 * @version 1.20 2004-02-28
 * @author Cay Horstmann
 */

public class Welcome {
   public static void main(String[] args) {
	   Console cons = System.console();
	   System.out.println(cons);
	   String name = cons.readLine("Enter your name: ");
	   char[] password = cons.readPassword("Enter your password: ");
	   String pass = new String(password);
	   System.out.println(name + " " + pass);
	   int a = 15;
	   System.out.printf("%1$d  %1$x", a);
   }   
}
