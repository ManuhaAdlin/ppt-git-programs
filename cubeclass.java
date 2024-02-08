public class cubeclass 
{
    class Cube extends cubeclass
     {
        Cube() {
        }
        System.out.println(" 2D shape cube ")
        void CalculateVolume() {
            int a = 4;
            double vc = (double)(a * a * a);
            System.out.println("Volume of Cube = " + vc);
        }
    
        void CalculateSurfaceArea() {
            int a = 5;
            double sac = (double)(6 * a * a);
            System.out.println("Surface Area of Cube = " + sac);
        }
    }
    
}
