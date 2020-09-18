/*
某航空公司为吸引更多的顾客推出了优惠活动。
原来的飞机票价为 3000 元，活动时，4~11 月旺季，头等舱 9 折，经济舱 8 折；
1~3 月、12 月淡季，头等舱 5 折，经济舱 4 折，求机票的价格。
 */
import java.util.Scanner;
public class P1 {
    final static int TIK=3000;
    public static void main(String[] args){
        double price =0;
        System.out.println("请输入当前的月份：");
        Scanner getm = new Scanner(System.in);
        int month = getm.nextInt();
        System.out.println("请输入机舱类型：");
        getm.nextLine();
        String type = getm.next();

        switch (month){
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                switch (type) {
                    case "头等舱" -> price = TIK * 0.9;
                    case "经济舱" -> price = TIK * 0.8;
                }
                break;
            default:
                switch (type) {
                    case "头等舱" -> price = TIK * 0.5;
                    case "经济舱" -> price = TIK * 0.4;
                }
        }

        if(month>12||month<1)
            System.out.println("您输入月份有误！");
        else if(!("头等舱".equals(type)||"经济舱".equals(type)))
            System.out.println("您输入的机舱类型有误！");
        else
            System.out.printf("您的%s机票价格为%.0f \n",type,price);

    }
}
