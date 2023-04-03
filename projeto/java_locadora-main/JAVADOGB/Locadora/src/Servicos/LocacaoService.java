package Servicos;

import java.util.Date;

import Entidades.Filme;
import Entidades.Locacao;
import Entidades.Usuario;
import Utilidades.DataUtil;

public class LocacaoService {
public Locacao alugarFilmes(Usuario usuario, Filme filme) {
	Entidades.Locacao locacao = new Locacao();
	locacao.setFilme(filme);
	locacao.setUsuario(usuario);
	locacao.setDataLocacao(new Date());
	locacao.setValor(filme.getPrecoLocacao());
	
	// Entrega no dia seguinte
	Date dataEntrega = new Date();
	dataEntrega = Utilidades.DataUtil.adicionarDias(dataEntrega, 1);
	locacao.setDataRetorno(dataEntrega);
	
	return locacao;
}
}
