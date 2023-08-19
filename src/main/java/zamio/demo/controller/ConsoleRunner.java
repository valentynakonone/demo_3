package zamio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import zamio.demo.controller.ConsoleController;

@Component
public class ConsoleRunner implements CommandLineRunner {
    private final ConsoleController consoleController;

    @Autowired
    public ConsoleRunner(ConsoleController consoleController) {
        this.consoleController = consoleController;
    }

    @Override
    public void run(String... args) {
        consoleController.run();
    }
}

