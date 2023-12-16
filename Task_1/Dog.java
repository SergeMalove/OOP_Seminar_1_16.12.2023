public class Dog extends Animal {
    String name;
    public Dog(String name) {
            this.name = name;
        }

        @Override
        public void speak() {
            System.out.println("Собака " + super.getName() + " гавкает.");
        }
}
