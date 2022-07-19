package questao1e2;

public abstract class Animal {
	

	private String TipoAnimal;
	
	public Animal (String tipoanimal) {
		this.TipoAnimal = tipoanimal;
	}
	
	abstract public void Nome (String nomeDoanimal);
	abstract public void Idade (int idadeDoanimal);
	abstract public void Som (String somDoanimal);


	public String getTipoAnimal() {
		return TipoAnimal;
	}


	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}
	
		
}