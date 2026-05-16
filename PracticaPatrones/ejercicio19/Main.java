package io.github.unlp_oo.archetype;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		FileOO2 file = new FileOO2("documento","pdf","2500GB",
				LocalDate.of(2026, 5, 10), LocalDate.of(2026, 5, 14), "rw-r--r--");

		// nombre - extensión
		Archivo archivo1 = new ExtensionDecorator(new ArchivoBase(file));

		// nombre - fecha de creación - extensión
		Archivo archivo2 = new ExtensionDecorator(new FechaCreacionDecorator(new ArchivoBase(file)));

		// nombre - tamaño - permisos - extensión
		Archivo archivo3 = new ExtensionDecorator(new PermisosDecorator(new TamDecorator(new ArchivoBase(file))));

		System.out.println("Archivo 1:");
		System.out.println(archivo1.prettyPrint());

		System.out.println();

		System.out.println("Archivo 2:");
		System.out.println(archivo2.prettyPrint());

		System.out.println();

		System.out.println("Archivo 3:");
		System.out.println(archivo3.prettyPrint());
	}
}
