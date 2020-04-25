package io.github.wotjd243.pokemon.pokemon.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PokedexNumberTest {
    @Test
    @DisplayName("동등성 테스트")
    void compareToObjects() {
        final PokedexNumber actual = new PokedexNumber(1);
        assertThat(actual).isEqualTo(new PokedexNumber(1));
    }
}
