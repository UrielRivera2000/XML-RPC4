public class metodos {

    public String sumaInterna (int num1, int num2){
        int suma = 0;
        String numeros="";
        for(int x= num1+1 ; x<num2;x++){
             suma = suma+x;
              numeros = numeros+ x+", ";
        }
        return "El resultado de la suma de los numeros: "+numeros+ " es: "+ suma;
    }

}
