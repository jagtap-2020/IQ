import java.util.*;
import java.lang.*;
/*
Privete Modifier
overriding concept is not applicable for private Method
bcoz private method is not visible to child class but based on our requirement
 we can redefine this method in clild also.
 but this is not overriding..
 */

 /*
 Final madifier
 if parent method is final then overriding concept is not applicable for Child
 if i tried to override this method emegietly compiletimeerror we emegietlybcoz overriden methos is final.
 */
 class test{
   public void m1()
   {
     System.out.println("Non-abstract");
     //return 10;
   }
 }
 abstract class parent extends test
 {
   public abstract void m1();
  }
 class Child extends parent
 {
   public void m1(){
     System.out.println("  jj");

   }
 }

/*

parent-> Final
child-> non-final/Final
CE emegietly
overriding concept is not applicable for final Method

parent->non-Final
child->Final
it is perfectly acceptable
but next level child we cannot override

parent->abstract
child-> non-abstract
acceptable

parent -> non-abstract
child-> abstract
acceptable
here in child class says i dont want implementation of parent method but my
next level child is responsible to provide implementation.
*/
