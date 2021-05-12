package String;

public class StringMethodsPartI {
    public static void main(String[] args) {
        String text = "Never stop learning";
        char ch = text.charAt(9);
        System.out.println(text.charAt(6));  //6. char is s
        System.out.println(ch);  // ch is p
        //System.out.println(text.charAt(50)); // exceptionError is occurred in here. we don't have 50th char!
        String text2 = text.concat(" to achieve").concat(" success");
        System.out.println(text2);
        System.out.println(text.contains("stop"));
        System.out.println(text.endsWith("ing"));
        System.out.println(text.indexOf("ver"));
        System.out.println(text.lastIndexOf("e")); //e is used multiple times. last "e" is in 12th index.
        System.out.println(text.length());
        System.out.println(text.replace("e","a"));
        System.out.println(text.substring(4));
        System.out.println(text.substring(4,10));
        //****//
        char[] charArray= text.toCharArray();
        System.out.println(text);
        for (int i=0; i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
    }
}
