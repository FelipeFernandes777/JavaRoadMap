package WorkingFilesAndApis;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class WorkingFilesAndAPIs {
    /** JavaFile
     Path.of()
     */
    private static final Path path= Path.of("C:\\Users\\Felipe Fernandes\\Documents\\My Games\\readme.txt");
    /**Após o Java11
     Path.of passou a se chamar Paths.get
     */
    private static final Path pathGet = Paths.get("C:/Users/Felipe Fernandes/Documents/My Games/readme.txt");
    public static void main(String[] args) throws Exception {
        System.out.println(WorkingFilesAndAPIs.path);
        System.out.println(pathGet);
        /** Verifica se o caminho do arquivo existe
            Retorna um boolean ( true || false )
         */
        boolean exists = Files.exists(path);
        System.out.println("Exists = " + exists);

        /* Retorna a última data em que seu arquivo foi modificado como FileTimeObject */
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        System.out.println(lastModifiedTime);

        /* Comparando arquivos JAVA12+ */
        long isEqual = Files.mismatch(path, Paths.get("C:/Users/Felipe Fernandes/Documents/My Games/readme.txt"));
        /**  Ela compara os tamanhos e bytes de dois arquivos e retorna a posição da primeira incompatibilidade (byte). Ou -1L se não houver incompatibilidade.*/
        System.out.println("Is Equal " + isEqual);

        /* Obtendo os propietarios do arquivo */
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("Owner: "+ owner);
    }

    public Path getPath(){
        return path;
    }
}
