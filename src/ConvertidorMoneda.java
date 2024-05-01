public class ConvertidorMoneda {

    public static double convertir(double importe, String monedaBase, String monedaAConvertir){

        ConexionAPI api = new ConexionAPI();

        Conversor resultado = api.buscaMoneda(monedaBase) ;

        return importe * resultado.conversion_rates().get(monedaAConvertir) ;

    }
}
