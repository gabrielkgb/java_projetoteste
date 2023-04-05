package modelo;

public class Usuario {
private Integer id;
private String usuario;
private String nome;
private String senha;
private String email;



public Usuario() {
	super();
}

public Usuario(String usuario, String nome, String senha, String email ) {
	super();
	this.usuario = usuario;
	this.senha = senha;
	this.email = email;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
	
public String getNome() {
		return nome;
	}
public void setNome(String nome) {
		this.nome = nome;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
