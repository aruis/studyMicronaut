package studymn.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/hello")
class HelloController {
    @Get("/")
    String index() {
        "hello world"
    }
}