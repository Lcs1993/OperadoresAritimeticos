
public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int numero = 8;
		System.out.println(numero++);
		System.out.println(numero);
		numero--;
		System.out.println(numero);
		int valor=3 + ++numero;
		System.out.println(valor);
		System.out.println(numero);
		System.out.println("arredondamento");
		float valorA=8.9f;
		int arredondaBaixo=(int)Math.floor(valorA);
		System.out.println(arredondaBaixo);
		int arredondaAcima=(int)Math.ceil(valorA);
		System.out.println(arredondaAcima);
		int arredondaAritimetico=(int)Math.round(valorA);
		System.out.println(arredondaAritimetico);
		System.out.println(Math.round(5.4f));
		double ale=Math.random();
		System.out.println(ale);
		int numeroAleatorio=(int)(5+ale*(100-5));
		System.out.println(numeroAleatorio);
	}

}
