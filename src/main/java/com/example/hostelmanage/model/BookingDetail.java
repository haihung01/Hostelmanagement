package com.example.hostelmanage.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class BookingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int roomID,bookingID;

    @Column
    private String bookingTime,checkOutTime,CheckInTime;

    @Column
    private double totalService,totalRoom,total;

    @Column
    private boolean status;

    @JsonIgnore
    @OneToMany(mappedBy="bookingDetail")
    private Set<Booking> booking;

    @JsonIgnore
    @OneToMany(mappedBy = "bookingDetail")
    private Set<Slot> slot;

}
