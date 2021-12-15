package Model;

import lombok.Data;

import java.util.Arrays;

@Data
public class RMEpisode {
    int id;
    String name;
    String air_date;
    String episode;
    String[] characters;
    String url;
    String created;

    @Override
    public String toString() {
        return "RMEpisode{" +
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\nair_date='" + air_date + '\'' +
                "\nepisode='" + episode + '\'' +
                "\ncharacters=" + Arrays.toString(characters) +
                "\nurl='" + url + '\'' +
                "\ncreated='" + created + '\'' +
                '}';
    }
}


