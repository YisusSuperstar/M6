import java.io.*;

public class VerDir5 {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el nombre del fichero");
		String dir = reader.readLine();
		File f = new File(dir);
		System.out.println("El nombre del fichero es: " + f.getName());
		System.out.println("La ruta relativa del fichero es: " + f.getPath());
		System.out.println("El ruta absoluta del fichero es: " + f.getAbsolutePath());
		System.out.println("El fitchero es ejecutable: " + f.canExecute());
		System.out.println("El fitchero se puede leer: " + f.canRead());
		System.out.println("El fitchero se puede editar: " + f.canWrite());
		System.out.println("El tamaño del fichero es: " + f.length());
	}
}


