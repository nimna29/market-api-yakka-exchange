package org.example.address;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.example.address.beans.Address;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/addresses")
public interface AddressesResource {
  @GET
  @Produces("application/json")
  List<Address> getListOfAddresses();

  @POST
  @Consumes("application/json")
  void creatingANewAddress(Address data);

  @Path("/(addressid)")
  @GET
  @Produces("application/json")
  Response getAddressById();

  @Path("/(addressid)")
  @PUT
  @Consumes("application/json")
  void updateAddress(Address data);

  @Path("/(addressid)")
  @DELETE
  void generatedMethod1();
}
