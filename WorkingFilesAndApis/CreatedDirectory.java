package WorkingFilesAndApis;

import java.nio.file.Files;
import java.nio.file.Path;


public class CreatedDirectory {

    private static Path path = Path.of("C:\\Users\\Felipe Fernandes\\Documents\\My Games");

    public static void main(String[] args) throws Exception {
        Path newDirectory = Files.createDirectories(path.getParent().resolve("/new/source/dir"));
        System.out.println(newDirectory);

        /** .resolve() não cria o arquivo, apenas retorna uma referência ao arquivo (filho) que você está prestes a criar. */
        Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
        System.out.println(newFile);
    }
}
