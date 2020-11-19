package Main;

public class Aeroport {
    
        private int idAeroport;
        private String nomAeroport;
      

        public Aeroport() {
        }

        public Aeroport(int idAeroport, String nomAeroport) {
            this.idAeroport = idAeroport;
            this.nomAeroport = nomAeroport;
            
        }

        public int getIdAeroport() {
            return this.idAeroport;
        }
       
        
        public void setIdAeroport(int idAeroport) {
            this.idAeroport = idAeroport;
        }
        
          
        public String getNomAeroport() {
            return nomAeroport;
        }

        public void setNomVAeroport(String nomAeroport) {
            this.nomAeroport = nomAeroport;
        }

    

}