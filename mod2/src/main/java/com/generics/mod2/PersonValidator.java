package com.generics.mod2;

public class PersonValidator implements Validator<Person> {

    @Override
    public boolean isValid(Person result) {

        return result.getName().toString() != "" && result.getSurname().toString() != "";
    }
}
