import java.lang.*;
import java.util.*;
class Test4
{
  public static void main(String ars[])
  {
    String s1=new String("durga");
    String s2=new String("durga");
    String s3="durga";
System.out.println(s3.intern().hashCode());
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

    System.out.println(s1.intern().hashCode());
    System.out.println(s3.intern().hashCode());

  }
}
