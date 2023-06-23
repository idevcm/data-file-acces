package MainPackage.Exec;

import MainPackage.Latas.Can;
import MainPackage.Latas.Measurable;
import java.io.*;
import java.util.ArrayList;

/**
 * Class containing the methods that will execute the program.
 */

public class Execution {
    ArrayList<Measurable> Cans = new ArrayList<>();
    File file;

    /**
     * Getter
     *
     * @return - ArrayList de objetos tipo Lata
     */
    public ArrayList<Measurable> getCans() {
        return Cans;
    }

    /**
     * Method that imports the binary file into the class
     *
     * @param file
     */
    public Execution(File file) {
        this.file = file;
    }

    /**
     * Method that extracts the data from the binary file, creates objects of type lata and adds them to an arrayList
     */
    public void extractCans() {
        try {
            FileInputStream binary = new FileInputStream(file);
            DataInputStream cleanBinary = new DataInputStream(binary);
            while (cleanBinary.available() > 0) {
                String name = cleanBinary.readUTF();
                double height = cleanBinary.readDouble();
                double radius = cleanBinary.readDouble();
                Cans.add(new Can(name, height, radius));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method that calculates the average surface area of the set of cans.
     *
     * @param Package - ArrayList of Cans
     * @return Average surface
     */
    public double averageSurface(ArrayList<Measurable> Package) {
        int counter = 0;
        double accumulatedSurface = 0;

        for (Measurable properties : Package) {
            properties.getMeasure();
            double aux = properties.getMeasure();
            accumulatedSurface += aux;
            counter++;
        }

        return (accumulatedSurface / 100) / counter;

    }

    /**
     * Method for finding the can with the largest surface area
     *
     * @param packages - ArrayList of cans
     * @return Can with larger surface area
     */
    public Measurable largerSurface(ArrayList<Measurable> packages) {
        Measurable highest = packages.get(0);

        for (int i = 0; i < packages.size(); i++) {
            if (highest.getMeasure() < packages.get(i).getMeasure()) {
                highest = packages.get(i);
            }
        }
        return highest;
    }


}
