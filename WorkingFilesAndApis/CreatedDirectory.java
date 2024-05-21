package WorkingFilesAndApis;

import java.nio.file.Files;
import java.nio.file.Path;


public class CreatedDirectory {

    private static WorkingFilesAndAPIs path = new WorkingFilesAndAPIs();

    public static void main(String[] args) throws Exception {
        Path newDirectory = Files.createDirectories(path.getPath().getParent().resolve("/new/source/dir"));
        System.out.println(newDirectory);

        /** .resolve() não cria o arquivo, apenas retorna uma referência ao arquivo (filho) que você está prestes a criar. */
        Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
        System.out.println(newFile);
    }
}
