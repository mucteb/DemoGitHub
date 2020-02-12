
package demogithub;

/* author Muharrem KAYA */
// added sub method, Muharrem KAYA, 2020
// added mul method, Derya Kaya, 12 Feb, 2020

  public class DemoGithub 
  {
      public static void main(String[] args) 
      {
          System.out.println("Sum: "+mySum(5,3));       
          System.out.println("Sub: "+mySub(5,3));   
          System.out.println("Mul: "+myMul(5,3));
      } 
      
      public static double mySum(double a, double b)
      {
          double summ=a+b;
          return summ;
      }
    
     public static double mySub(double a, double b)
       {
          double sub=a-b;
          return sub;
      }      
     public static double myMul(double a, double b)
       {
          double mul=a*b;
          return mul;
      }      
      
  }
