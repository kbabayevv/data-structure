package corejavatasks.additionalexercises;

public class WordReverser {
    public static void main(String[] args) {
        WordReverser w = new WordReverser();
        System.out.println(w.reverseWordsInSentence("Hello World"));

    }

    public String reverseWordsInSentence(String sentence) {
        String reversed = "";
        if (sentence == null) {
            return "INVALID";
        } else if (sentence.isEmpty()) {
            return "";
        } else {
            sentence = sentence.trim();
            String[] array = sentence.split(" ");
            for (int i = 0; i < array.length; i++) {
                StringBuilder sb = new StringBuilder(array[i]);
                sb.reverse();
                reversed= reversed.concat(" " + sb.toString());
            }
        }
        return reversed.trim();
    }
}
