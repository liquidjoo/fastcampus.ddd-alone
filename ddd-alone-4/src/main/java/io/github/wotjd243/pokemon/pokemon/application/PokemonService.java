package io.github.wotjd243.pokemon.pokemon.application;

import io.github.wotjd243.pokemon.pokemon.domain.CaptureService;
import io.github.wotjd243.pokemon.pokemon.domain.NationalPokedexNumber;
import io.github.wotjd243.pokemon.pokemon.domain.Pokemon;
import io.github.wotjd243.pokemon.pokemon.domain.PokemonRepository;
import io.github.wotjd243.pokemon.trainer.domain.Trainer;
import io.github.wotjd243.pokemon.trainer.domain.TrainerRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    private final PokemonRepository pokemonRepository;
    private final TrainerRepository trainerRepository;
    private final CaptureService captureService;

    public PokemonService(final PokemonRepository pokemonRepository, final TrainerRepository trainerRepository, final CaptureService captureService) {
        this.pokemonRepository = pokemonRepository;
        this.trainerRepository = trainerRepository;
        this.captureService = captureService;
    }

    public Pokemon get(final int number) {
        return getById(number);
    }

    public void capture(final String userId, final int number) {
        final Pokemon pokemon = getById(number);
        final Trainer trainer = trainerRepository.findById(userId).get();
        captureService.capture(pokemon, trainer);
    }

    private Pokemon getById(final int number) {
        return pokemonRepository.findById(NationalPokedexNumber.valueOf(number));
    }

}
