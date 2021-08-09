/* parent reference can hold child object...
in overloading method resolution always take care by compiler base on reference type
runtime object doesnt plays any role*/
import java.util.*;
import java.lang.*;
class Animal{

}
class Monkey extends Animal{

}
class test{
  public void m1(Animal a)
  {
    System.out.println("In Animal version");
  }

    public void m1(Monkey a)
    {
      System.out.println("In Monkey version");
    }
  public static void main(String[] args) {
    test t=new test();
    Monkey m=new Monkey();
    t.m1(m); //Monkey ref
    Animal a= new Animal();
    t.m1(a); //Animal ref
    Animal a1=new Animal();
    t.m1(a1);  //Animal ref
  }
}
