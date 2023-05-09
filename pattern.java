import java.util.Scanner;

public class pattern{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter NO of Rows and coluns");
        int n = sc.nextInt();
        ascendingstar( n);
        System.out.println();
        descendingstar(n);

    }


        // Ascendig pattern function
        static void ascendingstar(int n){

        for (int row=1;row<=n;row++) {
            for(int col=1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

       

         // Descending pattern function
       static void descendingstar(int n){
   
    for (int row=0;row<n;row++) {
        for(int col=0; col<=n-row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
}


}