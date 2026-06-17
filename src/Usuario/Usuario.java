package Usuario;

public class Usuario {
	private String usuario;
	private String senha;
	private boolean Admin;

	public Usuario() {

	}

	public Usuario(String usuario, String senha, boolean Admin) {
		this.usuario = usuario;
		this.senha = senha;
		this.Admin = Admin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean verificarLogin(String username, String senha) {
		return this.usuario.equals(username) && this.senha.equals(senha);
	}

	public boolean isAdmin() {
		return Admin;
	}

	public void setAdmin(boolean isAdmin) {
		this.Admin = isAdmin;
	}

}
