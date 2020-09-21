/*对字符进行加密，
拥有加密解密两种功能
 */
import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        System.out.print("输入要加密的字符串：");
        Scanner getin = new Scanner(System.in);
        String instr = getin.nextLine();
        String coded = code(instr);
        System.out.println("加密后的字符串为"+coded);
        String decoded = decode(coded);
        System.out.println("解密后的字符串为"+decoded);
    }
    public static String code(String str){
        int i = 0;
        char[] coded = str.toCharArray();
        for(char letter : str.toCharArray()){
            coded[i++]=(char) ((letter^i)+i);
        }
        return new String(coded,0, coded.length);
    }
    public static String decode(String str){
        int i = 0;
        char[] decoded = str.toCharArray();
        for(char letter : str.toCharArray()){
            decoded[i++]=(char) ((letter-i)^i);
        }
        return new String(decoded,0, decoded.length);
    }
}
/*
编后感想：
1、有一些地方明明看过，却不怎么记得起来，比如java中字符串不能再进行索引操作
2、数学功底太差，连加密解密方法都想不出几种靠谱的来
 */