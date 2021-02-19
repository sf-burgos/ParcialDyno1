package app;

import com.google.gson.Gson;

public class Calculator {
    public Calculator(){}

    public static String Results(String trigo, Double number){
        Double salida = 0.0;
        if (trigo=="tan" || trigo=="TAN"){

            salida= Math.tan(number);
        }
        if (trigo=="cos" || trigo=="COS"){

            salida= Math.cos(number);
        }
        if (trigo=="sen" || trigo=="SEN"){
            salida= Math.sin(number);
        }

        return escuela(salida);
    }
    public  static String escuela (double num){
        Gson json = new Gson();
        String res = "{\"value\":"+num+"}";
        return json.toJson(res);
    }
}
