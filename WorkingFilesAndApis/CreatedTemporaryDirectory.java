package WorkingFilesAndApis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatedTemporaryDirectory {

    /**Além dos arquivos, você também pode criar diretórios temporários. Como você não precisa do parâmetro suffix ao criar diretórios, você só precisa escolher especificar um parâmetro prefixo. */
    public static void main(String[] args) throws IOException {
        Path tmpDirectory = Files.createTempDirectory("Novo Diretorio");
        System.out.println(tmpDirectory);
    }
}
