import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClientException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClienteRCP {

    public static void main (String args []) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl configuracion = new XmlRpcClientConfigImpl();
        configuracion.setServerURL(new URL ("http://localhost:1201"));

        XmlRpcClient cliente = new XmlRpcClient();
        cliente.setConfig(configuracion);
        Scanner leer = new Scanner(System.in);
        Object[] numeros = new Object [2];
        System.out.println("Ingrese el numero incial");
        numeros[0] = leer.nextInt();
        System.out.println("Ingrese el numero final");
        numeros[1] = leer.nextInt();

        String resultado = (String)cliente.execute("metodos.sumaInterna",numeros);
        System.out.println(resultado);

    }
}
