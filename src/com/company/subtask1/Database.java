package com.company.subtask1;

public class Database {
    private static Database instance = null;

    private Database() {
        instance = new Database();
    }

    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }

    public void query(String sql) {
        // For instance, all database queries of an app go
        // through this method. Therefore, you can place
        // throttling or caching logic here.
        // ...
    }
}
