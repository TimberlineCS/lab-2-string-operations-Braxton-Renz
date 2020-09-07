public class WordScramble{
  public static void main(String args[]){
    String word = "Popcorn";
    String wordLower = word.toLowerCase();
    String firstHalf = wordLower.substring(0, wordLower.length()/2);
    String secondHalf = wordLower.substring(wordLower.length()/2);

    System.out.println(secondHalf + firstHalf);
  }
}