package io.vmeretin.spring_test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("test")
    fun test(): HelloWorld {
        return HelloWorld(data = "Hello world!")
    }

}