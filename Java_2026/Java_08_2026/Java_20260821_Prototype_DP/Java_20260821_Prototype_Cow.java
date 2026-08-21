public class Java_20260821_Prototype_Cow
        implements Java_20260821_Prototype_Animal {

    private String name;
    private String color;

    public Java_20260821_Prototype_Cow(
            String name,
            String color) {

        this.name = name;
        this.color = color;
    }

    @Override
    public Java_20260821_Prototype_Cow clone() {

        try {

            return (Java_20260821_Prototype_Cow)
                    super.clone();

        } catch (CloneNotSupportedException e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public void showAnimal() {

        System.out.println(
                "Cow: " +
                name +
                ", Color: " +
                color);
    }
}

