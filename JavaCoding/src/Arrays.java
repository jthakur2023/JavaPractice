import java.util.*;
public class Arrays {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        //practiceOneD();
        int randomInts [] = new int[10];
        System.out.println("Enter ints for the array");
        int num1= sc.nextInt();
        randomInts[0] = num1;
        int num2= sc.nextInt();
        randomInts[1] = num2;
        int num3= sc.nextInt();
        randomInts[2] = num3;
        int num4= sc.nextInt();
        randomInts[3] = num4;
        int num5= sc.nextInt();
        randomInts[4] = num5;
        int num6= sc.nextInt();
        randomInts[5] = num6;
        int num7= sc.nextInt();
        randomInts[6] = num7;
        int num8= sc.nextInt();
        randomInts[7] = num8;
        int num9= sc.nextInt();
        randomInts[8] = num9;
        int num10= sc.nextInt();
        randomInts[9] = num10;
        insertNum(randomInts);
        rotation(randomInts);
        insertNewArray(randomInts);
        increaseSize(randomInts);
        //System.out.println(findSum(randomInts));
        System.out.println(maxNum(randomInts));
        //System.out.println((findKey(randomInts,8)));

    }
    public static void increaseSize(int []a){
        System.out.println("Length of A="+a.length);

        int B[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            B[i]=a[i];
        }
        a=B;

        System.out.println("Length of A="+A.length);
    }
    public static void insertNewArray(int []a){
        int B[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            B[i]=a[i];
        }

        for(int x:B)
        {
            System.out.print(x+",");
        }
    }
    public static void rotation(int []a){
        for(int x:a)
            System.out.print(x+",");
        System.out.println("");

        int temp=a[0];

        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;

        for(int x:a)
            System.out.print(x+",");
        System.out.println("");

    }

    public static int insertNum(int []a){
        int n=6;

        for(int i=0;i<n;i++)
            System.out.print(a[i]+",");
        System.out.println("");

        int x=20;
        int index=2;

        for(int i=n;i>index;i--)
            a[i]=a[i-1];
        a[index]=x;

        for(int i=0;i<n;i++)
            System.out.print(a[i]+",");
        System.out.println("");

    }
    public static int maxNum(int []a){
        int cnt = 0;
        int max = 0;
        for(int i = 1; i < a.length; i++){
            if(a[cnt] < a[i]){
                max = a[i];
            }
            cnt++;
        }
        return max;
    }
    public static int findKey(int [] a, int b){
        for(int i = 0; i <a.length; i++){
            if(a[i]== b){
                System.out.println("found key at "+ i +" position");
                return i;
            }
        }
        return 0;
    }

    public static int findSum(int [] a){
        int sum = 0;
        for(int i=0; i <a.length; i++){
            sum += a[i];
        }
        return sum;

    }
    public static void practiceOneD(){
        int A[]=new int[10];
        int B[]={1,2,3,4,5};

        int C[];
        C=new int[10];

        B[2]=15;

        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }


        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]);
        }


        for(int x:B)
        {
            System.out.println(x++);
        }
        for(int x:B)
        {
            System.out.println(x);
        }


        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]++);
        }


        System.out.println(B.length);
    }
}
