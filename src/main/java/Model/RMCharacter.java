package Model;


import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;

@Data
public class RMCharacter {
    int id;
    String name;
    String status;
    String species;
    String type;
    String gender;
    HashMap<String,String>  origin;
    HashMap<String,String>  location;
    String image;
    String [] episode;
    String url;
    String created;

    @Override
    public String toString() {
        return "RMCharacter{" +
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\nstatus='" + status + '\'' +
                "\nspecies='" + species + '\'' +
                "\ntype='" + type + '\'' +
                "\ngender='" + gender + '\'' +
                "\norigin=" + origin +
                "\nlocation=" + location +
                "\nimage='" + image + '\'' +
                "\nepisode=" + Arrays.toString(episode) +
                "\nurl='" + url + '\'' +
                "\ncreated='" + created + '\'' +
                '}';
    }
}
        /*
        "location": {
        "name": "Earth",
        "url": "https://rickandmortyapi.com/api/location/20"
        },
        "image": "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
        "episode": [
        "https://rickandmortyapi.com/api/episode/1",
        "https://rickandmortyapi.com/api/episode/2",
        // ...
        ],
        "url": "https://rickandmortyapi.com/api/character/2",
        "created": "2017-11-04T18:50:21.651Z"
        }
*/