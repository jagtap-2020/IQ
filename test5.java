public class test5
    {
         static String s1 = "I am unique!";
         public static void main(String args[])
         {
            String s2 = "I am unique!";
            String s3 = new String(s1);//.intern();// if intern method
 //is removed then there will be difference
          // String s3= new String("I am unique!").intern();

            System.out.println("s1 hashcode -->"+s1.hashCode());
            System.out.println("s3 hashcode -->"+s3.hashCode());
            System.out.println("s2 hashcode -->"+s2.hashCode());
            System.out.println(s1 == s2);
            System.out.println("s1.equals(s2) -->"+s1.equals(s2));
            /* System.out.println("s1.equals(s3) -->"+s1.equals(s3));
             System.out.println(s1 == s3);
            System.out.println(s3 == s1);
            System.out.println("s3-->"+s3.hashCode());*/
        //  System.out.println(s3.equals(s1));
        }
    }
