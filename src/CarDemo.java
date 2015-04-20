public class CarDemo
{
   public static void main(String[] args)
{
  Car ford = new Car("Ford", new PetrolEngine(1.3));//1.3 litre engine
  Car prius = new Car("Prius", new ElectricEngine(50));
  ford.startEngine();
  ford.speedUp(50);
  System.out.println(ford);
  System.out.printf("Votab %f liitrit kutust, et 50 kilomeetrit soita.%n", ford.drive(50));
  ford.stop();
  ford.stopEngine();
  prius.startEngine();
  prius.speedUp(50);
  System.out.println(prius);
  System.out.printf("Votab %f liitrit kutust, et 150 kilomeetrit soita.%n", prius.drive(150));
  prius.stop();
  prius.stopEngine();
}//end main
}//end car demo