package com.ams.beans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.Interval;

public class DateManipulation {
	
	
	
	
	
	public static void main(String[] args) {
		

		System.out.println("This is my first deploy test");
		System.out.println("This is my first deploy test");

		SimpleDateFormat simple=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		
		
		
		String fdate="2018-58-26 21:30:10";
		String scdate="2018-58-26 21:30:10";
		String duration="21:30:10";
		System.out.println(Integer.parseInt("8"));
		
		EventSchedule e=new EventSchedule();
		e.setDisplayDate(new Date());
		
		System.out.println("getTime()--->"+e.getDisplayDate().getTime());
		System.out.println("getDate()---->"+e.getDisplayDate().getDate());
		System.out.println("getDay()---->"+e.getDisplayDate().getDay());
		System.out.println("getHours() ---->"+e.getDisplayDate().getHours());
		System.out.println(e.getDisplayDate().getMinutes());
		System.out.println(e.getDisplayDate().getSeconds());
		System.out.println(e.getDisplayDate().getYear());
		System.out.println(e.getDisplayDate().getDate());
		
		
		
		String sdate=simple.format(e.getDisplayDate());
		
		System.out.println("Formate "+sdate); //Formate 2018-58-26 21:58:51
		
		System.out.println("e.getDisplayDate() ---->"+ e.getDisplayDate());
		DateTime d=new DateTime(e.getDisplayDate());
		Date dd=d.toDate();
		dd.getTime();
		
		
		System.out.println(d.getDayOfWeek());
		System.out.println("d.getHourOfDay() ---->"+d.getHourOfDay());
		System.out.println("d.getMinuteOfDay() ------>"+d.getMinuteOfHour());
		System.out.println("d.getSecondOfDay() ---->"+d.getSecondOfMinute());
		System.out.println("d.getMonthOfYear() ----->"+d.getMonthOfYear());
		System.out.println("d.getYear() ---->"+d.getYear());
		System.out.println(d.toString()); //2018-08-26T21:58:51.173+05:30
		
		DateTime ddd = new DateTime(d.getYear(),d.getMonthOfYear(),d.getDayOfMonth(),d.getHourOfDay(),d.getMinuteOfHour(),d.getSecondOfMinute());
		DateTime ddd1 = new DateTime(d.getYear(),d.getMonthOfYear(),d.getDayOfMonth(),d.getHourOfDay(),d.getMinuteOfHour(),d.getSecondOfMinute());

		System.out.println("ddd ---- >"+ddd);
		
		DateTime fd=new DateTime(e.getDisplayDate());
		
		DateTime sd=new DateTime(e.getDisplayDate());
		
		
		System.out.println(fd.isEqualNow());

		/*
		 
		  overrun ---means over lapping of date time 
		  underrun ----means gap between first and second show 
		  duplicate ----means first and second show must be on same datetime
		 
		 */
		
		
		
		
		
		/*
		  //Two DateTime instances which have equal date and time fields
        DateTime d1 = new DateTime(2014,05,12,7,30,45);
        DateTime d2 = new DateTime(2014,05,12,7,30,45);
         
        */
        //2018-08-26 21:27:17
		  //Two DateTime instances which have equal date and time fields
        DateTime d1 = new DateTime(2014,05,12,7,30,00);//[duration of 30 min]end --->08:00:00
        DateTime d2 = new DateTime(2014,05,12,8,00,00);//[duration of 30 min] start -->08:00:00 end--->08:30:00
        DateTime d3 = new DateTime(2014,05,12,8,30,00);//[duration of 30 min] start --->08:30:00 end 09:00:00
        DateTime d4 = new DateTime(2014,05,12,9,00,00);//[duration of 30 min] start 09:00:00 end--->09:30:00
        DateTime d5 = new DateTime(2014,05,12,9,30,00);//[duration of 30 min] start 09:30:00 end ---->10:00:00
        
        List<DateTime> dateTimeList=new ArrayList<DateTime>();
        dateTimeList.add(d1);
        dateTimeList.add(d2);
        dateTimeList.add(d3);
        dateTimeList.add(d4);
        dateTimeList.add(d5);
        System.out.println("List DateTime ---->"+ dateTimeList.toString());
        List<String> durations =new ArrayList<String>();
        durations.add("30:00:00");
        durations.add("30:00:00");
        durations.add("30:00:00");
        durations.add("30:00:00");
        durations.add("30:00:00");
        
        List<EventSchedule> eventSchedule=new ArrayList<EventSchedule>();

		EventSchedule e1=new EventSchedule();
		e1.setDisplayDateTime((d1));
		e1.setDuration("00:30:00");
		
		EventSchedule e2=new EventSchedule();
		e2.setDisplayDateTime((d2));
		e2.setDuration("00:30:00");
		
		EventSchedule e3=new EventSchedule();
		e3.setDisplayDateTime((d3));
		e3.setDuration("00:30:00");
		
		EventSchedule e4=new EventSchedule();
		e4.setDisplayDateTime((d4));
		e4.setDuration("00:30:00");
		
		EventSchedule e5=new EventSchedule();
		e5.setDisplayDateTime((d5));
		e5.setDuration("00:30:00");
		
		
		//duplicate test 
		
		/*eventSchedule.add(e1);
		eventSchedule.add(e1);
		eventSchedule.add(e1);
		eventSchedule.add(e1);
		eventSchedule.add(e1);*/

		eventSchedule.add(e1);
		eventSchedule.add(e2);
		eventSchedule.add(e3);
		eventSchedule.add(e4);
		eventSchedule.add(e5);
		System.out.println("eventSchedule ----->"+eventSchedule.toString());
		
		System.out.println("List durations ---->"+ durations.toString());
		System.out.println("dateTimeList.size() ---> "+dateTimeList.size());
        if(dateTimeList.size() > 0) {
        	for(int i=0;i<dateTimeList.size()-1;i++) {

        		System.out.println(i+" :: "+eventSchedule.get(i).getDisplayDateTime());
        		System.out.println(i+" :: "+eventSchedule.get(i).getDuration());
        		System.out.println(i+1 + " :: "+eventSchedule.get(i+1).getDisplayDateTime());
        		System.out.println(i+1 + " :: "+eventSchedule.get(i+1).getDuration());
        		
        		checkMissPlacedEvents(eventSchedule.get(i).getDisplayDateTime(),
        							  eventSchedule.get(i).getDuration(),
        							  eventSchedule.get(i+1).getDisplayDateTime(),
        							  eventSchedule.get(i+1).getDuration());
        		
        	}
        }
        
	    
      //Get the overlap between two intervals
        DateTime startDateTime = new DateTime(2014,6,14,22-1,00,00);
        DateTime endDateTime = new DateTime(2014,6,14,23-1,00,00);
        Interval interval1 = new Interval(startDateTime, endDateTime);//14th to 17th June 2014
         
         
        DateTime startDateTime1 = new DateTime(2014,6,14,23-1,00,00);
        DateTime endDateTime1 = new DateTime(2014,6,14,24-1,00,00);
        Interval interval2 = new Interval(startDateTime, endDateTime);//15th to 20th June 2014
         
        Interval overlapInterval = interval1.overlap(interval2);
        System.out.println("MMMMMMMMMMMMM ---> "+overlapInterval.getEndMillis());
        System.out.println("The overlap between interval1 and interval2 : " + overlapInterval);
     
	}
	
	private static void checkMissPlacedEvents(DateTime displayDateTime, String duration, DateTime displayDateTime2,
			String duration1) {
		
		
		String []time=duration.split(":");
		Integer hour=Integer.parseInt(time[0]);
		Integer minute=Integer.parseInt(time[1]);
		Integer second=Integer.parseInt(time[2]);
		System.out.println("hour ---->"+hour+"\n minute"+minute +"\nsecond"+second);
		DateTime endDateTime=displayDateTime.plusHours(hour).plusMinutes(minute).plusSeconds(second);
		System.out.println("After ading duration "+endDateTime);
		
		
		String []time1=duration1.split(":");
		Integer hour1=Integer.parseInt(time1[0]);
		Integer minute1=Integer.parseInt(time1[1]);
		Integer second1=Integer.parseInt(time1[2]);
		System.out.println("hour ---->"+hour1+"\n minute"+minute1 +"\nsecond"+second1);
		DateTime endDateTime1=displayDateTime2.plusHours(hour1).plusMinutes(minute1).plusSeconds(second1);
		System.out.println("After ading duration1s "+endDateTime1);

		
		System.out.println(displayDateTime.isAfter(displayDateTime2));
		System.out.println(displayDateTime.isBefore(displayDateTime2));
		
		if((displayDateTime.isBefore(displayDateTime2) && endDateTime.isAfter(displayDateTime2)) || 
				(displayDateTime.isBefore(endDateTime1) && endDateTime.isAfter(endDateTime1))||
				(displayDateTime.isBefore(displayDateTime2) && endDateTime.isAfter(endDateTime1))) {
			System.out.println("==========Date Is Overlapped ===============");
		}
		else {
			System.out.println("==========NOT Date Is Overlapped ===============");
		}
		
		//if(displayDateTime.isBefore(endDateTime) && displayDateTime.isAfter())
		
		
		
		
		
		
		
		
		
	
		 //get result of comparison
        int result = DateTimeComparator.getInstance().compare(endDateTime, displayDateTime2);
        System.out.println("result ----> " + result);
        
        ArrayList<String> duplicate;
		switch (result) {
        case -1:
            System.out.println("d1 is less than d2"); //overrun
           
            break;
        case 0:
            System.out.println("d1 is equal to d2");//duplicate
         duplicate =new ArrayList<String>();
         duplicate.add("duplicate"+result);
            break; 
        case 1:
            System.out.println("d1 is greater than d2");
            
            break;
             
        default:
            break;
        }
		
        
	
		
	}

	

}
