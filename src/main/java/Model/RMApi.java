package Model;

import org.springframework.web.reactive.function.client.WebClient;

public class RMApi {

    WebClient webClient = WebClient.create("https://rickandmortyapi.com");

    public RMLocation getLocation(int id) {
        String uri = "api/location/" + id;

        RMLocation response = webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(RMLocation.class)
                .block();
        return response;
    }

    public RMEpisode getEpisode(int id) {
        String uri = "api/episode/" + id;

        RMEpisode response = webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(RMEpisode.class)
                .block();
        return response;
    }

    //https://rickandmortyapi.com/api/character/2
    public RMCharacter getCharacter(int id) {
        String uri = "api/character/" + id;

        RMCharacter response = webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(RMCharacter.class)
                .block();
        return response;

    }

    public int getCharacterCount() {
        String uri = "api/character";

        RMInfo response = webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(RMInfo.class)
                .block();
        int count = Integer.parseInt(response.info.get("count"));

        RMResults response2 = webClient.get()
                .uri("api/character/?name=rick&status=dead")
                .retrieve()
                .bodyToMono(RMResults.class)
                .block();


        int tests = 8;
        return count;

    }
}
