package usandoswing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author sepla
 */
public class optionButtonTest extends JFrame {
    
    private JTextField campoTexto; //se utiliza para mostrar los cambios en el tipo de letra
    private Font tipoLetraSimple; //tipo de letra para texto simple
    
    private Font tipoLetraNegrita; //tipo de letra para texto en negrita
    private Font tipoLetraCursiva; //tipo de letra para texto en cursiva
    private Font tipoLetraNegritaCursiva; //tipo de letra para texto en negrita y cursiva
    
    private JRadioButton simpleJRadioButton; //selecciona texto simple
    private JRadioButton negritaJRadioButton; //selecciona texto en negrita
    private JRadioButton cursivaJRadioButton; //selecciona texto en cursiva
    private JRadioButton negritaCursivaJRadioButton; //negrita y cursiva
    
    private ButtonGroup grupoOpciones; //grupo de botones que contiene los botones de opción
    
    public optionButtonTest() {
        setTitle("Prueba RadioButton");
        setSize(600,600);
        setLayout(new FlowLayout()); //establece el esquema del marco
        
        campoTexto= new JTextField("Observe el cambio en el estilo del tipo de letra", 28);
        add(campoTexto);
        
        //crea los botones de opción
        
        simpleJRadioButton= new JRadioButton("Simple", true);
        negritaJRadioButton= new JRadioButton("Negrita", false);
        cursivaJRadioButton= new JRadioButton("Cursiva", false);
        negritaCursivaJRadioButton= new JRadioButton("Negrita/Cursiva", false);
        
        add(simpleJRadioButton); //agrega botón simple 
        add(negritaJRadioButton); //agrega botón negrita
        add(cursivaJRadioButton); //agrega botón cursiva
        add(negritaCursivaJRadioButton); //agrega botón negrita y cursiva
        
        //crea una relación lógica entre los objetos JRadioButton
        
        grupoOpciones= new ButtonGroup(); //crea ButtonGroup
        
        grupoOpciones.add(simpleJRadioButton);
        grupoOpciones.add(negritaJRadioButton);
        grupoOpciones.add(cursivaJRadioButton);
        grupoOpciones.add(negritaCursivaJRadioButton);
        
        //crea objetos de tipo de letra
        
        tipoLetraSimple= new Font("Serif", Font.PLAIN,14);
        tipoLetraNegrita= new Font("Serif", Font.BOLD,14);
        tipoLetraCursiva= new Font("Serif", Font.ITALIC,14);
        tipoLetraNegritaCursiva= new Font("Serif", Font.BOLD+Font.ITALIC,14);
        
        campoTexto.setFont(tipoLetraSimple); //establece tipo letra inicial a simple
        
        //registra eventos para los bojetos JRadioButton
        
        simpleJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraSimple));
        negritaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
        
        
        
    }
    
    //clase para eventos de botones de opción
    
    private class ManejadorBotonOpcion implements ItemListener {
        private Font tipoLetra; //tipo de letra sociado con este componente de escucha
        
        public ManejadorBotonOpcion(Font f) {
            tipoLetra=f; //establece el tipo de letra de este componente de escucha
        }
        
        //maneja los eventos de botones de opción
        
        public void itemStateChanged(ItemEvent evento) {
            campoTexto.setFont(tipoLetra); //establece el tipo de letra de campoTexto
        }
    }
    
    public static void main(String[] args) {
        optionButtonTest bt= new optionButtonTest();
        bt.setVisible(true);
    }

}
