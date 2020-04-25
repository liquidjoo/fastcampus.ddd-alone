package io.github.wotjd243.pokemon.pokemon.domain;

import java.util.Objects;

public class Pokemon {
    private final int MIN_CAPTURE_RATE = 1;
    private final int MAX_CAPTURE_RATE = 255;

    private final PokedexNumber pokedexNumber;
    private final String name;
    private final int captureRate;

    public Pokemon(final int pokedexNumber, final String name, int captureRate) {
        this(new PokedexNumber(pokedexNumber), name, captureRate);
    }
    public Pokemon(final PokedexNumber pokedexNumber, final String name, final int captureRate) {
        captureValidate(captureRate);
        this.pokedexNumber = pokedexNumber;
        this.name = name;
        this.captureRate = captureRate;
    }

    private void captureValidate(int captureRate) {
        if (captureRate < 1 || captureRate > 255) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pokemon pokemon = (Pokemon) o;
        return Objects.equals(pokedexNumber, pokemon.pokedexNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokedexNumber);
    }
}
