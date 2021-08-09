import java.lang.*;
import java.util.*;
class parent
{
  public static void main(String args[])
  {
    int x=4;
    int y=4;
    System.out.println(x==y); //
    StringBuilder sb=new StringBuilder("pqr");
    StringBuilder sb2=new StringBuilder("pqr");
    System.out.println(sb.hashCode());
    System.out.println(sb2.hashCode());
    System.out.println(sb==sb2);
    System.out.println(sb.equals(sb2)); //datatype and hashCode

    String s1=new String("abc");
    System.out.println(s1.hashCode());
    s1=new String("pqr");
    System.out.println(s1.hashCode());
    
    String s2=new String("annc");
    System.out.println(s2.hashCode());
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2)); //datatype and hashCode
  }
}
