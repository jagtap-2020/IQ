import java.util.*;
import java.lang.*;
class overloading{
  public void m1(int i, float f)
  {
      System.out.println("int-floar version");;
  }
  public void m1(float f, int i)
  {
    System.out.println("float-int version");
  }
  public static void main(String[] args) {
    overloading o=new overloading();
    o.m1(10,10.5f);
    o.m1(10.5f, 10);
    //o.m1(10,10);
    o.m1(10.5f,10.5f);
  }
}
