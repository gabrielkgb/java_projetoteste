
//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;
//import java.text.ParseException;

import Entidades.Locacao;
import Entidades.Usuario;
import Entidades.Filme;
import Servicos.LocacaoService;
import Utilidades.DataUtil;
//import Utilidades.DataUtil;

 public class App {
	 // --- MAIN = TAG QUE FAZ A CLASSE EXEECUTAR O PROGRAMA
	 // --- OBS - NAO SE DEVE USAR EM TODAS AS CLASSES
	 
	 //public static void main(String[] args) {
	 //System.out.println("Ola, sou um programa de locadora!");
		
	 //List<Usuario> lista = new ArrayList<Usuario>(); 
		
		//	Usuario x = new Usuario();
		//	x.setNome("Ananias");
		//	lista.add(x);
	
		//	Usuario y = new Usuario();
		//	y.setNome("João");
		//	lista.add(y);
		
		//Usuario w = new Usuario("Bernardo");
		//lista.add(w);
		
		//	Usuario z = new Usuario("Gabriele");
		//lista.add(z);
		
		//	imprimir(lista);
		//		usarData();
		//	}

	//	public static void imprimir(List<Usuario> lista) {
	//	for(Usuario u: lista) {
			//		System.out.println(u);
			//		
			//	}
		//
		//	}

	// --- USANDO METODOS ASSINADOS COMO STATIC (INDICA QUE N PRECISA INSTANCIAR) E VOID (NAO RETORNA VALOR) 
	
	//	public static void usarData() {
		
		// --- IMPRIMINDO DATA
		// --- (NEW É USADA P/ INSTANCIAR METODOS QUE NAO SAO STATIC 
		
		//System.out.println(new Date());
		//	
		// --- IMPRIMINDO DATA CHAMANDO METODO DE OUTRA CLASSE
		
		//	System.out.println(DataUtil.obterDatecomDiferençaDias(5));
		
		//}
	
	//	public static void usarBoolean () {
		// --- 
		
//	}
	public static void main(String[] args) {
		// cenario
		
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("joaquim");
		Filme filme = new Filme("perdido em alto mar", 3, 5.0);
		
		//açâo
		
		Locacao locacao = service.alugarFilmes(usuario, filme);
		
		// verificação
		
		System.out.println(locacao.getValor() == 5.0);
		System.out.println(DataUtil.isMesmaData(locacao.getDataLocacao(), new Date()));
		System.out.println(DataUtil.isMesmaData(locacao.getDataRetorno(),
	    DataUtil.obterDatecomDiferençaDias(1)));
	}
	
}
 
 // --- NAO USAR O STATIC SEMPRE POR OCUPAR MT ESPAÇO E CAUSAR LENTIDAO NO PROGRAMA
