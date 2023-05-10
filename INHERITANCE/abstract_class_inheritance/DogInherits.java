package INHERITANCE.abstract_class_inheritance;

public class DogInherits extends AnimalAbstrac {

    public DogInherits(String name) {
        /* Un super es por el uso del constructor de quien heradamos en la clase abstracta superior a esta clase */
        super(name);
        // podríamos agregar parametros individuales si el constructor DogInherits los necesita
        // y no los necesitase la super
    }
    
    /* Hacemos sobrescritura de la clase makeSound y definimos el comportamiento que tendrá aquí */
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}