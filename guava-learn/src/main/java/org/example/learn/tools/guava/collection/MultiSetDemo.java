package org.example.learn.tools.guava.collection;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.*;

public class MultiSetDemo {
    public static void main(String[] args) {
        MultiSetDemo demo = new MultiSetDemo();
        demo.oldTestWordCounts();
        demo.newTestWordCounts();
    }

    private void oldTestWordCounts() {
        String strWorld = "wer|dfd|dd|dfd|dda|de|d";
        String[] words = strWorld.split("\\|");
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            Integer count = countMap.get(word);
            if (count == null) {
                countMap.put(word, 1);
            } else {
                countMap.put(word, count + 1);
            }
        }
        System.out.println("countMap：");
        for (String key : countMap.keySet()) {
            System.out.println(key + " count：" + countMap.get(key));
        }
    }

    private void newTestWordCounts() {
        String strWorld = "wer|dfd|dd|dfd|dda|de|dr";
        String[] words = strWorld.split("\\|");
        List<String> wordList = new ArrayList<String>();
        for (String word : words) {
            wordList.add(word);
        }
        Multiset<String> wordsMultiset = HashMultiset.create();
        wordsMultiset.addAll(wordList);

        System.out.println("MultiSet countMap：");
        for (String key : wordsMultiset.elementSet()) {
            System.out.println(key + " count：" + wordsMultiset.count(key));
        }
    }
}
