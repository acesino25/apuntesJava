package INHERITANCE.abstract_class_inheritance;

/*
 * EL contraste principal entre una clase y una clase abstracta es
 * que no se se instancian. No se crean objetos a partir de esta
 * clase. Sino que la clase que hereda la plantilla es la que usa
 * el constructor para instanciar.
 */

public abstract class AnimalAbstrac {
    private String name;
    
    /* Este es el constructor */
    public AnimalAbstrac(String name) {
        this.name = name;
    }
    
    /* Abstract method */
    public abstract void makeSound();
    
    /* Al no ser definidos como métodos abstractos estos
     * son usados en las clases solo con llamarse y no hace
     * falta darles un override
     */
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
