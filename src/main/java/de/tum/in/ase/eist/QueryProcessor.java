package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Peter";
        } else if (query.contains("plus")){
            String str = query.replaceAll("[^-?0-9]+", " ");

            return Integer.toString(Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0)) + Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1)));
        } else if (query.contains("largest")){
            String str = query.replaceAll("[^-?0-9]+", " ");
            int maxValue = 0;
            for (Integer integer : Arrays.asList(Integer.parseInt(String.valueOf(str.trim().split(" "))))) {
                if (integer > maxValue)
                    maxValue = integer;
            }
            return Integer.toString(maxValue);
        } else {
            return "";
        }
    }
}
