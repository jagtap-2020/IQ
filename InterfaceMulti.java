import java.lang.*;
interface Interface1
{
  int a=10;

  //void Display();
  public static void show()
  {
    System.out.println("In Interface");

  }
}

/*class Student implements Interface1
{
  //@override
   private void show()
  {
    System.out.println("In Student class");
  }
}*/

class InterfaceMulti extends Student implements Interface1
{
  
  protected void show()
  {

  //  System.out.println("In InterfaceMulti class");
  }

  public static void main(String[] args)
  {
    InterfaceMulti  i1= new InterfaceMulti();
    Student s1=new Student();
    Student s2=new Student();

    Class c1=s1.getClass();

    Class c2=s2.getClass();
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1==c2);
    //s1.show();
    Interface1.show();
    //i11.show();
  }
}
