package spring.exemples.premierTestSpring.Classes;

public class ServiceImpl {
	
	private daoInterface dao;
	
	public ServiceImpl(daoInterface dao) {
		//dao=new DaoImpl();
		 this.dao=dao;
	}

	public float calculIMC() {
		
		return dao.getPoids()/(dao.getTaille()*dao.getTaille());
	
	}


	
	

}
