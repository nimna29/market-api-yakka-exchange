
package org.example.address.beans;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Address
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "contry"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("contry")
    private String contry;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("contry")
    public String getContry() {
        return contry;
    }

    @JsonProperty("contry")
    public void setContry(String contry) {
        this.contry = contry;
    }

}
