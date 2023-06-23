package MainPackage;

import MainPackage.Exec.Execution;
import MainPackage.Exec.managementFiles;
import MainPackage.IO.IO;

/**
 * Entry point to our application
 */
public class appMain {
    public static void main(String[] args) {
        appMain app = new appMain();
        app.software();
    }

    /**
     * Method that runs the program
     */
    private static void software(){
        IO inOut = new IO();
        inOut.enterFileName();
        managementFiles mf = new managementFiles(inOut.getFileName());
        inOut.binaryCodeOutput(mf.getFile());
        Execution ex = new Execution(mf.getFile());
        ex.extractCans();
        inOut.showCans(ex.getCans());
        inOut.showDataProcessing(ex.averageSurface(ex.getCans()), ex.largerSurface(ex.getCans()));
    }
}
