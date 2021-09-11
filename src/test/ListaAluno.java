package test;

import java.util.*;

public class ListaAluno {

	public static void test() {

		List<String> alunoList = new ArrayList<>();

		alunoList.add("A");
		alunoList.add("E");
		alunoList.add("D");
		alunoList.add("C");
		alunoList.add("B");

		System.out.println("Lista de aulos:");

		System.out.println(alunoList);

		System.out.println("Depois de ordenado...");

		Collections.sort(alunoList);
		
		System.out.println(alunoList);
	}
}
