package com.example.finalproject.model;

import com.example.finalproject.model.accounts.CheckingAccount;
import com.example.finalproject.model.goal.Goal;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy="user")
    private Set<CheckingAccount> checkingAccounts;

    @OneToMany(mappedBy = "user")
    private Set<Budget> budgets;

    @OneToMany(mappedBy = "user")
    private Set<Goal> goals;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] profilePicture;
}
