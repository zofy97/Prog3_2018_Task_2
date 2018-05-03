package User;

import Crossing.*;
import java.util.Scanner;

/**
 * @Sophie Schauer s0559289
 * This class handles the input from the console.
 * It handles the input and communicates with the event class.
 */

public class ConsoleInput implements Observer {
    static ConsoleOutput output;
    static SensorEvent handler;

    public ConsoleInput(ConsoleOutput output)   {
        this.output = output;

        this.output.addObserver(this);
    }

    public static void checkForTraffic()   {

        try(Scanner scan = new Scanner(System.in)) {
            String message;
                output.output();
                message = scan.next();
                if (message.equals("yes")) {
                    InputEvent e = new InputEvent("yes");
                    handler.notify(e);
                } else if (message.equals("no")) {
                    InputEvent e = new InputEvent("no");
                    handler.notify(e);
                } else {
                    output.error();
                }
        }
    }

    @Override
    public void update() {
        int newState = output.getState();
    }

    public void setHandler(SensorEvent handler) {
        this.handler = handler;
    }

}
