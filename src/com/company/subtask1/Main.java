package com.company.subtask1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT ...");
        // ...
        Database bar = Database.getInstance();
        bar.query("SELECT ...");
        // The variable `bar` will contain the same object as
        // the variable `foo`.
    }
}
