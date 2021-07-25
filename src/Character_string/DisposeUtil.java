package Character_string;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class DisposeUtil {
    //总方法
    public void change(String str){
        String[] s=str.split(",");
        for (String value : s) {
            if (isDigit(value)) {
                System.out.println(value + "由数字组成\n排序结果为");
                System.out.println(Arrays.toString(StringToIntSort(value)));
            } else if (isAlpha(value)) {
                if (isUpper(value)) {
                    System.out.println(value + "全由大写字母组成");
                } else if (isLower(value)) {
                    System.out.println(value + "全由小写字母组成");
                }
                System.out.println(value + "排序结果\n" + Arrays.toString(StringToCharSort(value)));
                System.out.println(value + "全转化为大写字母" + UpperString(value));
            } else {
                System.out.println(value + "既不全为数字也不全为字母");
            }
        }
    }
    //是否全为数字
    public boolean isDigit(@NotNull String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i)))return false;
        }
        return true;
    }
    //是否全为字母
    public boolean isAlpha(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isAlphabetic(s.charAt(i)))return false;
        }
        return true;
    }
    //是否全为大写字母
    public boolean isUpper(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isUpperCase(s.charAt(i)))return false;
        }
        return true;
    }
    //是否全为小写字母
    public boolean isLower(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isLowerCase(s.charAt(i)))return false;
        }
        return true;
    }
    //小写全转大写
    public String UpperString(String s){
        StringBuilder result= new StringBuilder();
        for(int i=0;i<s.length();i++){
            result.append(Character.toUpperCase(s.charAt(i)));
        }
        return result.toString();
    }
    //数字排序
    public int[] StringToIntSort(String s){
        int[] a= Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        return a;
    }
    //字母排序
    public char[] StringToCharSort(String s){
        char[] a=s.toCharArray();
        Arrays.sort(a);
        return a;
    }
}
