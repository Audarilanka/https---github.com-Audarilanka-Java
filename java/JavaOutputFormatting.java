import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //String s1=sc.nextLine();
            //int x = sc.nextInt();
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s=sc.next();
                int y=sc.nextInt();
                System.out.printf("%-15s%03d%n",s,y);
            }
            System.out.println("================================");

    }
}



