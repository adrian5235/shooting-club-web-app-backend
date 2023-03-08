package com.shootingclub.legendposition;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LegendPositionController {

    private final LegendPositionRepository repository;

    LegendPositionController(LegendPositionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/legendPositions")
    List<LegendPosition> all() {
        return repository.findAll();
    }

    @PostMapping("/legendPositions")
    LegendPosition newLegendPosition(@RequestBody LegendPosition newLegendPosition) {
        return repository.save(newLegendPosition);
    }

    @GetMapping("/legendPositions/{id}")
    LegendPosition one(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new LegendPositionNotFoundException(id));
    }

    @PutMapping("/legendPositions/{id}")
    LegendPosition replaceLegendPosition(@RequestBody LegendPosition newLegendPosition, @PathVariable Integer id) {
        return repository.findById(id)
                .map(legendPosition -> {
                    legendPosition.setShortcut(newLegendPosition.getShortcut());
                    legendPosition.setName(newLegendPosition.getName());
                    return repository.save(legendPosition);
                })
                .orElseGet(() -> {
                    newLegendPosition.setId(id);
                    return repository.save(newLegendPosition);
                });
    }

    @DeleteMapping("/legendPositions/{id}")
    void deleteLegendPosition(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
