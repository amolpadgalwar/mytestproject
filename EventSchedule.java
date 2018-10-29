package com.ams.beans;

import java.util.Date;

import org.joda.time.DateTime;

public class EventSchedule {
	
	private Date displayDate;
	private DateTime displayDateTime;

	private String duration;
	public Date getDisplayDate() {
		return displayDate;
	}
	public void setDisplayDate(Date displayDate) {
		this.displayDate = displayDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public DateTime getDisplayDateTime() {
		return displayDateTime;
	}
	public void setDisplayDateTime(DateTime displayDateTime) {
		this.displayDateTime = displayDateTime;
	}
	@Override
	public String toString() {
		return "EventSchedule [displayDate=" + displayDate + ", displayDateTime=" + displayDateTime + ", duration="
				+ duration + "]";
	}
	

}
