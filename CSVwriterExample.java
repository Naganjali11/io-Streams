package com.codegnan.iostreams;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVwriterExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("malli", 27, "hyd"));
        people.add(new Person("arjun", 22, "vjy"));
        people.add(new Person("sunny", 37, "bng"));
        try (PrintWriter out = new PrintWriter("people.csv")) {
            out.println("name,age,city");
            out.println();
            for (Person person : people) {
                out.println(person.toCSV());
                out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}