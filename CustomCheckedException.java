import java.util.Scanner;
class NotProperNameException extends Exception {
   NotProperNameException(String msg){
      super();
   }
}
public class CustomCheckedException{
   private String name;
   private int age;
   public static boolean containsAlphabet(String name) {
      for (int i = 0; i < name.length(); i++) {
         char ch = name.charAt(i);
         if (!(ch >= 'a' && ch <= 'z')) {
            return false;
         }
      }
      return true;
   }
   public CustomCheckedException(String name, int age){
      if(!containsAlphabet(name)&&name!=null) {
         String msg = "Improper name (Should contain only characters between a to z (all small))";
         NotProperNameException exName = new NotProperNameException(msg);
        // throw exName;
      }
      this.name = name;
      this.age = age;
   }
   public void display(){
      System.out.println("Name of the Student: "+this.name );
      System.out.println("Age of the Student: "+this.age );
   }
   public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the name of the person: ");
      String name = sc.next();
      System.out.println("Enter the age of the person: ");
      int age = sc.nextInt();
      CustomCheckedException obj = new CustomCheckedException(name, age);
      obj.display();
   }
}