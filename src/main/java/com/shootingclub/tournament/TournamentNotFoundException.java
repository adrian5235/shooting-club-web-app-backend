package com.shootingclub.tournament;

public class TournamentNotFoundException extends RuntimeException {

    TournamentNotFoundException(Integer id) {
        super("Could not find tournament " + id);
    }
}
