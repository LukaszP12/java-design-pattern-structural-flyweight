package pl.piwowarski;

class ConcreteCharacter implements CharacterFlyweight {
    private final char symbol;

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int fontSize, String color) {
        System.out.println("Character: " + symbol +
                " | Font Size: " + fontSize +
                " | Color: " + color);
    }
}
