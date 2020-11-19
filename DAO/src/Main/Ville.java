package Main;

public class Ville {
	
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */


	    private int idVille;
	    private String nomVille;
	  

	    public Ville() {
	    }

	    public Ville(int idVille, String nomVille) {
	        this.idVille = idVille;
	        this.nomVille = nomVille;
	        
	    }

	    public int getIdVille()
	    {
	        return this.idVille;
	    }
	   
	    
	    public void setIdVille(int idVille)
	    {
	        this.idVille=idVille;  //this. fait référence idFour 
	                            //qui est le même que celui de l'attribut idFour
	    }
	      
	    public String getNomVille() {
	        return nomVille;
	    }

	    public void setNomVille(String nomVille) {
	        this.nomVille = nomVille;
	    }

	

}
