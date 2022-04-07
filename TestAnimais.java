package atividade01;

public class TestAnimais {

	public static void main(String[] args) {
		
	 Cachorro an1 = new Cachorro();
	 Cavalo an2 = new Cavalo();	 
	 Gato an3 = new Gato();
	
	
		an1.setEspecie("Cachorro");
		an1.setNome("Zion");
		an1.setIdade(8);
		an1.setEmitirSom("Latido");
		an1.setCorrer("Corre");
		an1.imprimir();
		
		an2.setEspecie("Cavalo");
		an2.setNome("Tody");
		an2.setIdade(6);
		an2.setEmitirSom("Relincho");
		an2.setCavalgar("Cavalga");
		an2.imprimir();

		an3.setEspecie("Gato");
		an3.setNome("Crush");
		an3.setIdade(3);
		an3.setEmitirSom("Miado");
		an3.setSubirArvore("Sobe em árvores.");
		an3.imprimir();
		
		
	
		
	}

}
