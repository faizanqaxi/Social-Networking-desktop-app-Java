package Base;

public class ServiceProvider extends Id{
protected String SRName;
protected String SROffice;
protected String SRPhoneNo;
protected String []Vehicals;
protected String []Hotels;
protected Organizer[] Participants;
protected String BookingRequest;

public ServiceProvider(String firstName, String lastName, String email, String phoneNo, String password, String gender, String city, String dob,String SRName,String SROffice,String SRPhoneNo,String BookingRequest)
{
    super(firstName, lastName, email, phoneNo, password, gender, city, dob);
    this.SRName=SRName;
    this.SROffice=SROffice;
    this.SRPhoneNo=SRPhoneNo;
    this.BookingRequest=BookingRequest;

}

    public void setSRName(String SRName) {
        this.SRName = SRName;
    }

    public String getSRName() {
        return SRName;
    }

    public void setSROffice(String SROffice) {
        this.SROffice = SROffice;
    }

    public String getSROffice() {
        return SROffice;
    }

    public void setSRPhoneNo(String SRPhoneNo) {
        this.SRPhoneNo = SRPhoneNo;
    }

    public String getSRPhoneNo() {
        return SRPhoneNo;
    }

    public String[] getHotels() {
        return Hotels;
    }

    public void setHotels(String[] hotels) {
        Hotels = hotels;
    }

    public void setVehicals(String[] vehicals) {
        Vehicals = vehicals;
    }

    public String[] getVehicals() {
        return Vehicals;
    }

    public void setParticipants(Organizer[] participants) {
        Participants = participants;
    }

    public Organizer[] getParticipants() {
        return Participants;
    }

    public void setBookingRequest(String bookingRequest) {
        BookingRequest = bookingRequest;
    }

    public String getBookingRequest() {
        return BookingRequest;
    }
}