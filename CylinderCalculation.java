import java.util.Scanner;

// Base class
class Cylindrical {
    double radius;
    double height;

    // This part allow the user to input the radius and height
    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
    }

    // Formula to compute the surface area of the cylinder
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Derived class
class CylinderVol extends Cylindrical {

    // Method to compute the volume of the cylinder
    double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

public class CylinderCalculation {
    public static void main(String[] args) {
        // Create an object of the derived class
        CylinderVol cylinder = new CylinderVol();

        // Get input for radius and height
        cylinder.getInput();

        // Compute and display the area and volume
        double area = cylinder.area();
        double volume = cylinder.volume();

        System.out.println("Surface Area of the cylinder: " + area);
        System.out.println("Volume of the cylinder: " + volume);
    }
}