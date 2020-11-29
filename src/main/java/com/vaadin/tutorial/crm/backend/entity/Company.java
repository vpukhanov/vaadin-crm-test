package com.vaadin.tutorial.crm.backend.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Company extends AbstractEntity {
    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private final List<Contact> employees = new LinkedList<>();
    @NotNull
    @NotEmpty
    private String name;

    public Company() {

    }

    public Company(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getEmployees() {
        return employees;
    }
}
