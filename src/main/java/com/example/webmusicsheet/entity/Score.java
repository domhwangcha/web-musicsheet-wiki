package com.example.webmusicsheet.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Score extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String notation;

    @Column(nullable = false)
    private String writer;

    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeNotation(String notation) {
        this.notation = notation;
    }

    public void changeWriter(String writer) {
        this.writer = writer;
    }

    public void update(String title, String notation, String writer) {
        this.title = title;
        this.notation = notation;
        this.writer = writer;
    }
}
