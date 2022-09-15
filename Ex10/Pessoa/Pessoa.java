package Ex10.Pessoa;

import java.util.Scanner;

import Ex08.IPessoa;

public abstract class Pessoa implements IPessoa {

	Scanner ler = new Scanner(System.in);

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pessoa() {

	}

	public void editNome(String name) {
		System.out.print("Digite o nome: ");
		name = ler.next();

		if (name.length() > 1) {
			System.out.print("Nome alterado");
		} else {
			System.out.print("Não foi possível alterar o nome. Tenta colocar um digito amais.");
		}
	}

}