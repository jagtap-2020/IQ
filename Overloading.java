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
    o.m1('a');

  }
}
