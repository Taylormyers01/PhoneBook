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
        this.phonebook = new HashMap<>(map);

    }

    public PhoneBook() {
        this.phonebook = new HashMap<>();

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
        List<String> numbers = new ArrayList<>();
        for(Map.Entry m: phonebook.entrySet()){
            if(m.getValue().toString().contains(phoneNumber)){
                return m.getKey().toString();
            }
        }

        return null;
    }

    public List<String> getAllContactNames() {
      List<String> names = new ArrayList<>();
//      names.addAll(phonebook.keySet());
//      return names;
        for(Map.Entry m: phonebook.entrySet()){
            names.add(m.getKey().toString());
        }
        return names;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
