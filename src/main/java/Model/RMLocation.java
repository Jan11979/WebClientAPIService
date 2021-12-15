package Model;

import lombok.Data;

import java.util.Arrays;

@Data
public class RMLocation {
        int id ;
        String name;
        String type;
        String dimension;
        String [] residents;
        String url;
        String created;

        @Override
        public String toString() {
                return "RMLocation{" +
                        "\nid=" + id +
                        "\nname='" + name + '\'' +
                        "\ntype='" + type + '\'' +
                        "\ndimension='" + dimension + '\'' +
                        //"\n, residents=" + Arrays.toString(residents) +
                        //"\n, url='" + url + '\'' +
                        "\ncreated='" + created + '\'' +
                        '}';
        }
}