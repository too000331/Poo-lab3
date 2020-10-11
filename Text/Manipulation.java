package Text;

public class Manipulation {

    public static int NrSentences(String str) {
        int count = str.split("[!?.:]+").length;
        return count;

    }

    public static int NrWords(String str) {
        int count = str.split("\\s+").length;
        return count;
    }

    public static int NrLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        return count;
    }

    public static int[] NrVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
            else if (c >= 'a' && c <= 'z')
                consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static String TheMostFrequentWord(String str) {
        String[] words = str.split("\\s+");
        String word="";
        int count =0;
        int maxCount=0;
        for (int i = 0; i < words.length; i++) {
            count=1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
           if (count>maxCount) {
               maxCount = count;
               word = words[i];
           }

        }

        return word;

    }

    public static String TheLongestWord(String str){
        String[] wordList=WordList(str);
        String longest=wordList[0];
        for (String w:wordList) {
            if(w.length()>longest.length())
                longest=w;
        }
        return longest;

    }

    public static String[] WordList(String str){

        return str.toLowerCase().split("\\s+");
    }

}
