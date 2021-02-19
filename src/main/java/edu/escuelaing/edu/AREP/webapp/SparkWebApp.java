package edu.escuelaing.edu.AREP.webapp;
import app.Calculator;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

import java.util.Collections;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.port;

class SparkWebApp {

    private static String Mean;


    public static void main(String[] args) {
        port(getPort());
        get("/",((request, response) -> {
            Double num = Double.parseDouble(request.queryParams("value"));
            String a = request.queryParams("a");

            return Calculator.Results(a,num);

        }));
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set

    }

}