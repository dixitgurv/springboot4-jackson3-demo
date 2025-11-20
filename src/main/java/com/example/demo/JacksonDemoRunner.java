package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

@Component
public class JacksonDemoRunner implements CommandLineRunner {

    private final ObjectMapper objectMapper;

    public JacksonDemoRunner(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------------");
        System.out.println("Jackson 3 Demo Started");
        System.out.println("------------------------------------------------");

        // 1. Read JSON from file
        ClassPathResource resource = new ClassPathResource("dummy.json");
        Message message = objectMapper.readValue(resource.getInputStream(), Message.class);

        System.out.println("Deserialized Message object:");
        System.out.println("Text: " + message.getText());

        // 2. Serialize object back to JSON
        String jsonOutput = objectMapper.writeValueAsString(message);
        System.out.println("\nSerialized JSON:");
        System.out.println(jsonOutput);

        System.out.println("------------------------------------------------");
        System.out.println("Jackson 3 Demo Finished");
        System.out.println("------------------------------------------------");
    }
}
