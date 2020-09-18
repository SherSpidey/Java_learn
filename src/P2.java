//打印杨辉三角形
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        int row;
        System.out.print("请输入杨辉三角形的行数：");
        Scanner get_num = new Scanner(System.in);
        row=get_num.nextInt();

        t_print(row);
    }
    public static void t_print(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                for(int n =1;(n<=row-i)&&j==1;n++)
                    System.out.print("\t");
                System.out.print(calculate(i,j)+"\t"+"\t");
            }
            System.out.println();
        }
    }
    public static int calculate(int x,int y){
        if(x==y||y==1)
            return 1;
        else
            return calculate(x-1,y)+calculate(x-1,y-1);
    }
}
