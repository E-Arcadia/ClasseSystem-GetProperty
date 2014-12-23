/**
  Material do curso de Java
  @author Prof. Martin Morães
  @link https://github.com/E-Arcadia/
  @link http://escolaarcadia.blogspot.com.br/
  @e-mail escola.arcadia@gmail.com
 */


public class ExemplosSystemGetProperty {

	public static void main(String[] args) {
		System.out.println("Pasta padrão do usuário:				" + System.getProperty("user.home"));
		System.out.println("Caractere separador de arquivo:			" + System.getProperty("file.separator"));
		System.out.println("Caractere separador de caminhos:		" + System.getProperty("path.separator"));
		System.out.println("Usuário que está rodando o aplicativo:	" + System.getProperty("user.name"));
		System.out.println("Caminho do diretório temp:			" + System.getProperty("java.io.tmpdir"));
				
		System.out.println("Versão do JRE:						" + System.getProperty("java.version"));
		System.out.println("Versão da especificação do JRE:		" + System.getProperty("java.specification.version"));
		System.out.println("Versão da JVM:						" + System.getProperty("java.vm.specification.version"));
		System.out.println("Versão da implementação da JVM:		" + System.getProperty("java.vm.version"));
		System.out.println("Diretório de instalação do Java:	" + System.getProperty("java.home"));
		System.out.println("Caminho das bibliotecas (library):	" + System.getProperty("java.library.path"));
		
		System.out.println("Pasta de onde foi lançado o aplicativo:	" + System.getProperty("user.dir"));
		System.out.println("Caminho das classes do aplicativo:	" + System.getProperty("java.class.path"));
		System.out.println("Nome do SO:							" + System.getProperty("os.name"));
		System.out.println("Arquitetura do SO:					" + System.getProperty("os.arch"));
		System.out.println("Versão do SO:						" + System.getProperty("os.version"));
	}
}
