package com.example.hostelmanage.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Getter
@Setter
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email, phone;

    @Column
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleIDFK")
    private Role roleID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_profile", referencedColumnName = "id")
    @JsonManagedReference
    private Profile profile;

}
