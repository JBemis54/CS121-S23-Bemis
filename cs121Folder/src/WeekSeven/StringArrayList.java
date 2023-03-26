package WeekSeven;

import java.util.ArrayList;
public class StringArrayList {
    private ArrayList<String> wordList = new ArrayList<>();

    public void addWords (String word){
        wordList.add(word);
    }
    public void removeWords (String word){
        wordList.remove(word);
    }
    public int wordLength (){
        return wordList.size();
    }
    public String getWord (int index){
        return wordList.get(index);
    }
    public void forEachDisplay (){
       for(Object word: wordList){
           System.out.printf("%s ", word);

       }
        System.out.println();
    }
    public void forDisplay (){
        for(int i = 0; i < wordList.size(); i++){
            System.out.printf("%s ", wordList.get(i));
        }
        System.out.println();
    }

}
