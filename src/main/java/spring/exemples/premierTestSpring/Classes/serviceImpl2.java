package spring.exemples.premierTestSpring.Classes;

public class serviceImpl2 implements serviceInterface{

	private daoInterface dao;
	
	public serviceImpl2(daoInterface dao) {
		this.dao=dao;
	}
	
	
	public float calculIMC() {
		
		return dao.getPoids()/dao.getTaille();
	}


	public String getDetails() {
		
		return "POids: "+dao.getPoids()+" Taille: "+dao.getTaille();
	}

}
