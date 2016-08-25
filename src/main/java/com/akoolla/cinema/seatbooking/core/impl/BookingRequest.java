package com.akoolla.cinema.seatbooking.core.impl;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.akoolla.cinema.seatbooking.core.IBookingRequest;

import lombok.EqualsAndHashCode;

/**
 * BookingRequest.
 *
 * @author rich
 * @version $Id$
 */
@AutoProperty
@EqualsAndHashCode
public class BookingRequest implements IBookingRequest {
    private final String customerName;
    private final String contactNumber;

    private int numOfSeats = 0;
    private int numWheelChairs = 0;
    
    
    private boolean overideSeatLimits = false;

    public BookingRequest(String customerName, String contactNumber, int numOfSeats, int numWheelChairs) {
        this.numOfSeats = numOfSeats;
        this.numWheelChairs = numWheelChairs;
        
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }

    /**
     * @return
     * @see com.akoolla.cinemabooking.IBookingRequest#overrideSeatLimits()
     */
    public boolean overrideSeatLimits() {
        return overideSeatLimits;
    }

    /**
     * @param overide
     * @see com.akoolla.cinemabooking.IBookingRequest#overrideSeatLimits(boolean)
     */
    public void overrideSeatLimits(boolean overide) {
        overideSeatLimits = overide;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Pojomatic.toString(this);
    }

    /**
     * @return
     * @see com.akoolla.cinemabooking.IBookingRequest#getCustomerName()
     */
    @Override
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @return
     * @see com.akoolla.cinemabooking.IBookingRequest#getContactNumber()
     */
    @Override
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @return
     * @see com.akoolla.cinema.seatbooking.core.IBookingRequest#getNumberOfWheelChairs()
     */
    @Override
    public int getNumberOfWheelChairs() {
        return numWheelChairs;
    }

    /**
     * @return
     * @see com.akoolla.cinema.seatbooking.core.IBookingRequest#getNumberOfSeats()
     */
    @Override
    public int getNumberOfSeats() {
        return numOfSeats;
    }
}
