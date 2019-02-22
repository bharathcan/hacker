balimport java.util.Scanner;
public class Scanner1
{
public static void main(String[] args)
{


 
Scanner sc=new Scanner(System.in);

System.out.println("enter name:\n");
String name= sc.nextLine();

System.out.println("enter gender:\n");
char gender= sc.next().charAt(0);

System.out.println("enter age:\n");
int age= sc.nextInt();

System.out.println("enter mobileno:\n");
long mobileno= sc.nextLong();


System.out.println("enter cgpa:\n");
double cgpa= sc.nextDouble();

System.out.println("name: "+name);
System.out.println("gender: "+gender);
System.out.println("age: "+age);
System.out.println("mobileno: "+mobileno);
System.out.println("cgpa: "+cgpa);
}
}
