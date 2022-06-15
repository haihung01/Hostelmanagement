package com.example.hostelmanage.model;


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
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name,img,startTime,finishTime;

    @Column
    private double price;

    @Column
    private boolean status;

    @Column
    private int roomStatusID;

    @ManyToOne
    @JoinColumn(name = "fk_roomcategory",referencedColumnName = "id")
    private RoomCategory roomCategory;

    @ManyToOne
    @JoinColumn(name = "fk_roomstatus",referencedColumnName = "id")
    private RoomStatus roomStatus;

}
