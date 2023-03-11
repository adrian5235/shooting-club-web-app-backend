package com.shootingclub.tournament;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8081/")
public class TournamentController {

    private final TournamentRepository repository;

    TournamentController(TournamentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tournaments")
    List<Tournament> getAll() {
        return repository.findAll();
    }

    @PostMapping("/tournaments")
    Tournament add(@RequestBody Tournament newTournament) {
        return repository.save(newTournament);
    }

    @GetMapping("/tournaments/{id}")
    Tournament get(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new TournamentNotFoundException(id));
    }

    @PutMapping("/tournaments/{id}")
    Tournament replace(@RequestBody Tournament newTournament, @PathVariable Integer id) {
        return repository.findById(id)
                .map(tournament -> {
                    tournament.setDate(newTournament.getDate());
                    tournament.setName(newTournament.getName());
                    tournament.setPlace(newTournament.getPlace());
                    tournament.setCompetition(newTournament.getCompetition());
                    tournament.setParticipants(newTournament.getParticipants());
                    tournament.setDescription(newTournament.getDescription());
                    return repository.save(tournament);
                })
                .orElseGet(() -> {
                    newTournament.setId(id);
                    return repository.save(newTournament);
                });
    }

    @DeleteMapping("/tournaments/{id}")
    void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
