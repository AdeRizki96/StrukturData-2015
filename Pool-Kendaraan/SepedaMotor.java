public class SepedaMotor implements Kendaraan
{
  String plat;
  
  public SepedaMotor (String plat){
  this.plat=plat;  
  }
    
  public String plat(){
  return plat;  
  }
  
  public String tipe(){
  return "SepedaMotor";  
  }
}