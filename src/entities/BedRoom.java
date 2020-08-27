package entities;

public class BedRoom {
	
	
	private String guestName;
	private String guestEmail;
	
	public BedRoom() {
	}
	
	public BedRoom(String guestName, String guestEmail) {
		this.guestName = guestName;
		this.guestEmail = guestEmail;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	@Override
	public String toString() {
		return "Guest name: " + guestName + ", Guest email: " + guestEmail;
	}
	

	
	
	
	

}
