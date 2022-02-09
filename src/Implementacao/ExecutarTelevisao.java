package Implementacao;

import beans.Televisor;

public class ExecutarTelevisao {
	public static void main(String[] args) {
		Televisor tv = new Televisor();

		tv.mostrarStatus();
		tv.ligarTelevisor();
		tv.mostrarStatus();
	}
}
