package io.github.wotjd243.pokemon.pokemon.domain;

public class Pokemon {

    private final PokedexNumber pokedexNumber;
    private final String name;

    public Pokemon(final int pokedexNumber, final String name) {
        this.pokedexNumber = new PokedexNumber(pokedexNumber);
        this.name = name;
    }
}
