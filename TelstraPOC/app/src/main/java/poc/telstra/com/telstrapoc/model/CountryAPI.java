package poc.telstra.com.telstrapoc.model;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;


public interface CountryAPI {
    @GET("/u/746330/facts.json")
    Call<Country> loadCountryDetail();
}
