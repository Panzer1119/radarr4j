package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.Tag;
import de.codemakers.radarr4j.model.TagDetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TagApi {
  /**
   * Edit a Tag
   * Edit a Tag by its database id
   * @param id ID of tag (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("tag/{id}")
  Call<Void> putTagId(
            @retrofit2.http.Path("id") Integer id            ,                 @retrofit2.http.Body Tag body    
  );

  /**
   * Get All Tag Details
   * Returns a list of tag detail objects for all tags in the database.
   * @return Call&lt;List&lt;TagDetail&gt;&gt;
   */
  @GET("tag/detail")
  Call<List<TagDetail>> tagDetailGet();
    

  /**
   * Get a Tag Details
   * Returns the id of all items in the database which use the specified tag
   * @param id Database id of tag (required)
   * @return Call&lt;TagDetail&gt;
   */
  @GET("tag/detail/{id}")
  Call<TagDetail> tagDetailIdGet(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Get All Tags
   * Get all tags in the database
   * @return Call&lt;List&lt;Tag&gt;&gt;
   */
  @GET("tag")
  Call<List<Tag>> tagGet();
    

  /**
   * Delete a Tag
   * Delete a tag
   * @param id ID of tag (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("tag/{id}")
  Call<Void> tagIdDelete(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Get a Tag
   * Return a given tag and its label by the database id.
   * @param id ID of tag (required)
   * @return Call&lt;Tag&gt;
   */
  @GET("tag/{id}")
  Call<Tag> tagIdGet(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Create a Tag
   * Create a new tag that can be assigned to a movie, list, delay profile, notification, or restriction
   * @param body Tag object that needs to be added (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tag")
  Call<Void> tagPost(
                    @retrofit2.http.Body Tag body    
  );

}
