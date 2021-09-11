package test;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {

	public static void test() {

		String aula1 = "Aula (UM)";
		String aula2 = "Aula (DOIS)";
		String aula3 = "Aula (TRÊS)";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println("Removendo a segunda:");

		aulas.remove(1);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		System.out.println("A primeira aula é " + aulas.get(0));

		Collections.sort(aulas);

		System.out.println("Depois de ordenado...");
		System.out.println("A primeira aula é " + aulas.get(0));
	}
}
