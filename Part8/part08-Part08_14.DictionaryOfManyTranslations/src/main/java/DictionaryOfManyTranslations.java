
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionaryTranslation;

    public DictionaryOfManyTranslations() {
        this.dictionaryTranslation = new HashMap<>();
    }

    // Adds the translation for the word and preserves the old translations.
    public void add(String word, String translation) {

        // Creates a new word if the key did not exist initially
        this.dictionaryTranslation.putIfAbsent(word, new ArrayList<>());

        // Let's first retrieve the list containing the exercises completed by the user and add to it
        this.dictionaryTranslation.get(word).add(translation);
    }

    // Returns a list of the translations added for the word. 
    // If the word has no translations, the method should return an empty list.
    public ArrayList<String> translate(String word) {
        if (!this.dictionaryTranslation.containsKey(word)) {
            return new ArrayList<>();
        }
        return this.dictionaryTranslation.get(word);
    }

    // Removes the word and all its translations from the dictionary
    public void remove(String word) {
        this.dictionaryTranslation.remove(word);
    }
}
