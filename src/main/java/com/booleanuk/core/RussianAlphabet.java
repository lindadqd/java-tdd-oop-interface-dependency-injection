package com.booleanuk.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RussianAlphabet implements Alphabet {
    @Override
    public Map<Character, Integer> getLetterScores() {
        List<Character> value_1 = List.of('а', 'б', 'в', 'г', 'д');
        List<Character> value_2 = List.of('е', 'ё', 'ж', 'з', 'и');
        List<Character> value_3 = List.of('й', 'к', 'л', 'м', 'н');
        List<Character> value_4 = List.of('о', 'п', 'р', 'с', 'т', 'у', 'ф');
        List<Character> value_5 = List.of('х', 'ц', 'ч', 'ш');
        List<Character> value_8 = List.of('щ', 'ъ', 'ы');
        List<Character> value_10 =List.of('ь', 'э', 'ю');


        HashMap<Character,Integer> scores = new HashMap<>();

        value_1.forEach(x -> scores.put(x, 1));
        value_2.forEach(x -> scores.put(x, 2));
        value_3.forEach(x -> scores.put(x, 3));
        value_4.forEach(x -> scores.put(x, 4));
        value_5.forEach(x -> scores.put(x, 5));
        value_8.forEach(x -> scores.put(x, 8));
        value_10.forEach(x -> scores.put(x, 10));

        return scores;
    }
}
