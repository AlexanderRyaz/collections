import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("str1",2);
       myMap("str2",1,map);
        myMap("str1",5,map);
        myMap("str1",5,map);

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

    public static void myMap(String key, int value, Map<String, Integer> map) {
        if (map.containsKey(key) && map.get(key) == value) {
            throw new RuntimeException("ключ уже есть");
        }
        map.put(key, value);
        System.out.println("добавили: " + key + " " + value);
    }
}