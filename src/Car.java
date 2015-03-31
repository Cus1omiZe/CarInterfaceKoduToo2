public class Car
{
   private Engine engine;
   private String make;
   private int speed; //Default value = 0
  
   public Car(String make, Engine engine)
   {
      this.make = make;
      this.engine = engine;
   }//end constructor
  
   public void startEngine()
   {
      engine.start();
   }//end start engine
  
   public void stopEngine()
   {
      engine.stop();
   }//end stop engine
  
   public void speedUp(int mph)
   {
      speed += mph;
   }//end speedUp
  
   public void slowDown(int mph)
   {
      speed -= mph;
   }//end slow down
  
   public void stop()
   {
      speed = 0;
   }//end stop
  
   /**
    *tagastame "kütuse" kogust, mis oli kasutatud
    */
   public double drive(int distance)
   {
      return engine.useFuel(speed, distance);
   }//end drive
  
   @Override
   public String toString()
   {
      return String.format("%s %s'iga soidab kiirusega %dkm/h.", make, engine.getClass().getName(), speed);
   }//end to string
}//end car