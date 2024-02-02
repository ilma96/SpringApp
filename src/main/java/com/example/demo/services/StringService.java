package com.example.demo.services;

public class StringService {
    public String reverseAString(String a){
        String reversed_string = "";
        char c;
        for(int i = 0; i < a.length(); i++){
            c = a.charAt(i);
            reversed_string = c + reversed_string;
        }
        a = reversed_string;
        return a;
    }
}
