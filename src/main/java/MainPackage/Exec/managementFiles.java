package MainPackage.Exec;

import java.io.File;

/**
 * Class in charge of creating the file with which the program will work
 */
public class managementFiles {
    private File route = new File("src/main/resources");
    private File file;

    /**
     * Constructor
     *
     * @param fileName - Name of the file
     */
    public managementFiles(String fileName) {
        file = new File(route, fileName);
    }

    /**
     * Getter
     * @return File to work with
     */
    public File getFile() {
        return file;
    }

}