package MainPackage.IO;

import MainPackage.Excepciones.CustomizedException;
import MainPackage.Latas.Can;
import MainPackage.Latas.Measurable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Class in charge of input and output methods
 */
public class IO {

    private String FileName;

    public String getFileName() {
        return FileName;
    }

    /**
     * Method for entering a valid file name
     */
    public void enterFileName() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("--> Introducir el nombre del fichero binario .bin: ");
                FileName = sc.next();
                if (checkExtension(FileName)) {
                    return;
                }
            } catch (CustomizedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    /**
     *
     * Method in charge of checking the extension that must be .bin
     *
     * @param name - Name of the file
     * @return True if the extension is .bin
     * @throws CustomizedException
     */
    private boolean checkExtension(String name) throws CustomizedException {

        if (!name.contains(".")) {
            throw new CustomizedException("[!] El nombre del fichero no indica extensión");
        } else if (name.contains("/")) {
            throw new CustomizedException("Introduce únicamente el nombre, no se acepta el caracter '/'");
        }

        String pointIndex = name.substring(name.indexOf("."), name.length());
        boolean isbin = pointIndex.equals(".bin");

        if (isbin) {
            return true;
        } else {
            throw new CustomizedException("[!] Atención, la extensión permitida solo puede ser .bin: " + pointIndex);
        }
    }


    /**
     *
     * Method that prints out the contents of the raw binary file.
     *
     * @param file - Selected File
     */
    public void binaryCodeOutput(File file) {

        System.out.println("\n------ Contenido binario ------\n");
        try {
            boolean condition = true;

            FileInputStream binary = new FileInputStream(file);
            int counter = 0;
            try (Scanner output = new Scanner(binary)) {
                while (output.hasNextLine()) {
                    counter++;
                    System.out.println(output.nextLine());
                }
            }
            System.out.println("Número de líneas codificadas en binario: " + counter);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * Method that prints the content of the processed binary file so that it displays readable information
     *
     * @param cans - Arraylist of can type objects
     */
    public void showCans(ArrayList<Measurable> cans) {
        System.out.println("\n------ Datos (Modelo, altura y radio en mm) ------\n");
        int counter = 0;
        for (Measurable properties : cans) {

            if (properties instanceof Can) {
                System.out.printf("%s (%.2f mm) (%.2f mm)\n",
                        ((Can) properties).getName(),
                        ((Can) properties).getHeight(),
                        ((Can) properties).getRadius());
                counter++;

            }
        }
        System.out.printf("[i] El fichero cuenta con %d regístros de información.\n", counter);
    }


    /**
     *
     * Method that prints the program's result
     *
     * @param averageSurface - Average can surface
     * @param generalObject - Type of object
     */
    public void showDataProcessing(double averageSurface, Measurable generalObject) {
        System.out.println("\n------ Tratamiento de los datos ------\n");
        System.out.println("[i] Se procesan los registros\n");

        System.out.printf("[i] La superficie media empleada es de (%.2f)cm\u00B2\n", averageSurface);

        if (generalObject instanceof Can) {
            System.out.println("\n[i] El registro con mayor superficie es el modelo: " + ((Can) generalObject).getName());
        }
    }

}
