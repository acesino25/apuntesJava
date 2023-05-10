package INHERITANCE.interface_inheritance;

// Class implementing the interface
// en este caso hereda desde múltiples interfaces
public class Dog implements Animal, Jauria {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    @Override
    public void getJauria() {
        System.out.println("Pertenezco a una jauria!");
    }
}

