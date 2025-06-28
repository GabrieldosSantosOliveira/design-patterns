public class Carro {
   private String cor;
   private String marca;
   private String modelo;
   private String tipo_de_motor;
   private String aro_roda;
   
   public Carro() {
   }
   public Carro(String cor, String marca, String modelo, String tipo_de_motor, String aro_roda) {
      this.cor = cor;
      this.marca = marca;
      this.modelo = modelo;
      this.tipo_de_motor = tipo_de_motor;
      this.aro_roda = aro_roda;
   }
   public String getCor() {
      return cor;
   }
   public void setCor(String cor) {
      this.cor = cor;
   }
   public String getMarca() {
      return marca;
   }
   public void setMarca(String marca) {
      this.marca = marca;
   }
   public String getModelo() {
      return modelo;
   }
   public void setModelo(String modelo) {
      this.modelo = modelo;
   }
   public String getTipo_de_motor() {
      return tipo_de_motor;
   }
   public void setTipo_de_motor(String tipo_de_motor) {
      this.tipo_de_motor = tipo_de_motor;
   }
   public String getAro_roda() {
      return aro_roda;
   }
   public void setAro_roda(String aro_roda) {
      this.aro_roda = aro_roda;
   }
   @Override
   public String toString() {
      return "Carro [cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", tipo_de_motor=" + tipo_de_motor
            + ", aro_roda=" + aro_roda + "]";
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((cor == null) ? 0 : cor.hashCode());
      result = prime * result + ((marca == null) ? 0 : marca.hashCode());
      result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
      result = prime * result + ((tipo_de_motor == null) ? 0 : tipo_de_motor.hashCode());
      result = prime * result + ((aro_roda == null) ? 0 : aro_roda.hashCode());
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Carro other = (Carro) obj;
      if (cor == null) {
         if (other.cor != null)
            return false;
      } else if (!cor.equals(other.cor))
         return false;
      if (marca == null) {
         if (other.marca != null)
            return false;
      } else if (!marca.equals(other.marca))
         return false;
      if (modelo == null) {
         if (other.modelo != null)
            return false;
      } else if (!modelo.equals(other.modelo))
         return false;
      if (tipo_de_motor == null) {
         if (other.tipo_de_motor != null)
            return false;
      } else if (!tipo_de_motor.equals(other.tipo_de_motor))
         return false;
      if (aro_roda == null) {
         if (other.aro_roda != null)
            return false;
      } else if (!aro_roda.equals(other.aro_roda))
         return false;
      return true;
   }
  
}