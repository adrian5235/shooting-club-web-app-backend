package com.shootingclub.legendposition;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class LegendPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String shortcut;

    private String name;

    public LegendPosition() {}

    public LegendPosition(String shortcut, String name) {
        this.shortcut = shortcut;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegendPosition that = (LegendPosition) o;
        return id == that.id && Objects.equals(shortcut, that.shortcut) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortcut, name);
    }

    @Override
    public String toString() {
        return "LegendPosition{" +
                "id=" + id +
                ", shortcut='" + shortcut + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
