package io.github.wotjd243.pokemon.pokemon.domain;

public class PokedexNumber {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 151;

    private final int number;

    public PokedexNumber(final int number) {
        validate(number);
        this.number = number;
    }

    private void validate(int pokedexNumber) {
        if (pokedexNumber < MIN_NUMBER || pokedexNumber > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
    }
}
