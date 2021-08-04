import java.util.*;
import java.lang.*;
class Test extends Object
{
  public static void main(String args[])
  {
    String s1="ABC";
    String s2="abc";
    String s3=new String("ABC");
    String s4=s2; // compiletime assignment.. its get memory in only heap...
    // then how we get same hashcode for s4 and s2
    //A.t.m only identityHashcode should be same for s4 and s2
    String s5=new String();
    String s6=new String();

      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s3.hashCode());
      System.out.println(s4.hashCode());
      System.out.println(s5.hashCode());
      System.out.println(s6.hashCode());
      System.out.println(s4==s2);
      System.out.println();

    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s4));
    System.out.println(System.identityHashCode(s5));
    System.out.println(System.identityHashCode(s6));



/*
System.out.println("in String buffer...");
StringBuffer sb1=new StringBuffer("abc");
StringBuffer sb2=new StringBuffer("abc");
StringBuffer sb3=new StringBuffer("abc");

  StringBuffer sb4=sb2;
  System.out.println(sb1.hashCode());
  System.out.println(sb2.hashCode());
  System.out.println(sb3.hashCode());
  System.out.println(sb4.hashCode());
  System.out.println("After hascode....");
  System.out.println(System.identityHashCode(sb1));
  System.out.println(System.identityHashCode(sb2));
  System.out.println(System.identityHashCode(sb3));
  System.out.println(System.identityHashCode(sb4));*/

  }
}
