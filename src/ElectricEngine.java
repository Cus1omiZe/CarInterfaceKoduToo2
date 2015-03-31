public class ElectricEngine implements Engine
{
   private final double hp;
  
   public ElectricEngine(double hp)
   {
      this.hp = hp;
   }//end constructor
  
   public double getHP()
   {
      return hp;
   }//end get litres
  
   public void start()
   {
      System.out.println("Kliki, et ilmuks roheline tuluke.");
   }//end start
  
   public void stop()
   {
      System.out.println("Kliki veel uks kord, ei ole rohelist tuluket.");
   }//end stop
  
   public double useFuel(int speed, int distance)
   {
       return speed * speed * distance * hp / 567.89;
   }//end use fuel
}//end class