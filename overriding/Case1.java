import java.util.*;
import java.lang.*;
class parent{
  void m1(){
    System.out.println("In parent class");
  }
}
class overriding extends parent{
  void m1(){
    System.out.println("In Child class..");
  }
public static void main(String[] args) {
  overriding o=new overriding();
  o.m1();// overloading method called
  parent p=new parent();
  p.m1(); //Parent m1 method

  parent p1=new overriding();
  p1.m1();
  /* In overloading method resoluthion done at compile time according to refence
  type but in overrriding firstly its check m1( ) method is available in parent
  or not if it is available then its compile very well othewise its gives
  compiletime compiletimeerror.
  Here m1() method is available in parent so our code compile happlly
  then at runtime againg jvm check which runtime object i use according to that
  method will be called

  here parent p1=new overriding();
  We use parent refence to hold child object after refernce checking jvm check
  runtime Object and overriding object are ised here so overriding method m1() will call.

  In overloading Method resoluthion done at compile time by refernce type so compiler is responsible for method resoluthion
  thats why it called Early binding compiletime polynorphism, method overloading.
  In  overriding jvm is responsible to method resolution at runtime on runtime object creation bases
  its bind late thats why its called late binding, runtime polymorphism, Method overronding.
  */
}


}
