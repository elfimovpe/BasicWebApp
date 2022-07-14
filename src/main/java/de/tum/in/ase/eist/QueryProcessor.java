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
        } else if (query.contains("plus")){ // TODO extend the programm here
            String str = query.replaceAll("[^-?0-9]+", " ");

            return Arrays.asList(str.trim().split(" ")).get(0) + Arrays.asList(str.trim().split(" ")).get(1);
        } else {
            return "";
        }
    }
}
