/*校验的规则为：录入的文件名称必须以“.java”结尾，
录入的邮箱地址中必须包含有“@”符号和“.”符号，且“@”在“.”之前
 */
public class P3 {
    public static void main(String[] args){

    }

    public static void checkfile(String file){
        int fth=file.indexOf('.');
        if(file.indexOf('.',fth+1)!=-1)
            System.out.println("");
    }

    public static void checkmail(String mail){

    }
}
