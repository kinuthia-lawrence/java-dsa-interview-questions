package com.larrykin.classwork.practice;

public class Database {
    private String name;

    private static Database instance;

    public static synchronized Database getInstance(String name){ //synchronized mean no thread can call this instance more than 1 time
        if (null == instance) {
            instance = new Database(name);
            return instance;
        }

        return instance;

    }





    public Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "Database class \n" +
                "Name: " + this.name;
        return text;
    }
}
