import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int treeNo=scanner.nextInt();
        if(treeNo<=col || treeNo%col==0 || treeNo%col==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}