package com.company;

public class Q7 {
    public static void main(String[] args) {
        String name="shubham";
        char target='u';
        boolean ans=find_char(name,target);
        System.out.println(ans);

    }
    static boolean find_char(String name,char target){
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
