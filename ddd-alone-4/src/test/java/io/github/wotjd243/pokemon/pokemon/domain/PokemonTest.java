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
        new Pokemon(1, "꼬부기", 12);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 256})
    void pockmonCaptureRateByRateOver(int rate) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Pokemon(1, "꼬부기", rate));
    }
}
