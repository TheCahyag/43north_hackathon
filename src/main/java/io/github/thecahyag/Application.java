package io.github.thecahyag;

import static spark.Spark.*;

/**
 * File: Application.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class Application {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "hello world");
    }
}
