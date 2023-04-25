package com.ernany.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private Random rand = new Random();
    private String name;
    private Integer id;
    private Endereco end;
    public List<Task> tasks = new ArrayList<>();

    public User(String name, Endereco end) {
        this.name = name;
        id = rand.nextInt(999);
        this.end = end;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public void removeTasks(Task task){
        this.tasks.remove(task);
    }

    public void addTasks(Task task) {
        this.tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return this.getName() + " : " +  this.getId() + "\n" +
                this.getEnd() + tasks ;
    }
}
