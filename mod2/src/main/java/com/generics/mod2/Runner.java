package com.generics.mod2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {


    public static void main(String[] args) throws ExecutorException {
        Executor<Person> personExecutor = new ExecutorImpl<>();

        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Garik", "Torin"),
                new Person("Tixon", ""),
                new Employee("Denis", "Rigon", "Developer"),
                new Employee("Tatia", "", "Engineer")
        ));

        for(Person person : persons){
            personExecutor.addTask(new PersonTask(person), new PersonValidator());
        }

        personExecutor.execute();

        System.out.println("Valid results: ");
        List<Person> validResults = personExecutor.getValidResults();
        validResults.forEach(System.out::println);

        System.out.println("Invalid result: ");
        List<Person> invalidResults = personExecutor.getInvalidResults();
        invalidResults.forEach(System.out::println);

    }



}