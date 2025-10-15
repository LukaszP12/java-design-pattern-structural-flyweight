package pl.piwowarski;

import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private final Map<Character, CharacterFlyweight> characters = new HashMap<>();

    public CharacterFlyweight getCharacter(char symbol) {
        characters.putIfAbsent(symbol, new ConcreteCharacter(symbol));
        return characters.get(symbol);
    }

    public int getTotalCharactersCreated() {
        return characters.size();
    }
}
