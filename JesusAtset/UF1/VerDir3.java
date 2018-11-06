import java.io.*;

public class VerDir3 {
	public static void main (String[] args) throws IOException {
		String dir = (args [0]);
		File f = new File(dir);
		File[] ListaFicheros = f.listFiles();
		for(File path:ListaFicheros) {
			System.out.println(path);
		}
	}
}
