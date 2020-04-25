package io.github.wotjd243.pokemon.pokemon.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PokemonTest {

    @Test
    @DisplayName("포켓몬 생성")
    void createByPokemon() {
        new Pokemon(1, "꼬부기");
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 152})
    @DisplayName("PokedexNumber는 1부터 151까지다")
    void pokemonValidateByPokedexNumberOver(int value) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Pokemon(value, "롱롱스톤"));
    }
}
