package io.github.wotjd243.pokemon.trainer.application;

import io.github.wotjd243.pokemon.trainer.domain.Trainer;
import io.github.wotjd243.pokemon.trainer.domain.TrainerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerService(final TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public Trainer join(final String id) {
        return trainerRepository.save(new Trainer(id));
    }
}
