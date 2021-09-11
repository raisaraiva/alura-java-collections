package test;

import model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaAula {

	public static void test() {

		Aula aula1 = new Aula("Aula (UM)", 2);
		Aula aula2 = new Aula("AULA (DOIS)", 3);
		Aula aula3 = new Aula("AULA (TRÊS)", 1);

		List<Aula> aulaList = new ArrayList<>();

		aulaList.add(aula1);
		aulaList.add(aula2);
		aulaList.add(aula3);

		System.out.println(aulaList);

		Collections.sort(aulaList);

		System.out.println(aulaList);

		aulaList.sort(Comparator.comparing(Aula::getTempo));

		System.out.println(aulaList);

	}
}
