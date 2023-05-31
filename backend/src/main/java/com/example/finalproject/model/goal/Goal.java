package com.example.finalproject.model.goal;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "goals")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "goal_type", discriminatorType = DiscriminatorType.STRING)
public class Goal {
    @Id
    private Long id;

    @Column(nullable = false)
    private Double goalAmount;

    @Column(nullable = false)
    private Double currentAmount;

    @Column(nullable = false)
    private String name;
}
