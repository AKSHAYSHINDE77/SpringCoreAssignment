/*WAP in which you have to create a system where movie name, show time and price of ticket 
per show will be injected. Your job is to find out how a movie eared during a particular time 
slot means movie Radhe time slot 12-3 earned for current week 10 crore. Similarly for other 
time slot you need to print the details.
*/

package com.springcore.Que13;

public class SystemQ13 {
	
	String moviename;
	String showtime;
	int ticketprice;
	String earn;
	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public int getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	public String getEarn() {
		return earn;
	}
	public void setEarn(String earn) {
		this.earn = earn;
	}
	
	public void show()
	{
		System.out.println("Movie Name :"+moviename);
		System.out.println("Show Time :"+showtime);
		System.out.println("Ticket Price :"+ticketprice);
		System.out.println("Total Earn Ammount :"+earn);
	}

}
