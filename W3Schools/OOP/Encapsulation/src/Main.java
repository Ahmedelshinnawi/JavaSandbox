public class Main {

    /*
  Encapsulation
  Get and Set
    */
    public static class Person{
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ahmed");
        System.out.println(person.getName());
    }
}