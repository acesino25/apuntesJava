/*
 * Java es un programa donde clase debe ser declarada con
 * el mismo nombre que el de su archivo. En este caso
 * Main y class Main
 * 
 * Para ejecutarlo nosotros compilamos la clase Main.java
 * con el comando javac Main
 * y tras ello ejecutamos el comando java Main
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import INHERITANCE.abstract_class_inheritance.AnimalAbstrac;
import INHERITANCE.abstract_class_inheritance.DogInherits;
import INHERITANCE.interface_inheritance.Animal;
import INHERITANCE.interface_inheritance.Cat;
import INHERITANCE.interface_inheritance.Dog;

public class Main{
    // visibilidad, static es una extra
    // , void porque no retorna nada
    // main es el nombre
    // y le pasamos (Una cadena de strings)
    public static void main(String args[]){
        System.out.println("Hello world!");

        /*
        * Tipos de datos en java
        */

        // Boolean, byte (-128 a 127)
        // short (-32768 a 32767),
        // int (32bit -2^31 a 2^31-1),
        // long (64bit -2^63 a 2^63-1)
        // float (32bit)
        // double (64bit)
        // char (16bit caracter único)
        // String (cadena de chars)
        // Arrays (array simple que engloba un único tipo de dato de los ya listados arriba)

        // BOOLEAN

        // No vamos a poder declarar private o public porque estamos
        // dentro de un método
        
        /* NOTA: NO PUEDES DECLARAR public o private en un método, solo final */
        boolean valor = true;
        System.out.println(valor);

        // BYTE
        byte smallNumber = 10;
        byte negativeNumber = -100;
        System.out.println(smallNumber);
        System.out.println(negativeNumber);


        // SHORT
        short smallInt = 1000;
        short negativeInt = -2000;
        System.out.println(smallInt);
        System.out.println(negativeInt);

        // INT
        int age = 28;
        int temperature = 25;
        System.out.println(age);
        System.out.println(temperature);

        // LONG
        long veryBigNumber = 123456789012345L;
        long negativeBigNumber = -123456789012345L;
        System.out.println(veryBigNumber);
        System.out.println(negativeBigNumber);

        // FLOATE
        float pi = 3.14f;
        float temperature2 = 25.5f;
        System.out.println(pi);
        System.out.println(temperature2);

        // DOUBLE
        double pi2 = 3.141592653589793;
        double temperature3 = 25.52345;
        System.out.println(pi2);
        System.out.println(temperature3);

        // CHAR
        char letterA = 'A';
        char letterB = '\u0042';
        System.out.println(letterA);
        System.out.println(letterB);

        // STRING
        String name = "John";
        String message = "Hello, world!";
        System.out.println(name);
        System.out.println(message);

        // ARRAY
        int[] numbers = {1, 2, 3};
        String[] names = {"John", "Mary", "Peter"};
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Names: " + Arrays.toString(names));

        // toString es un método propio de la clase Arrays
        // y que podemos alterar en nuestras clases si lo
        // necesitamos. Pero no ahondaremos en eso.

        // MULTI DIMENSIONAL ARRAYS:
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // NO puedes imprimir todo de una sola vez con 'toString'
        // debes por cada dimension hacer un for

        // un forEach, for each element recorrido en matrix
        // store it in int[] row. Porque sabemos que nos devolverá un
        // array 1D
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }






        /*
         * [ARRAYS] 
         */

        // TRABAJAREMOS SOBRE names, que es un array ya declarado
        // String[] names = {"John", "Mary", "Peter"};
        // y devolveremos por separado cada uno de los elementos
        // que componen al array

        // Es un loop normal
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        /*
         * FOREACH
         */

        // forEach está aquí como javascript
        // sin embargo no tiene palabra reservada
        // la manera en la que pasamos argumentos
        // la que nos indica que es un foreach

        for(String n : names){
            // almacenamos en n la iteración actual y la imprimimos
            System.out.println(n);
            // tras finalizar guardamos la siguiente iteración y repetimos
        }

        // podríamos combinar el for() común en una matriz de múltiples
        // dimensiones y luego con el forEach hacer una iteración para imprimir
        // los elementos.


        /**
         * COLLECTIONS VS ARRAYS
         * 
         * ARRAYS = Tamaño fijo, homogeneos y accesibles por index.
         * COLLECTIONS = dinámicos en tamaño, heterogeneos en tipo y accesibles a tarvés de métodos
         * 
         * La diferencia principal es que los arrays
         * son estructuras de un tamaño determinado
         * que almacenan una colección de elementos
         * del mismo tipo.
         * 
         * Una vez es creado su tamaño no puede cambiarse
         * para añadir o remover elementos de un array necesitas
         * crear un nuevo array. Los arrays pueden ser accedidos
         * de manera directa con su index.
         * 
         * Por otro lado, las collections son máx flexibles y dinámicas.
         * son INTERFACES y CLASES que proveen una manera más poderosa
         * para trabajar con grupos de objetos. Pueden crecer o decrecer dinámicamente
         * basado en el número de elementos que contengan.
         * 
         * Collections pueden guardar objetos de tipos diferentes, no solo de
         * un solo tipo. Y son diseñados para añadir y eliminar de manera
         * más sencilla, así como buscar.
         */

        /*
         * Un ejemplo donde un array no puede crecer en tamaño, sino que,
         * debe iniciarse un nuevo array, guardar lo del array anterior,
         * agregar el nuevo valor y luego asignar el nuevo array al viejo array
         */

        // Declaramos el array inicial
        int[] numberss = {1, 2, 3, 4, 5};

        // Mostramos el array uno a uno
        for (int i = 0; i < numberss.length; i++) {
            System.out.println(numberss[i]);
        }

        // Agregar un nuevo elemento al array
        // 1) CREAMOS UN NUEVO ARRAY Y ASIGNAMOS EL TAMAÑO:
        // int[] numberss = new int[tamaño del array original + cantidad de elementos a agregar]
        int[] newNumbers = new int[numberss.length + 1];
        for (int i = 0; i < numberss.length; i++) {
            newNumbers[i] = numberss[i];
        }
        // 2) Asigamos al respectivo index el nuevo elemento
        newNumbers[numberss.length] = 6;
        numberss = newNumbers;

        // imprimimos el nuevo array
        for (int i = 0; i < numberss.length; i++) {
            System.out.println(numberss[i]);
        }



        // ARRAYLIST
        /*
         * Comparado con el array, este incluye métodos propios
         * para agregar y/o eliminar elementos:
         * add() y remove()
         */
        ArrayList<Integer> numbersArr = new ArrayList<Integer>();
        numbersArr.add(1);
        numbersArr.add(2);
        numbersArr.add(3);
        System.out.println(numbersArr); // output: [1, 2, 3]
        numbersArr.remove(1);
        System.out.println(numbersArr); // output: [1, 3]

        // LINKEDLIST
        /*
         * Sirve para remover elementos en el medio
         * debido a su enlace con otros nodos del mismo array
         * comparado con la arraylist la manera de almacenamiento
         * de éste tipo está distribuido, y no es correlativo
         */
        LinkedList<String> namess = new LinkedList<String>();
        namess.add("John");
        namess.add("Mary");
        namess.add("Peter");
        System.out.println(namess); // output: [John, Mary, Peter]
        namess.remove("Mary");
        System.out.println(namess); // output: [John, Peter]

        /*
         * TENEMOS OTRO TIPO DE COLLECTIONS QUE DEJAREMOS ESCRITO:
         * HashSet: An implementation of the Set interface that uses a hash table to store elements. 
         * Elements are not ordered and duplicates are not allowed. 
         * Example: 
         * HashSet<Double>.
         * 
         * TreeSet: An implementation of the SortedSet interface that uses a Red-Black tree to store elements. 
         * Elements are ordered according to their natural order or a specified Comparator. Duplicates are not allowed. 
         * Example: 
         * TreeSet<String>.
         * 
         * HashMap: An implementation of the Map interface that uses a hash table to store key-value pairs.
         * Keys are not ordered and duplicates are not allowed. 
         * Example:
         * HashMap<String, Integer>.
         * 
         * TreeMap: An implementation of the SortedMap interface that uses
         * a Red-Black tree to store key-value pairs. Keys are ordered according to
         * their natural order or a specified Comparator. Duplicates are not allowed. 
         * Example: 
         * TreeMap<Integer, String>.
         */


        /*
         * INHERITANCE
         * la herencia es un concepto de la OOP
         * es una manera de crear la clases a partir de
         * la reutilización de otros elementos como clases
         * o interfaces
         * 
         * La herencia al igual que el polimorfismo y el encap-
         * sulameniento son aspectos clave de OOP.
         */

         /* En este caso heredan de interfaces 
          * usando la palabra reservada 'implements'
          * en el caso de Dog, hace uso de una implementación
          * de dos interfaces. 
          */
        // Guarda con usar de tipo Animal para este
        // acordate que usamos dos interfaces
         Dog dog = new Dog();
         dog.sound();
         dog.getJauria();
         // Acá podemos usar Animal, porque Cat es clase hija de Animal
         Animal cat = new Cat();
         cat.sound(); // Output: Meow!


        /*
        *  ABSTRACT INHERITANCE
        */
        AnimalAbstrac dogAbstract = new DogInherits("Dog");
        dogAbstract.makeSound();
        dogAbstract.eat();

    }

    


}