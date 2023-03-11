package com.shootingclub.legendposition;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LegendPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String shortcut;

    private String name;

    @Override
    public String toString() {
        return "LegendPosition{" +
                "id=" + id +
                ", shortcut='" + shortcut + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
