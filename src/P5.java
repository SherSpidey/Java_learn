/*
验证IP地址
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class P5 {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");  //注意符号\,/的区别，以及java中要主要打出两个\对第二个\进行转义！
        String conti;
        do{
            System.out.print("请输入正确的IP地址：");
            Scanner scan = new Scanner(System.in);
            String IP = scan.next();
            Matcher matcher = pattern.matcher(IP);

            if(matcher.matches()&&secondmatch(IP)){
                System.out.println("输入的IP格式正确！");
            }
            else
                System.out.println("输入的IP地址格式错误！");
            System.out.print("是否再次输入？Yes/y to continue：");
            conti=scan.next();
        }
        while (conti.equalsIgnoreCase("y")||conti.equalsIgnoreCase("yes"));
        System.out.println("本次输入结束！");
    }
    public static boolean secondmatch(String IP){
        String[] parts = IP.split("\\.");
        for(String part : parts){
            if(Integer.parseInt(part) <0|| Integer.parseInt(part) >=256)
                return false;
        }
        return true;
    }
}
