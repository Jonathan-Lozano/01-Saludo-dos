import javax.swing.JOptionPane;
/**
 * @author Jonathan Lozano
 *
 */
public class Saludo {

	/**
	 * 
	 * @param args
	 * Se crean dos variables del tipo String con un valor definido
	 * Se impime un mensaje con el valor de las variables
	 */
	public static void main(String[] args) {
		
		String nombre = "Jonathan";
		String edad = "21";
		//		System.out.println("Hola: "+nombre );
//		System.out.printf("Hola: %s", nombre);
		JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es %s años de edad", nombre, edad));
	}

}
