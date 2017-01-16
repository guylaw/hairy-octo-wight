package com.glaw;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import com.sun.xml.internal.ws.util.xml.ContentHandlerToXMLStreamWriter;

import sun.net.www.protocol.file.Handler;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("syncresource")
public class SyncResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @POST
    @Produces(MediaType.APPLICATION_XML)
    public String postIt() {
      return "<xml>id</xml>";
          
    }
    
    private String marshall(Customer customer){
      JAXBContext jaxbContext;
      Marshaller jaxbMarshaller;
      try {
        CreateExemptionCertificate cc = ...;
        JAXBContext context = JAXBContext.newInstance(CreateExemptionCertificate.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        m.marshal(cc, sw);

        String result = sw.toString();
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (JAXBException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      return "";;
    }
}
