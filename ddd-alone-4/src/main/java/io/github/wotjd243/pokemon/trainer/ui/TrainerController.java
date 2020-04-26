package io.github.wotjd243.pokemon.trainer.ui;

import io.github.wotjd243.pokemon.trainer.application.TrainerService;
import io.github.wotjd243.pokemon.trainer.domain.Trainer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(final TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/api/trainers/{id}")
    public ResponseEntity<Trainer> join(@PathVariable final String id) {
        return ResponseEntity.created(URI.create("/api/trainers"))
                .body(trainerService.join(id))
                ;
    }
}
