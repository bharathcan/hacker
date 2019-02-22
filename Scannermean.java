import java.util.Scanner;
class Scannermean
{
public static void main(String[] args)
{

Scannermean sc = new Scannermean(System.in);


int sum=0, count=0;

while (sc.hasNextInt())
{
int num = sc.nextInt();
sum += num;
count++;
}
int mean =sum/count;
System.out.println("mean:" + mean);
}
}
