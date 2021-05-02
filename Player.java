public class Player {
    private int id;
    private  String firstName;
    private  String lastName;
    private String tcNo;
    private int year;

    public Player(int id, String ömer, String selvi, int i, int year) {

    }

    public Player(int id, String firstName, String lastName, String tcNo, int year) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcNo = tcNo;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
