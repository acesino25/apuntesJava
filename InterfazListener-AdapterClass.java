/*
La principal diferencia entre las interfaces de escucha y las clases adaptadoras 
radica en la cantidad de métodos que debes implementar. Las interfaces de escucha requieren 
la implementación de todos los métodos de la interfaz, mientras que las clases adaptadoras te 
permiten seleccionar y anular solo los métodos necesarios. Las interfaces de escucha ofrecen 
una mayor flexibilidad, pero pueden resultar en más código adicional, mientras que las clases 
adaptadoras brindan una implementación más concisa pero son menos flexibles en términos de 
personalización.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

// Código original que usa INTERFAZ ESCUCHA ( LISTENER ) ActionListener
/*
Son interfaces que definen los métodos de un evento específico.
 Por ejemplo, la interfaz ActionListener define el método actionPerformed()
  para manejar eventos de acción.
Para utilizar una interfaz de escucha, debes implementarla en una clase
 y proporcionar la implementación para todos los métodos de la interfaz.


## Ventajas:
Mayor flexibilidad: 
Puedes personalizar la lógica de manejo de eventos según tus necesidades,
 ya que debes implementar todos los métodos de la interfaz.

Desventajas:
Requiere implementar todos los métodos:
Debes proporcionar implementaciones para todos los métodos de la interfaz,
incluso si no necesitas utilizarlos. Esto puede resultar en
código adicional y en una mayor complejidad. */
// Código original que usa INTERFAZ ESCUCHA ( LISTENER ) ActionListener
public class ButtonClickListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("¡Botón clickeado!");
    }

    public static void main(String[] args) {
        JButton button = new JButton("Clic Me");
        ActionListener listener = new ButtonClickListener();
        button.addActionListener(listener);
    }
}

// LISTENER PASADO A ANÓNIMO
public class ButtonClickListener {
    public static void main(String[] args) {
        JButton button = new JButton("Clic Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Botón clickeado!");
            }
        });
    }
}

// LISTENER PASADO A ADAPTER COMO CLASE INTERNA
public class App {
    public static void main(String[] args) {
        JButton button = new JButton("Clic Me");
        ActionListener listener = new ButtonClickListener();
        button.addActionListener(listener);

        // Resto del código de inicialización del proyecto...
    }

    private static class ButtonClickListener extends ButtonAdapter {
        public void actionPerformed(ActionEvent e) {
            System.out.println("¡Botón clickeado!");
        }
    }

    private static class ButtonAdapter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Implementación vacía del evento actionPerformed
        }
    }
}




// CLASE ADAPTADORA

/*
Son clases abstractas que implementan una interfaz de escucha
y proporcionan implementaciones vacías para todos los métodos
de la interfaz.
Permiten que las subclases seleccionen y anulen solo los métodos 
relevantes para manejar eventos, en lugar de tener que implementar 
todos los métodos de la interfaz.

## Ventajas:
· Implementación más concisa:
No es necesario proporcionar una implementación vacía para cada método
de la interfaz de escucha, lo que hace que el código sea más conciso.
· Mayor flexibilidad: 
Puedes anular solo los métodos que necesitas para 
manejar los eventos, lo que facilita la personalización.

Desventajas:
· Menos flexibilidad que las interfaces de escucha: Las clases adaptadoras 
proporcionan implementaciones vacías para los métodos que no anules, lo 
que significa que no puedes personalizar la lógica de manejo de eventos 
para cada método individualmente.
 */

// CÓDIGO ORIGINAL
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class MouseClickListener extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("¡Ratón clickeado!");
    }

    public static void main(String[] args) {
        JButton button = new JButton("Clic Me");
        MouseClickListener listener = new MouseClickListener();
        button.addMouseListener(listener);
    }
}


/*
En el desarrollo de interfaces de usuario (UI) en Java, es más común encontrar el 
uso de listeners (interfaz de escucha) en lugar de adapters (clases adaptadoras).

Las interfaces de escucha, como ActionListener, MouseListener, etc., son ampliamente 
utilizadas para manejar eventos en la UI de Java. Proporcionan métodos que se pueden 
implementar directamente o mediante clases anónimas o clases internas para definir 
la lógica del manejo de eventos.

Por otro lado, las clases adaptadoras, como MouseAdapter, KeyAdapter, etc., aunque 
útiles en ciertos casos, no son tan comunes como los listeners. Las clases adaptadoras 
son útiles cuando solo necesitas implementar uno o unos pocos métodos de una interfaz de 
escucha, ya que proporcionan una implementación vacía por defecto para los demás métodos. 
Sin embargo, su uso puede ser menos frecuente debido a que las clases anónimas o clases 
internas pueden proporcionar una implementación más concisa y flexible para los eventos 
que se desean manejar.
 */