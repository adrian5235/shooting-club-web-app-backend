package com.shootingclub.tournament;

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
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String date;

    @NonNull
    private String name;

    @NonNull
    private String place;

    @NonNull
    private String competition;

    @NonNull
    private String participants;

    private String description;

    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", competition='" + competition + '\'' +
                ", participants='" + participants + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
