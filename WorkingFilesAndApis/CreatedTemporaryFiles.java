package WorkingFilesAndApis;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
    Criação de arquivos temporarios
 */
public class CreatedTemporaryFiles {
    private static final Path pathGet = Paths.get("C:/Users/Felipe Fernandes/Documents/My Games/readme.txt");
    public static void main(String[] args)  throws Exception{

        /**
         * Recebe 2 parametos principais, sendo eles o Prefixo e o Sufixo
         * Prefixo : É o nome do arquivo temporario
         * Sufixo: É a extensão do arquivo temporario (Caso não seja expecificado, será adicionada a extensão .tmp)
         * O arquivo será criado no diretorio de arquivos temporarios padrão
         */
        Path tempFile1 = Files.createTempFile("firstFile", ".txt");
        System.out.println(tempFile1);

        /**
         * Em vwez do diretorio padrão, também é possivel especificar o propio diretorio onde o arquivo seja criado.
         * */
        Path tempFile2 = Files.createTempFile(pathGet.getParent(), "secondFile", ".txt");
        System.out.println(tempFile2);

        /** Exemplo de criação apenas com o prefix ( Automaticamente o JAVA colocara o sufixo de .tmp no fim do arquivo )*/
        Path tempFile3 = Files.createTempFile("prefix",null);
        System.out.println(tempFile3);
    }
}
