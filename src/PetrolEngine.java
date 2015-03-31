public class PetrolEngine implements Engine
{
   private final double litres;
  
   public PetrolEngine(double litres)
   {
      this.litres = litres;
   }//end constructor
  
   public double getLitres()
   {
      return litres;
   }//end get litres
  
   public void start()
   {
      System.out.println("Paneme autot kaima, vroom, vroom.");
   }//end start
  
   public void stop()
   {
      System.out.println("Lulitame autot ara, thud clunk . . . ");
   }//end stop
  
   public double useFuel(int speed, int distance)
   {
       return speed * speed * distance * Math.sqrt(litres) / 123456.789;
   }//end use fuel
}//end class