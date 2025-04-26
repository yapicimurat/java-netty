package com.example.discardserver;

public class Main {
    public static void main(String[] args) throws Exception {
        //Start Discard Server
        new DiscardServer(8080).run();

    }
}
