import java.io.*;

public class VerDir4 {
	public static void main (String[] args) throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduzca la ruta del fichero");
			String dir = reader.readLine();
			File f = new File(dir);
			File[] ListaFicheros = f.listFiles();
			for(File path:ListaFicheros) {
				System.out.println(path);
			}
			} catch(NullPointerException e) {
				System.out.println("Dirección de ruta incorrecta");
			} catch(IOException e1) {
				System.out.println("Datos incorrectos");
			}
		}
	}	
	
