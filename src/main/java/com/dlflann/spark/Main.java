package com.dlflann.spark;

import static spark.Spark.*;

public class Main
{
    public static void main(String[] args)
    {
        get("/", (req, res) -> "Welcome Students!");
        get("/hello", (req, res) -> "Hello World!");
    }
}
