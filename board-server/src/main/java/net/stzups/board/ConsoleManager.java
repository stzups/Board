package net.stzups.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleManager implements Runnable {
    ConsoleManager() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String[] args = bufferedReader.readLine().split("\\s");
                switch (args[0].toLowerCase()) {
                    case "stop":
                        Board.stop();
                        break;
                    default:
                        System.out.println("Unknown command " + args[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
