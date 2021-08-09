import java.util.*;
import java.lang.*;
class Over
{
  public void m1(Object o)
  {
    System.out.println("In Object..");
  }
    public void m1(String s)
    {
      System.out.println("In String..");
    }
      public void m1(StringBuffer sb)
      {
        System.out.println("In StringBuffer..");
      }
      public static void main(String[] args) {
        Over o=new Over();
        o.m1(new Object());//Object
        o.m1(new StringBuffer("durgaa"));//StringBuffer
        o.m1("Aish"); //String
        o.m1(null);
        /*
        1)in overloading child class get first priority if String buffer will
        not there then null argument String argumrnt type method have been executed...
        2)but here object is parent and string and StringBuffer is child of object
        then when we apply null argument there generate ambiguity and compiletimeerror
        are generate
        3) Our compiler does not recognize which method gives highes priority
        */
      }
}
