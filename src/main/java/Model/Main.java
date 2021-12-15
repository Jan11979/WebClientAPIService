package Model;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Miau");
    //    SpringApplication.run(Main.class, args);

        RMApi rmapi = new RMApi();

        System.out.println( rmapi.getEpisode(1).toString() );
        System.out.println( rmapi.getLocation(5).toString() );
        System.out.println( rmapi.getCharacter(7).toString() );
        System.out.println( rmapi.getCharacterCount() );


/*
        String testString = WebClient.create("https://de.search.yahoo.com").get()
                .uri("/search?p=test")
                .retrieve()
                .bodyToMono(String.class)
                .block();


        System.out.println(testString);
*/
        int iBlock = 0;
/*
        //https://rickandmortyapi.com/api/location/3
        WebClient webClient = WebClient.create("https://rickandmortyapi.com");

        RMLocation response = webClient.get()
                .uri("api/location/4")
                .retrieve()
                .bodyToMono(RMLocation.class)
                .block();

        System.out.println(response);
*/
        /*
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(student), Student.class)
                .retrieve()
                .bodyToMono(Student.class).block();
                */


    }
}
