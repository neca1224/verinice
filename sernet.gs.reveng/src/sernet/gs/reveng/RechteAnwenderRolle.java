package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * RechteAnwenderRolle generated by hbm2java
 */
public class RechteAnwenderRolle implements java.io.Serializable {

	private RechteAnwenderRolleId id;
	private Date timestamp;
	private RechteAnwender rechteAnwender;

	public RechteAnwenderRolle() {
	}

	public RechteAnwenderRolle(RechteAnwenderRolleId id,
			RechteAnwender rechteAnwender) {
		this.id = id;
		this.rechteAnwender = rechteAnwender;
	}

	public RechteAnwenderRolleId getId() {
		return this.id;
	}

	public void setId(RechteAnwenderRolleId id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public RechteAnwender getRechteAnwender() {
		return this.rechteAnwender;
	}

	public void setRechteAnwender(RechteAnwender rechteAnwender) {
		this.rechteAnwender = rechteAnwender;
	}

}
