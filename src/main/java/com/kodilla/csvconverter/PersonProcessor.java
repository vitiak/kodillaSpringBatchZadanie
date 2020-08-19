package com.kodilla.csvconverter;

import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<com.kodilla.csvconverter.Person, com.kodilla.csvconverter.Person> {

    @Override
    public com.kodilla.csvconverter.Person process(com.kodilla.csvconverter.Person item) throws Exception {
        return new com.kodilla.csvconverter.Person(item.getImie(), item.getNazwisko(),
                2020 - Integer.parseInt(item.getDataUrodzenia().substring(6)));
    }

}
