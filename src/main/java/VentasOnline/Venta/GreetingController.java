package VentasOnline.Venta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.concurrent.atomic.AtomicLong;
@RestController
@RequestMapping(value = "greeting")
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello %s";
    /** Metodo que devuelve datos de la clase Greeting */
    @GetMapping
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "age", defaultValue = "0") int age, @RequestParam(value = "sex", defaultValue = "?") String sex){
        return new Greeting(counter.incrementAndGet(), String.format(template,name),age, sex);
    }

    private String getSaludo(String name){
        return String.format(template,name);
    }
}
