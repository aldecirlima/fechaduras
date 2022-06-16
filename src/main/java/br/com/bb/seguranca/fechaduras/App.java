package br.com.bb.seguranca.fechaduras;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.bb.seguranca.fechaduras.modelo.Fechadura;
import br.com.bb.seguranca.fechaduras.popula.PopulaBanco;

public class App {

	public static void main(String[] args) {
		System.out.println("Iniciando Consulta Fechaduras...");

		try {
//			new PopulaBanco().testeFechadura();
			new PopulaBanco().popularBanco();
		} catch (ParseException e) {
			System.out.println("Erro na conversão de data" + e);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fechaduras gravadas no Banco de dados.");

		List<Fechadura> fechaduras = new ArrayList<Fechadura>();
		fechaduras = new FechaduraService().findNativeAll();

		System.out.println("Total de " + fechaduras.size() + " fechaduras consultadas.");

	}

}
