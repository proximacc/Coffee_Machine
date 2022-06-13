
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName = p2.name;
        int tempAge = p2.age;
        p2.name = p1.name;
        p2.age = p1.age;
        p1.name = tempName;
        p1.age = tempAge;
    }
}