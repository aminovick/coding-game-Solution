package com.solution;

public class reshape {

    public static void main(String[] args) {
        System.out.println(reshape(3,"abc de fghij"));
        System.out.println(reshape(2,"1 23 456"));

    }

    public static String reshape(int n,String str) {
        str=str.replace(" ", "");
        String res="";
        for(int i=0;i<str.length();i++) {
            if(i%n==0 && i!=0) {
                res=res+'\n'+str.charAt(i);

            }
            else {
                res+=str.charAt(i);
            }
        }
        return res;

    }
}

