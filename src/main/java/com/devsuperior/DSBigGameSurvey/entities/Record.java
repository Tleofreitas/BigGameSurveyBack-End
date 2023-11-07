package com.devsuperior.DSBigGameSurvey.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_record") // Nome da tabela no banco de dados
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id auto incrementável
    private Long id;
    private String name;
    private Integer age;
    private Instant moment;
    private Game game;

    public Record(){}
    public Record(Long id, String name, Integer age, Instant moment, Game game) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.moment = moment;
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        return id.equals(record.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
