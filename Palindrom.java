import java.util.Scanner;
public class Palindrom {
    
public static void main(String[] args) {
    int temp; int inpInt=0; int lastNumber; int newNumber=0;

    //Kullanıcıdan sayı alan kısım
    Scanner inp=new Scanner(System.in);
    System.out.print("Sayıyı girin :");
    inpInt=inp.nextInt();
    temp=inpInt;
    
    while (temp!=0) {
        System.out.println("******************************************");
        lastNumber=temp%10;
        
        System.out.println("son basamak :"+lastNumber);
        temp=temp/10;
        System.out.println("Son basamak atılmış :"+temp);
        newNumber=newNumber*10+lastNumber;
        System.out.println("yeni sayı :"+newNumber);        
    }

    if (newNumber==inpInt)
    System.out.print("Girilen sayı Palindrom !");
    else
    System.out.println("Girilen sayı Palindrom değil !");

    inp.close();
}
}