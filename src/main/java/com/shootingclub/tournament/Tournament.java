package com.shootingclub.tournament;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String date;

    private String name;

    private String place;

    private String competition;

    private String participants;

    private String description;

    public Tournament() {}

    public Tournament(String date, String name, String place, String competition, String participants) {
        this.date = date;
        this.name = name;
        this.place = place;
        this.competition = competition;
        this.participants = participants;
    }

    public Tournament(String date, String name, String place, String competition, String participants, String description) {
        this.date = date;
        this.name = name;
        this.place = place;
        this.competition = competition;
        this.participants = participants;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tournament that = (Tournament) o;
        return id == that.id && Objects.equals(date, that.date) && Objects.equals(name, that.name)
                && Objects.equals(place, that.place) && Objects.equals(competition, that.competition)
                && Objects.equals(participants, that.participants) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, name, place, competition, participants, description);
    }

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
