import java.util.*;

public class ConditionalStatements {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        int a,b;
        int age;
        int grade;
        int year;
        int day;
        String url;
        System.out.println("Enter a number to find out what day it is");
        day=sc.nextInt();
        System.out.println(findDay(day));
        System.out.println("Enter a url");
        url=sc.nextLine();

     /*   System.out.println("Enter first digit: ");
        a=sc.nextInt();
        System.out.println("Enter second digit: ");
        b=sc.nextInt();
        System.out.println(isGreater(a,b));
        System.out.println(isPositive(a));
        System.out.println("Enter your age");
        age= sc.nextInt();
        System.out.println(isYoung(age));
        System.out.println("Enter your grade");
        grade=sc.nextInt();
        System.out.println(getGrades(grade));
        System.out.println("Enter a year");
        year=sc.nextInt();
        System.out.println(isLeapYear(year)); */



    }

    public static boolean isGreater(int a, int b){

        return a<b;
    }

    public static boolean isPositive(int a){
        if (a >=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static String isYoung(int a){
        if( a >=14 && a <=55){
            return "You are young";
        }
        else if(a < 14){
            return "you are a baby";
        }else{
            return "you are old";
        }

    }
    public static char getGrades(int a){
        if(a>=90 && a<=100){
            return 'a';
        }else if(a>=80 && a<90){
            return 'b';
        }else if(a>=70 && a<80){
            return 'c';
        }else if(a >=60 && a<70){
            return 'd';
        }else{
            return 'f';
        }
    }
    public static boolean isLeapYear(int a){
        if(a%4 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static String findDay(int a){
        if(a%7 == 6){
            return "Sunday";
        }else if(a%7 == 5){
            return "Monday";
        }else if(a%7 == 4){
            return "Tuesday";
        }else if(a%7 == 3){
            return "Wednesday";
        }else if(a%7 == 2){
            return "Thursday";
        }else if(a%7 == 1){
            return "Friday";
        }else{
            return "Saturday";
        }
    }
    public static String typeAndProtocol(String s){
        String type;
        return "test";
    }
}
