package com.example.timeserver.server;

public class Main {
    public static void main(String[] args) throws Exception {
        new TimeServer(8080).run();
    }
}
