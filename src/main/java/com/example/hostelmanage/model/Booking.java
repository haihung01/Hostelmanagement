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
public class Booking {

    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int accountID;

    @Column
    private String bookingTime,checkOutTime,CheckInTime;

    @Column
    private double price;

    @Column
    private  double surcharge;

    @Column
    private  double prepayment;

    @Column
    private boolean status;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "fk_bookingDetail", referencedColumnName = "id")
   private com.example.hostelmanage.model.BookingDetail bookingDetail;


}
