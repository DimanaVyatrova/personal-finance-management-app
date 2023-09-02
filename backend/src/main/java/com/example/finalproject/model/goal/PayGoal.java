package com.example.finalproject.model.goal;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PAY")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PayGoal extends Goal {

    @Column
    private String payee;
}
