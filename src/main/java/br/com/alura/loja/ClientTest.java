package br.com.alura.loja;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Created by macau on 09/07/17.
 */
public class ClientTest {
    @Test
    public void testQueAConexaoComOServidorFunciona() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://www.mocky.io");
        String conteudo = target.path("/v2/52aaf5deee7ba8c70329fb7d").request(MediaType.APPLICATION_JSON;
        System.out.println(conteudo);
        Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185"));
    }

    @Test
    public void testQuegaranteOAcessoAUriCarrinhos() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080");
        String conteudo = target.path("/carrinhos").request().get(String.class);
        System.out.println(conteudo);
        Assert.assertTrue(conteudo.contains("<nome>Videogame 4"));
    }

    @Test
    public void testQuegaranteOAcessoAUriProjetos() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080");
        String conteudo = target.path("/projetos").request().get(String.class);
        System.out.println(conteudo);
        Assert.assertTrue(conteudo.contains("<nome>Minha loja<"));
    }
}
