public class Java_20260821_Prototype_Sheep
        implements Java_20260821_Prototype_Animal {

    private String name;
    private String color;

    public Java_20260821_Prototype_Sheep(
            String name,
            String color) {

        this.name = name;
        this.color = color;
    }

    @Override
    public Java_20260821_Prototype_Sheep clone() {

        try {

            return (Java_20260821_Prototype_Sheep)
                    super.clone();

        } catch (CloneNotSupportedException e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public void showAnimal() {

        System.out.println(
                "Sheep: " +
                name +
                ", Color: " +
                color);
    }
}

