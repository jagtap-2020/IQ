import java.lang.*;
import java.util.*;
interface Interface1
{
  public static void show()
  {
    System.out.println("Im in First Interface");
  }
}
interface Interface2
{
   static void show()
  {
    System.out.println("Im in Second Interface");
  }
}
public class SampleInterfaceMulti implements Interface1, Interface2
{

  /*public void show()
  {
    System.out.println("In class SampleInterfaceMulti");
  }*/
  public static void main(String[] args)
  {
    SampleInterfaceMulti  i1= new SampleInterfaceMulti();
    //Student s1=new Student();
    i1.show();
  }
}
