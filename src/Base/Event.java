package Base;

public class Event {
    protected String Location;
    protected String Data;
    protected Organizer Organizer;
    protected User Participants;

    public Event(String Location, String Data, Organizer Organizer, User Participants ) {
        this.Location = Location;
        this.Data = Data;
        this.Organizer = Organizer;
     //   this.Participants= new User(Participants);
     //   this.Organizer= new Organizer(Organizer);
    }

    public Base.Organizer getOrganizer() {
        return Organizer;
    }

    public void setOrganizer(Base.Organizer organizer) {
        Organizer = organizer;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getLocation() {
        return Location;
    }

    public void setParticipants(User participants) {
        Participants = participants;
    }

    public User getParticipants() {
        return Participants;
    }
}
