import java.util.*;
import java.lang.*;
class HeapSCP
{
  public static void main(String args[])
  {
  String s1=new String("Hello"); //Heap as well as HeapSCP
  String s2=new String("Hello");//HEap but Same content literal are present in SCP so Not in SCP
  String s3="Hello"; //Pointing To same content object but not created another object
  String s4="Hello";//Pointing To same content object but not created another object
  //System.out.println(s1.hashCode());
  //System.out.println(s2.hashCode());
  //System.out.println(s3.hashCode());
  //System.out.println(s4.hashCode());
  //System.out.println(s3==s1);// true bcoz refer to the same object in SCP
  System.out.println(s4==s3);// false bcoz refer to the Different object in HEAP.

  System.out.println(s1.equals(s3));
  System.out.println(s1);

}
}
