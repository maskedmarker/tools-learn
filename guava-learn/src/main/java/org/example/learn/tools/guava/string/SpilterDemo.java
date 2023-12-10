package org.example.learn.tools.guava.string;

import com.google.common.base.Splitter;

public class SpilterDemo {
    public static void main(String[] args) {
        new SpilterDemo().testSplitter();
    }

    private void testSplitter(){
        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("the ,quick, , brown         , fox,              jumps, over, the, lazy, little dog."));
    }


}
