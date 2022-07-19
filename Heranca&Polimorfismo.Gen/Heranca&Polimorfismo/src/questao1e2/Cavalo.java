package questao1e2;

public class Cavalo extends Animal{
	

	public Cavalo() {
		super("Cachorro");
	}
	
	@Override
	public void Nome (String nomeDoanimal) {
		System.out.println("Nome do cavalo: "+nomeDoanimal);
	}
	@Override
	public void Idade (int idadeDoanimal) {
		System.out.println("Idade: "+idadeDoanimal);
	}
	@Override
	public void Som (String somDoanimal) {
		System.out.println("Som que o cavalo emite: "+somDoanimal);
	}
	public void Corre () {
		System.out.println("O cavalo corre.");
	}
	
}
