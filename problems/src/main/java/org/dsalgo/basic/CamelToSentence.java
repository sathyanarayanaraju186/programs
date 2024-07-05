package org.dsalgo.basic;

import java.util.Arrays;

public class CamelToSentence {
    public static String camelCaseToSentenceCase(final String input) {

        String sentenceCaseInput = input;
        // if the input is in camel case then convert it to sentence case
        if (Character.isUpperCase(input.trim().charAt(0))) {
            sentenceCaseInput = input.trim().replaceAll("([A-Z])", " $1")
                                     .toLowerCase();
        } else if (Character.isLowerCase(input.trim().charAt(0))) {
            sentenceCaseInput = input.trim().substring(0, 1)
                                     .toUpperCase() + input.trim().substring(1)
                                                           .replaceAll("([A-Z])", " $1")
                                                           .toLowerCase();
        }
        return sentenceCaseInput;
    }
}

