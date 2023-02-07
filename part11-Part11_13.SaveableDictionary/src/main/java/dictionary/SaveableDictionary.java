/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

/**
 *
 * @author Ste-PC
 */
public class SaveableDictionary {

    private ArrayList<String> finnishWords;
    private ArrayList<String> englishWords;
    private String file;
    private Scanner fileReader;

    public SaveableDictionary() {
        this.finnishWords = new ArrayList<>();
        this.englishWords = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = "file.txt";
    }

    public void add(String words, String translation) {
        this.finnishWords.add(words);
        this.englishWords.add(translation);
    }

    public String translate(String word) {
        for (String string : finnishWords) {
            if (string.equals(word)) {
                return englishWords.get(finnishWords.indexOf(word));
            }
        }
        for (String string : englishWords) {
            if (string.equals(word)) {
                return finnishWords.get(englishWords.indexOf(word));
            }
        }
        return null;
    }

    public void delete(String word) {
        if (finnishWords.contains(word)) {
            englishWords.remove(finnishWords.indexOf(word));
            finnishWords.remove(word);
        } else if (englishWords.contains(word)) {
            finnishWords.remove(englishWords.indexOf(word));
            englishWords.remove(word);
        }
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
        } catch (IOException ex) {
            return false;
        }
        while (this.fileReader.hasNextLine()) {
            String entry = fileReader.nextLine();
            String[] parts = entry.split(":");
            this.finnishWords.add(parts[0]);
            this.englishWords.add(parts[1]);
        }
        return true;
    }
}
