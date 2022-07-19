package questao1e2;

public class Cachorro extends Animal{
	
	/* ESTUDAR MAIS  O CONCEITO DE SOBRECARGA E SOBRESCRITA */
	

	public Cachorro() {
		super("Cachorro");
	}
	
	@Override
	public void Nome (String nomeDoanimal) {
		System.out.println("Nome do cachorro: "+nomeDoanimal);
	}
	@Override
	public void Idade (int idadeDoanimal) {
		System.out.println("Idade: "+idadeDoanimal);
	}
	@Override
	public void Som (String somDoanimal) {
		System.out.println("Som que o seu cachorro emite: "+somDoanimal);
	}
	public void Corre () {
		System.out.println("O cachorro corre.");
	}
	
}

