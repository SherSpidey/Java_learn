//输入年份月份，打印当月的月历
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class P6 {

    public static Pattern REG = Pattern.compile("\\d+");
    public static void main(String[] args){
        System.out.print("请输入年份与月份：");
        int[] date;
        while (true){
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            date = getnum(str);
            if(date[0]>0&&date[1]>0&&date[1]<32)
                break;
            System.out.print("你输入的年份月份有误。请重新输入：");
        }

        System.out.println("Year:"+date[0]+", Month:"+date[1]);
    }
    public static int[] getnum(String data){
        Matcher strnum = REG.matcher(data);
        int[] yam={0,0};
        for(int i=0;strnum.find()&&i<2;i++){
            yam[i]=Integer.parseInt(strnum.group());
        }
        return yam;
    }
}
