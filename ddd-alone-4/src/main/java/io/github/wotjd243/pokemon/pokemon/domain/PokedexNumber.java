package io.github.wotjd243.pokemon.pokemon.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final PokedexNumber that = (PokedexNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
