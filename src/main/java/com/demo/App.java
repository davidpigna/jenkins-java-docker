package com.demo;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080);
        get("/", (req, res) -> "Hello from Jenkins Java Demo!");
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}