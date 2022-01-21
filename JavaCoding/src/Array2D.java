public class Array2D {
    public static void main(String[] args)
    {
        practice2d();
        addMatrix();
        multiplyMatrix();

    }
    public static void practice2d(){

        int A[][]=new int[5][5];


        int B[][];
        B=new int[5][5];

        int [][]C=new int[5][5];
        int []D[]=new int[5][5];


        int[] E[],F;
        E=new int[5][5];
        F=new int[5];

        //G H and I are 1D arrays
        int[] G,H,I;



        int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        //Jagged Array
        int X[][];
        X=new int[3][];

        X[0]=new int[5];
        X[1]=new int[3];
        X[2]=new int[8];


       
        for(int x[]:M)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }

    public static void addMatrix(){
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};

        int C[][]=new int[3][3];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];

            }
        }

        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
    public static void multiplyMatrix(){
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};

        int C[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }

        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
