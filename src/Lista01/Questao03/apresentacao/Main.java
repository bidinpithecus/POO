package Lista01.Questao03.apresentacao;

import Lista01.Questao03.dados.Imovel;
import Lista01.Questao03.negocio.Imobiliaria;

public class Main {
	private static Imobiliaria sistema = new Imobiliaria("Imobiliária do Zé");

	public static void main(String[] args) {
		sistema.cadastrarImovel(new Imovel(13, 20, 300000));
		sistema.cadastrarImovel(new Imovel(15, 20, 350000));
		sistema.cadastrarImovel(new Imovel(20, 30, 475000));
		sistema.cadastrarImovel(new Imovel(26, 40, 600000));
		sistema.cadastrarImovel(new Imovel(40, 60, 1100000));

		System.out.println("Todos os imóveis:\n" + sistema);

		System.out.println("Imóveis filtrados por área (600):\n");
		for (Imovel imovel : sistema.filtrarPorArea(600)) {
			System.out.println(imovel);
		}
	}
}
