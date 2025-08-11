package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreekAlphabet implements Alphabet{

    @Override
    public Map<Character, Integer> getLetterScores() {
        List<Character> value_1 = List.of('α','ε','ι','ο','φ','ξ');
        List<Character> value_2 = List.of('β','δ','π');
        List<Character> value_3 = List.of('γ','η','ν','τ');
        List<Character> value_4 = List.of('ζ','κ','ρ','ψ','λ');
        List<Character> value_5 = List.of('θ','χ');
        List<Character> value_8 = List.of('μ','σ');
        List<Character> value_10 =List.of('υ','ω');


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
