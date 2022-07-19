package questao1e2;

public class Preguica extends Animal{
	

	public Preguica() {
		super("Cachorro");
	}
	
	@Override
	public void Nome (String nomeDoanimal) {
		System.out.println("Nome da preguica: "+nomeDoanimal);
	}
	@Override
	public void Idade (int idadeDoanimal) {
		System.out.println("Idade: "+idadeDoanimal);
	}
	@Override
	public void Som (String somDoanimal) {
		System.out.println("Som que a preguica emite: "+somDoanimal);
	}
	public void Subirarvores () {
		System.out.println("A preguiça nao corre,sobe em arvores.");
	}
	public void infoPreguica() {
		
	}
	
}