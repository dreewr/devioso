package dev.io.so

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello, World!!!!"
    }
}