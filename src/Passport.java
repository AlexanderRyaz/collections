import java.util.Date;
import java.util.Objects;

public class Passport {
   private int number;
   private String firstName;
   private String lastName;
   private String secondName;
   private Date birthDay;

    public Passport(int number, String firstName, String lastName, String secondName, Date birthDay) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.birthDay = birthDay;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
