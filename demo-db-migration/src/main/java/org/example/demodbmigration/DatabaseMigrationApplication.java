package org.example.demodbmigration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DatabaseMigrationApplication implements CommandLineRunner {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DatabaseMigrationApplication.class)
                .web(WebApplicationType.NONE)
                .run(args)
                .close();
    }

    @Override
    public void run(String... args) {
    }
}