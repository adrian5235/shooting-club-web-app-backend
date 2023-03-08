package com.shootingclub;

import com.shootingclub.legendposition.LegendPosition;
import com.shootingclub.legendposition.LegendPositionRepository;
import com.shootingclub.tournament.Tournament;
import com.shootingclub.tournament.TournamentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TournamentRepository tr,
                                   LegendPositionRepository lpr) {
        return args -> {
            log.info("Preloading " + tr.save(new Tournament(
                    "2023-03-15",
                    "21. Zawody w ramach WOŚP",
                    "Kalisz - strzelnica ZSPP godz. 9:00",
                    "Mk",
                    "GP KM")));
            log.info("Preloading " + lpr.save(new LegendPosition("Mk", "broń małokalibrowa")));
        };
    }
}
