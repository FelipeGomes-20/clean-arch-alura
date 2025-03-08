package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {
    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorio = new RepositorioDeUsuarioEmArquivo();

        repositorio.cadastrarUsuario(new Usuario("456.789.888-88", "João", LocalDate.parse("2000-10-15"),"joao@email.com"));

        repositorio.cadastrarUsuario(new Usuario("456.789.888-88", "Maria", LocalDate.parse("2000-10-15"),"joao@email.com"));

        repositorio.cadastrarUsuario(new Usuario("456.789.888-88", "Vinícius", LocalDate.parse("2000-10-15"),"joao@email.com"));

        repositorio.cadastrarUsuario(new Usuario("456.789.888-88", "Raphael", LocalDate.parse("2000-10-15"),"joao@email.com"));

        //System.out.println(repositorio.listarTodos());
        repositorio.gravaEmArquivo("usuarios.txt");
    }
}
