import java.util.*;

public class Loops {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter a number to display the multiplication table: ");
        int n = sc.nextInt();
        printTable(n);
        System.out.println("Enter a number to get sum: ");
        int s = sc.nextInt();
        System.out.println(returnSum(s));
        System.out.println("Enter a number to get factorial: ");
        int f = sc.nextInt();
        System.out.println(returnFactorial(f)); */
       // System.out.println("Enter a number to get number displayed: ");
        //int num = sc.nextInt();
        //displayWordNum(num);
       // displayNum(num);
        //System.out.println(isArmstrong(num));
      /*  int reverse = reverseNum(num);
        if(num == reverse){
            System.out.println("It is a palindrone");
        }else{
            System.out.println("It is not a palindrone");
        } */
        //System.out.println("Enter a value for a, d & n: ");
       // int a = sc.nextInt();
        //int d = sc.nextInt();
        //int n = sc.nextInt();
       // displayAP(a, d, n);
        //displayGP(a, d, n);
        //displayFib(n);
        printPattern5();

    }
    public static void printPattern7(){
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(i+j>5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
    public static void printPattern6(){
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }

    public static void printPattern5(){
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= 5-i+1 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");

        }
    }
    public static void printPattern4(){
        int x = 0;
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= 5; j++){
                x++;
                System.out.print(x + " ");
                if(j == i){
                    System.out.println(" ");
                }
            }
        }
    }
    public static void printPattern3(){
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= i; j++){
               System.out.print(j + " ");
               if(j == i){
                   System.out.println(" ");
               }
            }
        }
    }
    public static void printPattern2(){
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= 5; j++){
                int x = i+j;
                System.out.print(x + " ");
                if(j == 5){
                    System.out.println(" ");
                }
            }
        }
    }

    public static void printPattern1(){
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(j + " ");
                if(j == 5){
                    System.out.println(" ");
                }
            }
        }
    }

    public static void nestedLoops(){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=7;j++)
            {
                System.out.print("("+i+","+j+") ");

            }
            System.out.println("");
        }
    }

    public static void displayFib(int n){
        int a = 0;
        int c= 0;
        int b = 1;
        int [] fib = new int[n];

        for(int i = 0; i <n; i++){
            if(i == 0){
                fib[i] = 0;
            }
            else if(i == 1){
                fib[i] = 1;
            }
            else{
                c = a+b;
                fib[i] = c;
                a = b;
                b= c;
            }
        }

        for(int i = 0; i < fib.length; i++){
            System.out.println(fib[i]);
        }

    }

    public static void displayGP(int a, int d, int n){
        int total = a;
        for(int i = 0; i < n; i++){
            if (i == 0){
                System.out.print(a + " ");
            }
            total = total * d;
            System.out.print(total + " ");
        }
    }

    public static void displayAP(int a, int d, int n){
        int total = a;
        for(int i = 0; i < n; i++){
            if (i == 0){
                System.out.print(a + " ");
            }
            total = total + d;
            System.out.print(total + " ");
        }
    }

    public static void displayWordNum(int a){
        String str = "";
        int r = 0;
        while(a>0)
        {
            r=a%10;
            a=a/10;
            str=str+r;

        }
        System.out.println(str);

        char c;
        for(int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            switch(c)
            {
                case '0':System.out.print("Zero ");
                    break;
                case '1':System.out.print("One ");
                    break;
                case '2':System.out.print("Two ");
                    break;
                case '3':System.out.print("Three ");
                    break;
                case '4':System.out.print("Four ");
                    break;
                case '5':System.out.print("Five ");
                    break;
                case '6':System.out.print("Six ");
                    break;
                case '7':System.out.print("Seven ");
                    break;
                case '8':System.out.print("Eight ");
                    break;
                case '9':System.out.print("Nine ");
                    break;

            }

        }

    }

    public static void displayNum(int a){
        int b;
        int cnt = 0;
        while (a > 0){
            cnt++;
            b = a%10;
            a = a/10;
            System.out.print(b);
        }
        System.out.println("There are a total of " +cnt + " digits");

    }

    public static int reverseNum(int a){
        int rev = 0, r;
        while (a > 0){

            r = a%10;
            rev = rev *10 + r;
            a/=10;
        }
        System.out.print(rev);
        return rev;


    }


    public static String isArmstrong(int a){
        int b;
        int sum =0;
        while (a > 0){
            b = a%10;
            a = a/10;
           sum = sum+ (b*b*b);
        }
        if(sum == a){
            return "true";
        }
        else{
            return "false";
        }

    }

    public static void doWhileLoops(){
        int i = 1;
        int n = 100;
      /*  while (i<n){
            System.out.println(i);
            i=i*2;
        }

        do{
            System.out.println(i);
            i=i*2;
        }while (i<n); */

        int x=100;
        do{
            System.out.println(x);
            x=x*2;
        }while(x<100);

        byte h = 1;
        while (true){
            System.out.println(h);
            h++;
        }
    }

    public static void forLoops(){
        for(int i=1; i <= 10; i++){
            System.out.println(i);
        }
        for(int i=10; i >0; i--){
            System.out.println(i);
        }
        for(int i=10; i >0; i++){
            System.out.println(i);
        }
        int x=1;
        for(; x >0; x++){
            System.out.println(x);
        }
        for(; x >0;){
            System.out.println(x);
            x++;
        }
        for(int i=0, j=1; i <=10; i++, j=j*2){
            System.out.println(i + " " +j);
        }
    }

    public static void printTable(int a){
        for(int i =0; i <=10; i++){
            int p = a*i;
            System.out.println(a + " * " + i + "= " + p);
        }
    }

    public static int returnSum(int a){

        int sum = 0;

        for(int i = 1; i<= a; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int returnFactorial(int a){

        int factorial = 1;

        for(int i = 1; i<= a; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

}
