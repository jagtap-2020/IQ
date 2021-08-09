import java.util.*;
import java.lang.*;
class Over
{
  public void m1(int i)
  {
    System.out.println("In General method");
  }
  public void m1(int... i)
  {
    System.out.println("In var-arg method");
  }
  public static void main(String[] args) {
    Over o=new Over();
    o.m1(10,20);
    o.m1(null);
    o.m1(10l);
    o.m1(10);
    /*
    1)var arg methode will always get least priority ..
    ifno other method mathed then only var arg method get chance

    */
  }
}
