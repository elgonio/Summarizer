/*
    TODO:
    clean up useless code
    fix the issue with splits on .
 */
package com.company;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "The Sherlock team are reuniting on a new version of the classic horror story Dracula, RadioTimes.com can confirm.\n" +
                "Steven Moffat and Mark Gatiss are due to begin work on a series of BBC specials based on the classic 1897 novel by Bram Stoker in which the bloodthirsty count moves from Transylvania to England.\n" +
                "The Corporation is finalising talks with the pair and is poised to green-light the project which is likely to air in 2019.\n" +
                "The new Dracula series has not yet been written and Gatiss and Moffat will begin working on the scripts once they have both completed their own solo projects – details of which have not been confirmed.\n" +
                "Sherlock producer – and Moffat's wife – Sue Vertue will produce Dracula for Sherlock production house Hartswood Films.\n" +
                "“It’s early days and the BBC has not seen a script yet but they are close to signing a deal for a series of 90-minute films of Dracula,” said a senior production source.\n" +
                "“It’s not yet been decided if it will be historical or modern day or if there will be a US co-producer but the BBC are keen on this and it will happen. What needs to be decided is how many episodes – whether there are three or five or six or whatever but they will definitely be 90-minute films.\n" +
                "\"Production is at least a year away so it will probably be on screen in 2019 at the earliest.”\n" +
                "Dracula will be the first collaboration between Moffat and Gatiss since the last Sherlock episode aired in January – and the pair have made no secret of their desire to work together again.\n" +
                "Moffat first revealed his desire to collaborate with Gatiss again post-Sherlock at the Radio Times Covers Party earlier this year, saying: \"That is because I love him\".\n" +
                "Gatiss has often spoken of his fondness for the Dracula story – particularly the 1958 film starring Christopher Lee and Peter Cushing – and even played the title role himself in a recent audio drama, but it currently seems unlikely that he will take on the part of the Count in the new version, according to sources.\n" +
                "“Casting is a long way off but the feeling is he probably won’t – but you never know,” said a BBC source. \n" +
                "The producers will be hoping for more success with this project than the version of Dracula made by Downton Abbey producers Carnival Films in 2013 starring Jonathan Rhys Meyers. The ten-episode run aired on NBC and Sky Living in the UK and was axed after one series.\n" +
                "As for the next series of Sherlock, a production source said: “Sherlock will return when Sherlock returns.”";


        summarize(s);
    }

    private static void summarize(String text)
    {
        int reduction_factor = 2;
        HashMap<String, Integer> sentences = calculate_scores(text);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(Map.Entry entry: sentences.entrySet())
        {
            numbers.add((int)entry.getValue());
        }
        Collections.sort(numbers);
        int limit = numbers.get(numbers.size()/reduction_factor);
        System.out.println("numbers size: " + String.valueOf(numbers.size()));
        System.out.println("sentences size: " + String.valueOf(sentences.size()));

        for(Map.Entry entry: sentences.entrySet())
        {
            if ((int)entry.getValue() > limit)
            {
                System.out.println(entry.getKey());
            }
        }

    }

    private static HashMap<String,Integer> calculate_scores(String text)
    {
        String[] raw_sentences = text.split("\\.");
        System.out.println("raw_sentences size: " + String.valueOf(raw_sentences.length));
        HashMap<String,Integer> sentences = new HashMap<String, Integer>();
        HashMap<String,Integer> phrases_scores = getKeyWords_map(text);

        // this block calculates the scores of each sentence and stores them
        for (String sentence : raw_sentences)
        {
            int score = 0;
            ArrayList<String> sentence_phrases = getAllPhrases(sentence);

            for (String phrase: sentence_phrases)
            {
                System.out.println("searching for phrase: " + phrase);
                score = score + phrases_scores.get(phrase);
            }

            sentences.put(sentence,score);
        }

        return sentences;
    }

    private static ArrayList<String> getAllPhrases(String text)
    {
        String[] words = text.split(" ");
        ArrayList<String> phrases = new ArrayList<String>();

        for (int v = 0 ; v < words.length; v++)
        {
            phrases.addAll(generate_n_word_phrases(v,text));
        }

        return phrases;
    }

    private static ArrayList<String> generate_n_word_phrases(int n, String text)
    {
        String[] words = text.split(" ");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= words.length-n; i++)
        {
            String phrase = "";
                for (int k = 0 ; k < n ; k++)
                {
                    phrase = phrase + " " + words[i+k];
                }

            if (!phrase.trim().equals(""))
            {
                result.add(phrase);
            }
        }

        return result;
    }

    private static HashMap<String, Integer> getKeyWords_map(String text)
    {
        String[] words = text.split(" ");
        HashMap<String, Integer> phrases = new HashMap<String, Integer>();

        for (int v = 0 ; v < words.length; v++)
        {
            phrases.putAll(generate_n_word_phrases_map(v,text));
        }

        return phrases;
    }

    private static HashMap<String, Integer> generate_n_word_phrases_map(int n, String text)
    {
        String[] words = text.split(" ");

        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i <= words.length-n; i++)
        {
            String phrase = "";
            for (int k = 0 ; k < n ; k++)
            {
                phrase = phrase + " " + words[i+k];
            }

            if (!phrase.trim().equals(""))
            {
                if (result.containsKey(phrase))
                {
                    result.put(phrase,result.get(phrase) + 1);
                }else
                {
                    result.put(phrase,1);
                }
            }
        }

        return result;
    }
}
