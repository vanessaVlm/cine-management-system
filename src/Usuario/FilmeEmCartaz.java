package Usuario;

import java.util.ArrayList;
import java.util.Date;

public class FilmeEmCartaz {

	public static void main(String[] args) {

		ArrayList<Filme> listaFilmes = new ArrayList<>();

		@SuppressWarnings("deprecation")
		Date dataEstreiaGuerraMundialZ = new Date(2024 - 1900, 3, 25);

		Filme filmeGuerraMundialZ = new Filme("Guerra Mundial Z", "Marc Forster",
				"Um vírus letal se espalha rapidamente e transforma seres humanos em zumbis. O ex-agente da ONU Gerry Lane é chamado para investigar a epidemia que está acabando com a humanidade, iniciando uma verdadeira corrida contra o tempo.",
				dataEstreiaGuerraMundialZ);

		listaFilmes.add(filmeGuerraMundialZ);

		for (Filme filme : listaFilmes) {
			System.out.println(filme);
		}

	}

}
