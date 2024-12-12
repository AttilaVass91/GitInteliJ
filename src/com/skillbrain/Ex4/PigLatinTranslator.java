package com.skillbrain.Ex4;

public class PigLatinTranslator {

    public String translate(String input){
        String[] words = input.split("\\s+");
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : words) {
            translatedSentence.append(translateWord(word)).append(" ");
        }
        return translatedSentence.toString().trim();
    }

    private String translateWord(String word){
        word = word.toLowerCase(); // Assume case insensitivity
        if (startsWithVowelSound(word)){
            return word + "ay";
        } else if (startsWithConsonantClusterFollowedByQu(word)) {
            int quIndex = word.indexOf("qu") + 2;
            return word.substring(quIndex) + word.substring(0, quIndex) + "ay";
        } else if (startsWithConsonantCluster(word)) {
            int firstVowelIndex = firsVowelIndex(word);
            return word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
        }else {
            return word; // Cazurile care nu intra in regulile care le vom declara noi
        }
    }

    private boolean startsWithVowelSound(String word){
        String vowels = "aeiou";
        return vowels.contains(String.valueOf(word.charAt(0))) ||
                word.startsWith("xr") || word.startsWith("yt");
    }

    private boolean startsWithConsonantCluster(String word){
        return !startsWithVowelSound(word);
    }

    private boolean startsWithConsonantClusterFollowedByQu(String word){
        return word.contains("qu") && firsVowelIndex(word) > word.indexOf("qu");
    }

    private int firsVowelIndex(String word){
        String vowels = "aeiouy";
        for (int counter = 0; counter < word.length(); counter++){
            if (vowels.contains(String.valueOf(word.charAt(counter)))){
                return counter;
            }
        }
        return -1; // Aici ajungem cand cuvantul nu are nici o vocala sau litera y
    }
}
