import java.util.*;
public class Overloading
{
  public void m1(int i)
  {
    System.out.println("int return type...");

  }
  public void m1(float i)
  {
    System.out.println("float return type...");
  }

  public static void main(String[] args) {
    Overloading o=new Overloading();
    o.m1('a'); //byte->short->int->long->float->double
    /*char->int->long->float->double
      1)pramotion are happen in there..
     2)method signature is method name + argument type not return type
     3)method resolution done at compile time according to method signamture
     thats why its called early binding bcoz its resolve method signature
     before execution of method...

     4)Overloading is same method name but different argument list

    */

  }
}
