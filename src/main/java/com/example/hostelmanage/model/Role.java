package com.example.hostelmanage.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleID;
    @Column
    private String roleName;
    @Column
    private boolean status;

    @JsonIgnore
    @OneToMany(mappedBy="Role")
    private Set<Account> account;
}
