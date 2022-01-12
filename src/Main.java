import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Sayının Palindrom Olup Olmadığını Bulan Program");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Main main = new Main();
        int basamak = main.digitOfNumber(input);
        int tersSayi = main.reverseOfNumber(input, basamak);
        System.out.println("Basamak Sayısı : " + basamak);
        if(input == tersSayi){
            System.out.println(tersSayi + " Sayısı Palindrom Sayıdır.");
        }else{
            System.out.println(tersSayi + " Sayısı Palindrome Değildir.");
        }
    }

    public int digitOfNumber(int num){
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
    public int reverseOfNumber(int num,int digit){
        int result = 0;
        while(num > 0){
            int tempDigit = num%10;
            result += (tempDigit * Math.pow(10, (double) --digit));
            num/=10;
        }
        return result;
    }
}
