package org.example;

public class sixnine {
    public static int maxsixn(int num){
        String str = String.valueOf(num);
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='6'){
                        return Integer.parseInt(str.substring(0,i)+'9'+str.substring(i+1));
                    }
                }
                return num;

    }

    public static void main(String[] args) {
        int num = 9699;
        int result =  maxsixn(num);
        System.out.println(result);
    }
}

