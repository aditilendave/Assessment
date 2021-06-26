class UncheckedException 
{ 
  public static void main(String[] args) 
  { 
    String a = "Ravi";
    String b = "Ram";
    String c = null;
    try
    {
    // Now print all the strings
    System.out.println("First name = " +a);
    System.out.println("Second name = " +b);
    System.out.println("Third name = " +c);
        
    // concating string 
    System.out.println("Concatination of String = " + c.concat(a));
    }
    catch(NullPointerException e)
    {
    System.out.print("NullPointerException exception is occured"); 
    }
  }
}