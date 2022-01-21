import java.util.*;

public class Operators {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int height;
        int base;
        int side1, side2, side3;
        double a,b,c;
        String knowsSides;
        String quadratics;

        System.out.println("Want to find out the two roots from quadratic formula?");
        quadratics = sc.next();
        if(quadratics.equalsIgnoreCase("yes")){
            System.out.println("Enter the value for a: ");
            a = sc.nextDouble();
            System.out.println("Enter the value for b: ");
            b = sc.nextDouble();
            System.out.println("Enter the value for c: ");
            c = sc.nextDouble();
            double [] roots = quadraticRoots(a,b,c);
            if(roots[0] != 0.0 && roots[1] != 0.0){
                System.out.println("R1: " + roots[0]);
                System.out.println("R2: " + roots[1]);
            } else{
               System.out.println("Imaginary numbers are involved.");
            }
        }



        System.out.println("Do you know the values of all 3 sides? Enter yes or no");
        knowsSides = sc.next();
        if (knowsSides.equalsIgnoreCase("yes")){
            System.out.println("Enter the value for size 1: ");
            side1 = sc.nextInt();
            System.out.println("Enter the value for size 2: ");
            side2 = sc.nextInt();
            System.out.println("Enter the value for size 3: ");
            side3 = sc.nextInt();
            System.out.println("Area: " + area2(side1, side2, side3));
        }
        else{
            System.out.println("Please enter height: ");
            height = sc.nextInt();
            System.out.println("Please enter base: ");
            base = sc.nextInt();
            System.out.println("Area: " +area(base,height));
        }

        //arthmetic();



    }

    public static void arthmetic(){

        int a=14;
        int b=5;

        int c= a/b;
        int r= a%b;

        System.out.println(c);
        System.out.println(r);
        System.out.println(10/2*5);
    }

    public static double area(int b, int h){

        double areaOfTri = (b*h)/2;

        return areaOfTri;
    }

    public static double area2(int a, int b, int c){

        double s = (a+b+c)/2;
        double x = s-a;
        double y= s-b;
        double z = s-c;
        double area = Math.sqrt(s*x*y*z);
        return area;
    }

    public static double [] quadraticRoots(double a, double b, double c){

        double[] totalRoots = new double[2];
        double d = (b*b) - (4*a*c);
        if(d < 0){
            return totalRoots;
        }

        double denom = 2*a;
        double sqrtPart = Math.sqrt((b*b) - (4*a*c));

        double root1 = (-b+sqrtPart)/denom;
        double root2 = (-b-sqrtPart)/denom;
        totalRoots[0] = root1;
        totalRoots[1] = root2;

        return totalRoots;

    }
}
