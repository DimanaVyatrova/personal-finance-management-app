package com.example.finalproject.model.goal;

import com.example.finalproject.model.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "goals")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "goal_type", discriminatorType = DiscriminatorType.STRING)
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Double goalAmount;

    @Column(nullable = false)
    private Double currentAmount;

    @Column(nullable = false)
    private String name;
}
