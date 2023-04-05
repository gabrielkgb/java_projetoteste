package Service;

import dao.UsuarioDAO;
import modelo.Usuario;

public class LoginService {
	public boolean verificarUsuario(Usuario usuario) {
		UsuarioDAO dao= new UsuarioDAO();
		
		Usuario u = dao.validarlogin(usuario);
		
		if(u.getNome() != null) {
			return true;
		} else {
			return false;
		}
	}
}