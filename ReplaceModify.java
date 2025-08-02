package oop;

class ReplaceModify {
    public static void main(String[] args) {
        String s = "Varma";
        System.out.println(s.replace('V', 'v'));         
        System.out.println(s.replace("ar", "AR"));     
        System.out.println(s.replaceAll("a.", "h"));    
        System.out.println(s.replaceFirst("ma", "MA")); 
    }
}

