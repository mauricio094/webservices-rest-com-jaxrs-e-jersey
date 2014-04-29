package br.com.alura.loja.resource;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by macau on 09/07/17.
 */
@Path("carrinhos")
public class CarrinhoResource {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String busca() {
        Carrinho carrinho = new CarrinhoDAO().busca(1l);
        return carrinho.toXML();
    }
}
