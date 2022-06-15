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
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long slotID;

    @Column
    private String slot, hour, penCent;

    @Column
    private double price;

    @Column
    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_booingDatail", referencedColumnName = "id")
    private BookingDetail bookingDetail;


}
