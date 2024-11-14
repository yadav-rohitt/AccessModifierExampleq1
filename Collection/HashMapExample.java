import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
    public static void main(String[] args) {
       
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        
        for (String word : words) {
           
            if (wordCount.containsKey(word)) {
              
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
               
                wordCount.put(word, 1);
            }
        }
       
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}