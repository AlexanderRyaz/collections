import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Exercise exercise1 = new Exercise(9, 3);
        Exercise exercise2 = new Exercise(3, 9);
        boolean equals = exercise1.equals(exercise2);
        int i = exercise1.hashCode();
        int i1 = exercise2.hashCode();
        generateExercises(15);
        System.out.println("----------");
        Map<Integer, Passport> passportMap = new HashMap<>();
        Passport passport1 = new Passport(123456, "саша", "петров", "иванович", new Date());
        Passport passport2 = new Passport(254789, "федя", "сидоров", null, new Date());
        Passport passport3 = new Passport(879658, "рома", "соколов", "орлович", new Date());
        addPassport(passport1, passportMap);
        addPassport(passport2, passportMap);
        addPassport(passport3, passportMap);
        printMap(passportMap);
        System.out.println("-------");
        Passport passport4 = new Passport(879658, "гриша", "соколов", "орлович", new Date());
        addPassport(passport4, passportMap);
        printMap(passportMap);
        System.out.println("-------");
        System.out.println(getPassportByNumber(123456, passportMap));
        System.out.println(getPassportByNumber(925879, passportMap));
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