package com.ak.construction.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "review")
@AllArgsConstructor
@NoArgsConstructor
public class Review  {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "review_generator")
    @SequenceGenerator(name = "review_generator", initialValue = 1, allocationSize = 1, sequenceName = "review_seq")
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "review_title")
    private String reviewTitle;

    @Column(name = "review")
    private String review;

    @Column(name = "rating")
    private long rating;
}
