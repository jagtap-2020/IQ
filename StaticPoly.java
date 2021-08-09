//Method overloading

import java.util.*;
public class StaticPoly{
   void add(int a,int b)
  {
    int c=a+b;
    System.out.println(c);
  }
   int add(int a,int b, int c)
  {
    return a+b+c;
  }
  float add(float a,float b)
  {
    return a+b;
  }
   public static void main(String[] args) {

     StaticPoly c=new StaticPoly();
     c.add(20,10);
     System.out.println(c.add(10,20,30));
     System.out.println(c.add(1.2,2.0));


  }
}
