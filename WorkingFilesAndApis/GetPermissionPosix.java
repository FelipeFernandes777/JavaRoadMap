package WorkingFilesAndApis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

public class GetPermissionPosix {
    private static final Path path= Path.of("C:\\Users\\Felipe Fernandes\\Documents\\My Games\\readme.txt");
    public static void main(String[] args) {
        try{
            Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path);
            System.out.println("Permission" + permissions);
        }catch (UnsupportedOperationException | IOException ex){
            System.err.println("Parece que você não está executando um sistema de arquivos posix");
        }
    }
}
