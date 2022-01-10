package de.idealo.test.functions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@SpringBootApplication
@Slf4j
public class SpringCloudFunctionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionsApplication.class, args);
    }

    @Bean
    public Function<Flux<String>, Flux<String>> uppercaseFlux() {
        return flux -> flux
                //.filter(this::isNotRude)
                .map(String::toUpperCase);
    }

/*
    @Bean
    public Supplier<String> source() {
        return () -> "Hello from source";
    }

    @Bean
    public Function<String, String> uppercase() {
        return String::toUpperCase;
    }

    @Bean
    public Function<String, String> lowercase() {
        return String::toLowerCase;
    }

    @Bean
    public Consumer<String> sink() {
        return value -> log.warn("received message: {}", value);
    }

    @Bean
    public Supplier<Flux<String>> sourceFlux() {
        return () -> Flux.just("Lorem","ipsum","dolor","sit","amet,","consetetur","sadipscing","elitr","sed","diam","nonumy","eirmod","tempor","invidunt","ut","labore","et","dolore","magna","aliquyam","erat","sed","diam","voluptua","at","vero","eos","et","accusam","et","justo","duo","dolores","et","ea","rebum");
    }

    @Bean
    public Function<Flux<String>, Flux<String>> uppercaseFlux() {
        return flux -> flux
                .filter(this::isNotRude)
                .map(String::toUpperCase);
    }

    private boolean isNotRude(final String value) {
        return !List.of("sit","amet,","consetetur","sadipscing","elitr,").contains(value);
    }

    @Bean
    public Consumer<Flux<String>> sinkFlux() {
        return flux -> flux.subscribe(value ->  log.warn("received message: {}", value));
    }
 */
}
