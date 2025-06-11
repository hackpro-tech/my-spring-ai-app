package com.hackprotech.myaiapp.ollama;


import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaController {

    @Autowired
    private OllamaChatModel ollamaChatModel;

    @GetMapping("/chat")
    public String getChat(@RequestParam("message") String query) {
        return ollamaChatModel.call(query);
    }

}
