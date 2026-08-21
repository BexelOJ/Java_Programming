public class Java_20260820_flyweight_CharacterFlyweight implements Java_20260820_flyweight_Character {

    private char character;
    private String font;
    private int size;

    public Java_20260820_flyweight_CharacterFlyweight(char character, String font, int size) {
        this.character = character;
        this.font = font;
        this.size = size;
    }

    @Override
    public void display(int x, int y) {

      System.out.println("Character: " + character + ", Font: " + font + ", Size: " + size + ", Position: (" + x + ", " + y + ")");
    
    }
}

