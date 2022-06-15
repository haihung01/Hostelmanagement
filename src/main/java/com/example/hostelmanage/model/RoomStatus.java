package com.example.hostelmanage.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomStatusID;
    @Column
    private String roomStatusName;
    @Column
    private boolean status;

    @JsonIgnore
    @OneToMany(mappedBy = "RoomStatus")
    private Set<Room> room;
}
