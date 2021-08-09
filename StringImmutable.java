import java.util.*;
import java.lang.*;
class StringImm
{
  public static void main(String[] args) {
    String s=new String("Aish");
    String s1=new String();
    s.concat("warya");
    System.out.println(s);
    System.out.println(s1);

    StringBuffer sb=new StringBuffer("Aish");
    sb.append("warya");
    System.out.println(sb);

  }
}
