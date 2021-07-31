package ph.acltabontabon.hellokube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@SpringBootApplication
public class HelloKubeApplication {

    public static int n = ThreadLocalRandom.current().nextInt();

    public static void main(String[] args) {
        SpringApplication.run(HelloKubeApplication.class, args);
    }

    @GetMapping("/")
    public String welcome() {
        return "Your lucky number is: " + HelloKubeApplication.n;
    }
}
