package pl.piwowarski;

public class FlyweightDemo {
    public static void main(String[] args) {
//        When to Use the Flyweight Pattern
//
//✅ You have many similar objects.
//✅ Object creation is costly.
//✅ Most of the object state can be shared.
//✅ The extrinsic state can be computed or passed at runtime.
        CharacterFactory factory = new CharacterFactory();

        // Client code using shared flyweights
        String document = "AABACD";

        for (char c : document.toCharArray()) {
            CharacterFlyweight character = factory.getCharacter(c);
            character.display(12, "black");
        }

        System.out.println("Total unique Character objects created: " +
                factory.getTotalCharactersCreated());
    }
}
