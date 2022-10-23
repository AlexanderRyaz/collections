import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        PhoneList phoneList = new PhoneList();
        phoneList.addNumber("Михеев Сергей", 89268597896L);
        phoneList.addNumber("Иванов Сергей", 89268599896L);
        phoneList.addNumber("Петров Сергей", 89278597896L);
        phoneList.addNumber("Сидоров Сергей", 89260597896L);
        phoneList.addNumber("Коротков Сергей", 89264597896L);
        phoneList.printNumber();
    }

    private static void printMap(Map<Integer, Passport> passportMap) {
        for (Integer integer : passportMap.keySet()) {
            System.out.println(passportMap.get(integer));
        }
    }

    public static void generateExercises(int count) {

        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() <= 15) {
            int number1 = ThreadLocalRandom.current().nextInt(2, 10);
            int number2 = ThreadLocalRandom.current().nextInt(2, 10);
            exercises.add(new Exercise(number1, number2));
        }
        for (Exercise exercise : exercises) {
            System.out.println(exercise);
        }
    }

    public static void addPassport(Passport passport, Map<Integer, Passport> passportMap) {
        if (passportMap == null) {
            passportMap = new HashMap<>();
        }
        passportMap.put(passport.getNumber(), passport);
    }

    public static Passport getPassportByNumber(int number, Map<Integer, Passport> passportMap) {
        return passportMap.get(number);
    }
}