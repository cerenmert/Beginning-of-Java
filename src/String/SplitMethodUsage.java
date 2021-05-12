package String;

public class SplitMethodUsage {
    public static void main(String[] args) {
        String sentence="Come rain or shine";
        String[] updatedSentence= sentence.split("in");
        for (int i=0; i< updatedSentence.length; i++){
            System.out.println(updatedSentence[i]);
        }
    }
}
