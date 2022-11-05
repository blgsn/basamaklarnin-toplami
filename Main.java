
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
     System.out.print("Sayı Giriniz :");
     int number = input.nextInt();
     int basNumber = 0;
     int tempNumber = number;
     int basValue;
     int result=0;
     
     while (tempNumber != 0) {
         tempNumber /= 10;
         basNumber++;
     }
    
     for(int i=1;i<=basNumber;i++) {
    	basValue=number%10; 
    	
    	number=number/10;
    	result+=basValue; 
    	 
     }
     System.out.print("Sonuç :"+result);
     System.out.print("\nbasamak sayısı :"+basNumber);
	 } 
}
