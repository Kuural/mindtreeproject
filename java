import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println("The length of the first string is "+a.length());
            System.out.println("The length of the second string is "+b.length());
            System.out.println("The uppercase of the first string is "+a.toUpperCase());
            System.out.println("The uppercase of the second string is "+b.toUpperCase());
            System.out.println("The concatenated string is "+a.concat(b));
            if(a.compareTo(b)<0)
            { 
                 System.out.print(a+" appears before "+b);
            }
            else if(a.compareTo(b)>0)
                 System.out.print(b+" appears before "+a);
          else
                 System.out.print("Both the input strings are the same");
     }
}
