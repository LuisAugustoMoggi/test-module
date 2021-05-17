package br.com.next.testexecutor.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/abc")
class TesteController {

    @GetMapping("/test")
    Teste run() {
        return new Teste("a", "b")
    }
}

class Teste {
    String f1
    String f2

    Teste(String f1, String f2) {
        this.f1 = f1
        this.f2 = f2
    }
}
