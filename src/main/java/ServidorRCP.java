import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;

public class ServidorRCP {
    public static void main (String [] args) throws XmlRpcException , IOException {
        System.out.println("Iniciando servidor RPC...");
        PropertyHandlerMapping mapeo = new PropertyHandlerMapping();
        mapeo.addHandler("metodos", metodos.class);
        // Instanciar el servidor
        WebServer servidor = new WebServer(1201);
        //colocamos el mapeo a la dirección
        servidor.getXmlRpcServer().setHandlerMapping(mapeo);
        servidor.start();
        System.out.println("Esperando peticion");
    }
}
