package ex40;

public class Records {

    String firstName;
    String lastName;
    String position;
    String separationDate;

    public Records(String firstName, String lastName, String position, String separationDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    public void printRecords () {

        System.out.printf("%-9s %-10s| %-17s| %-10s\n", this.getFirstName(), this.getLastName(), this.getPosition(), this.getSeparationDate());
    }

}
