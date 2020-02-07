import java.io.*;
import java.util.*;
import java.util.Scanner;


class A {

static void Anagram(char []sana,char []sana1){

System.out.println("Hello A");
if(sana.length ==sana1.length){

Arrays.sort(sana);
Arrays.sort(sana1);

if(Arrays.equals(sana,sana1)){
System.out.println("Anagram");

}else{

System.out.println("Not Anagram");
}
}
}

public static void main(String []args){

Scanner sc  = new Scanner(System.in);
System.out.println("Enter first String");
String s = sc.next();
char c1[] = s.toCharArray();
System.out.println("Enter Second String");
String s1 = sc.next();
char c2[] = s1.toCharArray();

  Anagram(c1,c2);
}
}