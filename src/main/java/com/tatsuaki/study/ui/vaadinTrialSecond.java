package com.tatsuaki.study.ui;

import com.tatsuaki.study.vaadin.second.Address;
import com.tatsuaki.study.vaadin.second.Person;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringUI(path = "/vaadin/trial/2")
@Theme("valo")
public class vaadinTrialSecond extends UI {

    @Override
    protected void init(VaadinRequest request) {

        List<Person> personList = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        personList.add(new Person(100, "Lucas", "Kane", 68,
                new Address("12080", "Washington"), "127-942-237"));
        personList.add(new Person(101, "Peter", "Buchanan", 38,
                new Address("93849", "New York"), "201-793-488"));
        personList.add(new Person(102, "Samuel", "Lee", 53,
                new Address("86829", "New York"), "043-713-538"));
        personList.add(new Person(103, "Anton", "Ross", 37,
                new Address("63521", "New York"), "150-813-6462"));
        personList.add(new Person(104, "Aaron", "Atkinson", 18,
                new Address("25415", "Washington"), "321-679-8544"));
        personList.add(new Person(105, "Jack", "Woodward", 28,
                new Address("95632", "New York"), "187-338-588"));

        Grid<Person> grid = new Grid<>(Person.class);
        grid.setItems(personList);
        grid.removeColumn("id");
        grid.setColumns("firstName", "lastName", "age", "address",
                "phoneNumber");

        setContent(grid);
    }

}
