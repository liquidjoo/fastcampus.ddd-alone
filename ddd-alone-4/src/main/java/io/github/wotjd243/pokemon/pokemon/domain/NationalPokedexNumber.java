package io.github.wotjd243.pokemon.pokemon.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NationalPokedexNumber {
    private static final int MINIMUM_NUMBER = 1;
    private static final int MAXIMUM_NUMBER = 151;

    private static final Map<Integer, NationalPokedexNumber> cached = new HashMap<>();

    private final int number;

    private NationalPokedexNumber(final int number) {
        validate(number);
        this.number = number;
    }

    public static NationalPokedexNumber valueOf(final int number) {
        cached.putIfAbsent(number, new NationalPokedexNumber(number));
        return cached.get(number);
    }

    public int toInt() {
        return number;
    }

    private void validate(final int number) {
        if (number < MINIMUM_NUMBER || number > MAXIMUM_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final NationalPokedexNumber that = (NationalPokedexNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
