package io.github.wotjd243.pokemon.pokemon.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PokedexNumberTest {
    @Test
    @DisplayName("동등성 테스트")
    void compareToObjects() {
        final PokedexNumber actual = new PokedexNumber(1);
        assertThat(actual).isEqualTo(new PokedexNumber(1));
    }


    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 152})
    @DisplayName("PokedexNumber는 1부터 151까지다")
    void pokemonValidateByPokedexNumberOver(int value) {
        assertThatIllegalArgumentException().isThrownBy(() -> new PokedexNumber(value));
    }
}
