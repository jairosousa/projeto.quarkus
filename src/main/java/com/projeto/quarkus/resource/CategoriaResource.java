package com.projeto.quarkus.resource;

import com.projeto.quarkus.entity.Categoria;
import org.jboss.logging.annotations.Pos;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 14/09/2021 - 15:19
 */
@Path("/categoria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoriaResource {

    @GET
    public List<Categoria> listarCategorias() {
        Categoria categoria = new Categoria();
        return categoria.listarCategorias();
    }

    @POST
    @Transactional
    public Categoria salvarCategoria(Categoria categoria) {
        categoria.persist();
        return categoria;
    }


}
