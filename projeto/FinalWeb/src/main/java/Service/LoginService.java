package Service;

public class LoginService {
 public boolean VerificarUsuario(String email, String senha) {
 if(email.equals("admin@gmail.com") && senha.equals("12345")) {
	    return true;
     }else {
	    return false;
     }
  }
}
