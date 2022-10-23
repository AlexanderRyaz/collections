import java.util.Objects;

public class Exercise {
    private int number1;
    private int number2;

    public Exercise(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        if (number1 == exercise.number1 && number2 == exercise.number2) {
            return true;
        } else return number1 == exercise.number2 && number2 == exercise.number1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1)+Objects.hash(number2);
    }

    @Override
    public String toString() {
        return "[" +
                number1 +
                " * " + number2 +
                ']';
    }
}
