package io.github.wotjd243.pokemon.trainer.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class PokemonCaught {
    private int number;
    private String nickName;

    protected PokemonCaught() {
    }

    public PokemonCaught(final int number, final String nickName) {
        this.number = number;
        this.nickName = nickName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final PokemonCaught that = (PokemonCaught) o;
        return number == that.number &&
                Objects.equals(nickName, that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, nickName);
    }
}
