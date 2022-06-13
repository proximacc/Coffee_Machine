public class Main {

    public static void main(String[] args) {
        int counter = 0;

        for (Secret secret : Secret.values()) {
            String newString = secret.toString();
            if (newString.startsWith("STAR")) {
                counter += 1;
            }
        }



        System.out.println(counter);
    }
}

