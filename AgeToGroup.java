public class AgeToGroup {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
//        int ageGroup = 1;
//        if (age<=18)
//            ageGroup = 0;
//        if (age>=65)
//            ageGroup = 2
        int ageGroup = (age<=18)?0 : (age>=65)?2 : 1;
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}