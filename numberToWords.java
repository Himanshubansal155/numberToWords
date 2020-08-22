/*
*Created By Himanshu Bansal at 2020/7/16 at 6:15PM
*vs code
*/
import java.util.Scanner;


public class numberToWords {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        scanner.close();
        System.out.println(number);
        Word show=new Word();
        show.buy((number % 100));
    }
}
class Word{
    
    void buy(int n){
        String one[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
        "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

        String ten[] = {"","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        if (n > 19)
        {
        System.out.print(ten[(n/10)-1]+" " +one[n%10]);
        }
        else
        {
        System.out.print(one[n]);
        }
    }
    
}
 
