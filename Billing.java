import java.util.Scanner;
class Billing
{
static int price;
static int quantity;
static int coupan;

float computerBill(int price)
{
float due=(price*0.08f);
return due;
}
float computerBillI(int price, int quatity)
{
float due=(price*quatity)*0.08f;
return due;
}
float computerBill(int price,int quatity,int coupan)
{
float due=((price*quatity)-coupan)*0.08f;
return due;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Billing b1=new Billing();
int k=sc.nextInt();
switch(int k)
{
case 1:
System.out.println("Enter the price"); 
price=sc.nextInt();
float s1;
s1=b1.computerBill(int price);
System.out.println("the due is:"+s1);
break;
case 2:
System.out.println("Enter the price,quatity");
price=sc.nextInt();
quatity=sc.nextInt();
float s2;
s2=b1.computerBill(int price,int quatity);
System.out.println("the due is:"+s2);
break;
case 3:
System.out.println("Enter the price,quatity,coupan");
price=sc.nextInt();
quatity=sc.nextInt();
coupan=sc.nextInt();
float s3;
s3=b1.computerBill(int price,int quatity,int coupan);
System.out.println("the due is:"+s3);
break;
}
}
}
