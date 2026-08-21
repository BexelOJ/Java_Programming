import java.util.HashMap;
import java.util.Map;

public class Java_20260820_flyweight_CharacterFactory {

    private Map<String, Java_20260820_flyweight_Character> characters;

    public Java_20260820_flyweight_CharacterFactory() {

        characters = new HashMap<>();
    }

    public Java_20260820_flyweight_Character getCharacter(
            char character,
            String font,
            int size) {

        String key =
                character + "-" + font + "-" + size;

        if (!characters.containsKey(key)) {

            characters.put(key, new Java_20260820_flyweight_CharacterFlyweight(character, font, size));

            System.out.println("Creating new flyweight: " + key);

        } else {

            System.out.println("Reusing flyweight: " + key);

        }

        return characters.get(key);
    }

    public int getNumberOfFlyweights() {

        return characters.size();
    }
}

