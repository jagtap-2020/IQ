import java.lang.*;
import java.util.*;
class Master
{
  public static void main(String ars[])
  {
    String m1=new String("abc");
    System.out.println(m1);
    System.out.println(m1.hashCode());
    m1.concat("def");
    System.out.println(m1);
    System.out.println(m1.hashCode());
    String m2=new String("pqr");
    String m3=new String("pqr");

    String m4=new String();

    System.out.println(m1.hashCode());
    System.out.println(m2.hashCode());
    System.out.println(m3.hashCode());
    System.out.println(m4.hashCode());
    System.out.println(m2.equals(m3));//in string only eqal operator used for content comparisson
    System.out.println(m2==m3);  // == operator use for reference/address comparisson
    System.out.println();
// object m2 and m2 hava same address then why our (m2==m3) gets false???
// even there address are same... but another question is how is this possible ...m2 m3 hava same address
//


    StringBuffer s1=new StringBuffer("abc");
    StringBuffer s2=new StringBuffer("abc");
    StringBuffer s3=new StringBuffer();
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s1.equals(s2));//here equals() method for reference/address comparisson
    System.out.println(s1==s2);// reference/address
    // output- false
              //  false


    System.out.println();


  }
}
