import java.util.*;
class Parent
{
  protected void show()
  {
    System.out.println("In Parent class...");
  }
}
class Child extends Parent
{
  private void show()
  {
    System.out.println("In Child class...");
  }
}

class DynamicPoly
{
  public static void main(String [] args)
  {
    Child c =new Child();
    c.show();
  }
}
