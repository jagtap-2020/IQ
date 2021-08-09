import java.util.*;
import java.lang.*;
class Parent{
  public Object m1()
  {
    System.out.println("In Obeject parent class");
    return null;
  }
}
class Child extends Parent {
  /*public Object m1()
  {
    System.out.println("In string child class..");
    return null;
  }*/
  public String m1()
  {
    System.out.println("In string child class..");
    return null;
  }
}
/*
public class Case2 extends String{
  public static void main(String[] args)
  {
    String t=new String();
    t.m1();
  }
}*/

/*
until 1.4 version return type of method overriding must be same but 1.5 onwards
co-varient return type are allow..
co-varient means child method return type need not be same as parent class return type
its child type also allow this is called co-varient type concept
this concept comes from 1.5 version onwards


parent method return type-> Object
child method return type-> String/StringBuffer/StringBuilder....

number for parent-> number
child-> Number/byte/short/int/long/float/double

parent-> String
child-> Object CE will occure
child method return type of if we take parent of parent class renturn type then its give CE
this is not co-varient..


parentt-> double
child -> int
CE occure
Co-varient concept only applicable for object type not primitive type
In primetive  whatever return type of parent have compulsory same child method return type
in primetive type
*/
