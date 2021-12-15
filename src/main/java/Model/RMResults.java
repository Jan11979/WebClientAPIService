package Model;

import lombok.Data;

import java.util.HashMap;

@Data
public class RMResults {
    HashMap<String, String> info;
    RMCharacter [] results;
}
