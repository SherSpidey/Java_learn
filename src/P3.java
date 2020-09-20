/*校验的规则为：录入的文件名称必须以“.java”结尾，
录入的邮箱地址中必须包含有“@”符号和“.”符号，且“@”在“.”之前
 */
import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        System.out.print("请输入上传的java文件：");
        Scanner loadS=new Scanner(System.in);
        String file = loadS.next();
        while (checkfile(file)==0){
            System.out.print("上传的java文件格式错误！请重新输入：");
            loadS=new Scanner(System.in);
            file = loadS.next();
        }
        System.out.print("请输入您的邮箱地址：");
        loadS=new Scanner(System.in);
        String mail = loadS.next();
        while (checkmail(mail)==0){
            System.out.print("输入的邮箱格式有误！请重新输入：");
            loadS=new Scanner(System.in);
            mail = loadS.next();
        }
        System.out.println("文件上传完毕！");
    }

    public static int checkfile(String file){
        int fth=file.indexOf('.');
        if(fth!=-1) {
            if(file.indexOf('.', fth + 1)==-1&&(file.endsWith("java")||file.endsWith("JAVA"))){
                if(file.indexOf("java|JAVA",fth+1)==file.lastIndexOf("java|JAVA"))
                    return 1;
            }
        }
        return 0;
    }

    public static int checkmail(String mail){
        int fth =mail.indexOf('@');
        if(fth!=-1){
            if(mail.indexOf('@',fth+1)==-1){
                if(mail.indexOf('.')>fth)
                    return 1;
            }
        }
        return 0;
    }
}
