/*
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。
 */
class Solution {
    public static boolean isPalindrome(String s) {
        char[] ss=s.toCharArray();
        char[] a=new char[ss.length];
        int j=0;
        for(int i=0;i<ss.length;i++){
            if(Character.isDigit(ss[i])||Character.isLetter(ss[i])){
                a[j]=ss[i];
                j++;
            }
        }
        StringBuffer b=new StringBuffer();
        for(int i=0;i<a.length;i++){
           if(Character.isDigit(a[i])||Character.isLetter(a[i])){
               b.append(a[i]);
           }
        }
        String c=b.toString();
        String d=c.toLowerCase();
        String e=b.reverse().toString();
        String f=e.toLowerCase();
        return d.equals(f);

    }

    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}