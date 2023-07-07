package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        List<String> numbers = new ArrayList<>();
        this.phonebook = map;

    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        List<String> number = new ArrayList<>();
        number.add(phoneNumber);
        phonebook.put(name, number);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> numbers = Arrays.asList(phoneNumbers);
        phonebook.put(name, numbers);

    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for(Map.Entry m: phonebook.entrySet()){
            if(m.getValue().equals(phoneNumber)){
                return m.getKey().toString();
            }
        }

        return null;
    }

    public List<String> getAllContactNames() {
      List<String> names = new ArrayList<>();
      names.addAll(phonebook.keySet());
      return names;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
