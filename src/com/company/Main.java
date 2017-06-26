/*
    TODO:
    fix the issue with splits on . [this may be caused by punctuation]
 */
package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text_file = "res/example.txt";
        try {
            InputStream is = new FileInputStream(text_file);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder text_builder = new StringBuilder();

            String line = br.readLine();
            while (line != null)
            {
                    text_builder.append(line).append("\n");
                    line = br.readLine();
            }

            String text = text_builder.toString();
            summarize(text);
        }catch (FileNotFoundException f)
        {
            System.out.println("It seems that file does not exist :(");
        }catch (IOException i)
        {
            System.out.println("Whoops. A reading error has occurred");
        }


    }

    private static void summarize(String text)
    {
        int reduction_factor = 2;
        ArrayList<String> output = new ArrayList<String>();
        HashMap<String, Integer> sentences = calculate_scores(text);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(Map.Entry entry: sentences.entrySet())
        {
            numbers.add((int)entry.getValue());
        }
        Collections.sort(numbers);
        int limit = numbers.get(numbers.size() - (numbers.size()/reduction_factor));

        for(Map.Entry entry: sentences.entrySet())
        {
            if ((int)entry.getValue() > limit)
            {
                output.add((String)entry.getKey());
            }
        }

        String[] raw_sentences = text.split("(?<=[.!?])\\s+");

        // this block just adds the first and last lines of the text to the output
        // this is done because they are almost always relevant to the text
        if (!output.contains(raw_sentences[0]))
        {
            output.add(0,raw_sentences[0]);
        }
        if (!output.contains(raw_sentences[raw_sentences.length-1]))
        {
            output.add(raw_sentences[raw_sentences.length-1]);
        }

        System.out.println("output size: " + String.valueOf(output.size()));
        for(String s : output)
        {
            System.out.println(s);
        }

    }

    private static HashMap<String,Integer> calculate_scores(String text)
    {
        String[] raw_sentences = text.split("(?<=[.!?])\\s+");
        System.out.println("raw_sentences size: " + String.valueOf(raw_sentences.length));
        HashMap<String,Integer> sentences = new HashMap<String, Integer>();
        HashMap<String,Integer> phrases_scores = getKeyWords_map(text);

        // this block calculates the scores of each sentence and stores them
        int counter = 0;
        for (String sentence : raw_sentences)
        {
            counter = counter+1;
            int score = 0;
            ArrayList<String> sentence_phrases = getAllPhrases(sentence);

            for (String phrase: sentence_phrases)
            {
                //System.out.println("searching for phrase: " + phrase);
                try {
                    score = score + phrases_scores.get(phrase);
                }catch (Exception e)
                {
                    //System.out.println("whoops");
                }

            }

            sentences.put(sentence,score);
            //System.out.println("calculating: " + String.valueOf(((float) counter/raw_sentences.length)*100) + "%");
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
            StringBuilder phrase = new StringBuilder();
            for (int k = 0 ; k < n ; k++)
            {
                phrase = phrase.append(" " + words[i+k]) ;
            }

            if (!phrase.toString().trim().equals(""))
            {
                result.add(phrase.toString());
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
            //System.out.println("phrase_generation: " + String.valueOf(((double)v/words.length)*100) + "%");
        }

        return phrases;
    }

    private static HashMap<String, Integer> generate_n_word_phrases_map(int n, String text)
    {
        String[] words = text.split(" ");
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        // a little heuristic/hack to improve performance
        // it is assumed that any phrase longer than 10 words is insignificant
        // thus to dramtically improve performance they are ignored
        if (n>10)
        {
            return result;
        }


        for (int i = 0; i <= words.length-n; i++)
        {
            StringBuilder phrase = new StringBuilder();
            for (int k = 0 ; k < n ; k++)
            {
                phrase.append(" ") ;
                phrase.append(words[i+k]) ;
            }

            if (!phrase.toString().trim().equals(""))
            {
                if (result.containsKey(phrase.toString()))
                {
                    result.put(phrase.toString(),result.get(phrase.toString()) + 1);
                }else
                {
                    result.put(phrase.toString(),1);
                }
            }
            //System.out.println("generation: " + String.valueOf(((double)i/p)*100)  + "%");
        }

        return result;
    }
}
