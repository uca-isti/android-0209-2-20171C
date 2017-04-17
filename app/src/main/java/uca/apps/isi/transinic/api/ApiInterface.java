package uca.apps.isi.transinic.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import uca.apps.isi.transinic.models.Articulo;
import uca.apps.isi.transinic.models.Categoria;

/**
 * Created by isi3 on 4/4/2017.
 */

public interface ApiInterface {
    @GET("Articulos")
    Call<List<Articulo>> getArticulos();

    @POST("Articulos")
    Call<Articulo> createArticulo(@Body Articulo articulo);

    @GET("Categorias")
    Call<List<Categoria>> getCategorias();

    @POST("Categorias")
    Call<Categoria> createCategoria(@Body Categoria categoria);

}
