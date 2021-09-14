package com.projeto.quarkus.resource;

import com.projeto.quarkus.entity.Categoria;
import com.projeto.quarkus.repository.CategoriaRepository;
import org.jboss.logging.annotations.Pos;

import javax.inject.Inject;
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

    @Inject
    private CategoriaRepository categoriaRepository;

    @GET
    public List<Categoria> listarCategorias() {
        return categoriaRepository.listAll();
    }

    @POST
    @Transactional
    public Categoria salvarCategoria(Categoria categoria) {
        categoria.persist();
        return categoria;
    }


}
