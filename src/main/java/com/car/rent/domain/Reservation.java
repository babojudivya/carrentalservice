package com.car.rent.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private int reservationId;
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date reservationDateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pickUpDateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date returnDateTime;
	@OneToOne
	private Vehicle vehicle;
	@OneToOne
	private Person person;

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public Date getReservationDateTime() {
		return reservationDateTime;
	}

	public void setReservationDateTime(Date reservationDateTime) {
		this.reservationDateTime = reservationDateTime;
	}

	public Date getPickUpDateTime() {
		return pickUpDateTime;
	}

	public void setPickUpDateTime(Date pickUpDateTime) {
		this.pickUpDateTime = pickUpDateTime;
	}

	public Date getReturnDateTime() {
		return returnDateTime;
	}

	public void setReturnDateTime(Date returnDateTime) {
		this.returnDateTime = returnDateTime;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		str += "{Id:" + this.getReservationId() + ",ReservationDateTime:" + this.getReservationDateTime()
				+ ",PickupDateTime:" + this.getPickUpDateTime() + ",ReturnDateTime:" + this.getReturnDateTime()
				+ ",Person:" + this.getPerson() + ",Vehicle" + this.getVehicle() + "}";
		return str;
	}

}
