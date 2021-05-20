package conta;

import java.util.Random;

public class Conta {

	public static void main(String[] args) {
		
		int contas[][] = new int [10][2];
		String correntista[] = new String[]{"Paulo","Pedro","Gilberto","Ana Paula","José","Cláudio","Saulo","João","Karla","Ana Clara"};
		Random valor = new Random();
		int saldo = 1;
		for(int contacorrente=0;contacorrente<contas.length;contacorrente++) {
			contas[contacorrente][0] = contacorrente+1;
			contas[contacorrente][saldo] = valor.nextInt(100)+contacorrente; 
			// ou onde vc tem o valor de saldo gravado outro vetor aqui estou usando random para exemplo										
		}
		
		for(int contacorrente=0;contacorrente<contas.length;contacorrente++) {
			System.out.println("Conta 00"+contas[contacorrente][0]+" "+correntista[contacorrente]+" R$ "+contas[contacorrente][saldo]+",00");
		}
		// TODO Auto-generated method stub

	}

}
