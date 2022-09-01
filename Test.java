public class Test {
    public static void main(String[] args) {
        String name = "Awonke";
        char s = 'e';

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == s) {
                name = name.replace(name.charAt(i), 'g');
            }
        }

        System.out.println(name);
    }
}
