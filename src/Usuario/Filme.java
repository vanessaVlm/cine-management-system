package Usuario;

import java.util.Date;

public class Filme {
	private String titulo;
	private String diretor;
	private String sinopse;
	private Date dataEstreia;

	public Filme() {
	}

	public Filme(String titulo, String diretor, String sinopse, Date dataEstreia) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.sinopse = sinopse;
		this.dataEstreia = dataEstreia;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Date getDataEstreia() {
		return dataEstreia;
	}

	public void setDataEstreia(Date dataEstreia) {
		this.dataEstreia = dataEstreia;
	}

	public String toString() {
		return "FILMES EM CARTAZ:\n" + "\n" + "TÍTULO: " + titulo + "\n" + "DIRETOR: " + diretor + "\n" + "SINOPSE: "
				+ sinopse + "\n" + "DATA DE ESTREIA: " + dataEstreia + "\n" + "---------------------";
	}
}
