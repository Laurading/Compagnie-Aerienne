package Main;




public class Escale {
	
	  private int IdEscale;
	  private String NomEscale;
	  private String Heuredepart;
	  private String Heurearrive;
	  
	  public Escale() {
	    }
	  
	  public Escale(int IdEscale, String NomEscale, String Heuredepart,String Heurearrive) {
	        this.IdEscale = IdEscale;
	        this.NomEscale = NomEscale;
	        this.Heuredepart = Heuredepart;
	        this.Heurearrive = Heurearrive;
	        
	    }
	  
	  public int getIdEscale()
	    {
	        return this.IdEscale;
	    }
	   
	    
	    public void setIdEscale(int IdEscale)
	    {
	        this.IdEscale=IdEscale;  //this. fait référence idFour 
	                            //qui est le même que celui de l'attribut idFour
	    }
	    
	    public String getNomEscale()
	    {
	        return this.NomEscale;
	    }
	   
	    
	    public void setNomEscale(String NomEscale)
	    {
	        this.NomEscale=NomEscale;  //this. fait référence idFour 
	                            //qui est le même que celui de l'attribut idFour
	    }
	    
	    public String getHeuredepart()
	    {
	        return this.Heuredepart;
	    }
	   
	    
	    public void setHeuredepart(String Heuredepart)
	    {
	        this.Heuredepart=Heuredepart;  //this. fait référence idFour 
	                            //qui est le même que celui de l'attribut idFour
	    }
	    
	    public String getHeurearrive()
	    {
	        return this.Heurearrive;
	    }
	   
	    
	    public void setHeurearrive(String Heurearrive)
	    {
	        this.Heurearrive=Heurearrive;  //this. fait référence idFour 
	                            //qui est le même que celui de l'attribut idFour
	    }


}
