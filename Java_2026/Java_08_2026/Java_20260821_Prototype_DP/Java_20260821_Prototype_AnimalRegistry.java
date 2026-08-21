import java.util.HashMap;
import java.util.Map;

public class Java_20260821_Prototype_AnimalRegistry {

    private Map<String, Java_20260821_Prototype_Animal>
            animals;

    public Java_20260821_Prototype_AnimalRegistry() {

        animals = new HashMap<>();

        animals.put(
                "sheep",
                new Java_20260821_Prototype_Sheep(
                        "Dolly",
                        "White"));

        animals.put(
                "cow",
                new Java_20260821_Prototype_Cow(
                        "Bessie",
                        "Brown"));
    }

    public Java_20260821_Prototype_Animal getAnimal(
            String type) {

        Java_20260821_Prototype_Animal prototype =
                animals.get(type);

        if (prototype == null) {

            return null;
        }

        return prototype.clone();
    }
}

