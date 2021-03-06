/**
  Material do curso de Java
  @author Prof. Martin Mor�es
  @link https://github.com/E-Arcadia/
  @link http://escolaarcadia.blogspot.com.br/
  @e-mail escola.arcadia@gmail.com
 */


public class ExemplosSystemGetProperty {

	public static void main(String[] args) {
		System.out.println("Pasta padr�o do usu�rio:				" + System.getProperty("user.home"));
		System.out.println("Caractere separador de arquivo:			" + System.getProperty("file.separator"));
		System.out.println("Caractere separador de caminhos:		" + System.getProperty("path.separator"));
		System.out.println("Usu�rio que est� rodando o aplicativo:	" + System.getProperty("user.name"));
		System.out.println("Caminho do diret�rio temp:			" + System.getProperty("java.io.tmpdir"));
				
		System.out.println("Vers�o do JRE:						" + System.getProperty("java.version"));
		System.out.println("Vers�o da especifica��o do JRE:		" + System.getProperty("java.specification.version"));
		System.out.println("Vers�o da JVM:						" + System.getProperty("java.vm.specification.version"));
		System.out.println("Vers�o da implementa��o da JVM:		" + System.getProperty("java.vm.version"));
		System.out.println("Diret�rio de instala��o do Java:	" + System.getProperty("java.home"));
		System.out.println("Caminho das bibliotecas (library):	" + System.getProperty("java.library.path"));
		
		System.out.println("Pasta de onde foi lan�ado o aplicativo:	" + System.getProperty("user.dir"));
		System.out.println("Caminho das classes do aplicativo:	" + System.getProperty("java.class.path"));
		System.out.println("Nome do SO:							" + System.getProperty("os.name"));
		System.out.println("Arquitetura do SO:					" + System.getProperty("os.arch"));
		System.out.println("Vers�o do SO:						" + System.getProperty("os.version"));
	}
}
