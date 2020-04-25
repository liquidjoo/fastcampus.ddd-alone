package io.github.wotjd243.pokemon.pokemon.domain;

public class Pokemon {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 151;

    private final int pokedexNumber;
    private final String name;

    public Pokemon(final int pokedexNumber, final String name) {
        validate(pokedexNumber);
        this.pokedexNumber = pokedexNumber;
        this.name = name;
    }

    private void validate(int pokedexNumber) {
        if (pokedexNumber < MIN_NUMBER || pokedexNumber > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
    }
}
