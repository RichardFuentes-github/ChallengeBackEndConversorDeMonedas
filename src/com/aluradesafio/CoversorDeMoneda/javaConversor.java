package com.aluradesafio.CoversorDeMoneda;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class javaConversor {
    public static void main(String[] args) throws IOException,InterruptedException {
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - De Dólar a peso Argentino
                2 - De peso Argentino a Dólar
                3 - De Dólar a peso Colombiano
                4 - De peso Colombiano a Dólar
                5 - De Dólar a peso Chileno
                6 - De peso Chileno a Dólar
                7 - De Dólar a Soles Boliviano
                8 - De Soles Boliviano  a Dólar
                9 - De Dólar a Real Brasileño
                10 - De Real Brasileño  a Dólar
                11 - Salir
                """;
        while (opcion != 11){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadUSDARS = teclado.nextDouble();
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/USD/ARS/"+cantidadUSDARS))
                            .build();

                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    Gson gson = new Gson();
                    javaVariables Conversion=gson.fromJson(json,javaVariables.class);

                    System.out.println("El valor " + cantidadUSDARS + " en Dólares corresponde al valor final de =>>> " + Conversion.getValorDeConversion() + " pesos Argentinos");
                    break;
                case 2:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadARSUSD = teclado.nextDouble();
                    HttpClient client2 = HttpClient.newHttpClient();
                    HttpRequest request2 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/ARS/USD/"+cantidadARSUSD))
                            .build();

                    HttpResponse<String> response2 = client2
                            .send(request2, HttpResponse.BodyHandlers.ofString());
                    String json2 = response2.body();
                    Gson gson2 = new Gson();
                    javaVariables Conversion2=gson2.fromJson(json2,javaVariables.class);
                    System.out.println("El valor " + cantidadARSUSD + " en pesos Argentinos corresponde al valor final de =>>> " + Conversion2.getValorDeConversion() + " Dólares");
                    break;
                case 3:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadUSDCOL=teclado.nextDouble();
                    HttpClient client3 = HttpClient.newHttpClient();
                    HttpRequest request3 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/USD/COP/"+cantidadUSDCOL))
                            .build();

                    HttpResponse<String> response3 = client3
                            .send(request3, HttpResponse.BodyHandlers.ofString());
                    String json3 = response3.body();
                    Gson gson3 = new Gson();
                    javaVariables Conversion3=gson3.fromJson(json3,javaVariables.class);
                    System.out.println("El valor " + cantidadUSDCOL + " en Dólares corresponde al valor final de =>>> " + Conversion3.getValorDeConversion() + " pesos Colombianos");
                    break;
                case 4:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadCOLUSD=teclado.nextDouble();
                    HttpClient client4 = HttpClient.newHttpClient();
                    HttpRequest request4 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/COP/USD/"+cantidadCOLUSD))
                            .build();

                    HttpResponse<String> response4 = client4
                            .send(request4, HttpResponse.BodyHandlers.ofString());
                    String json4 = response4.body();
                    Gson gson4 = new Gson();
                    javaVariables Conversion4=gson4.fromJson(json4,javaVariables.class);
                    System.out.println("El valor " + cantidadCOLUSD + " en pesos Colombianos corresponde al valor final de =>>> " + Conversion4.getValorDeConversion() + " Dólares");
                    break;
                case 5:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadUSDCLP=teclado.nextDouble();
                    HttpClient client5 = HttpClient.newHttpClient();
                    HttpRequest request5 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/USD/CLP/"+cantidadUSDCLP))
                            .build();

                    HttpResponse<String> response5 = client5
                            .send(request5, HttpResponse.BodyHandlers.ofString());
                    String json5 = response5.body();
                    Gson gson5 = new Gson();
                    javaVariables Conversion5=gson5.fromJson(json5,javaVariables.class);
                    System.out.println("El valor " + cantidadUSDCLP + " en Dólares corresponde al valor final de =>>> " + Conversion5.getValorDeConversion() + " pesos Chilenos");
                    break;
                case 6:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadCLPUSD=teclado.nextDouble();
                    HttpClient client6 = HttpClient.newHttpClient();
                    HttpRequest request6 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/CLP/USD/"+cantidadCLPUSD))
                            .build();

                    HttpResponse<String> response6 = client6
                            .send(request6, HttpResponse.BodyHandlers.ofString());
                    String json6 = response6.body();
                    Gson gson6 = new Gson();
                    javaVariables Conversion6=gson6.fromJson(json6,javaVariables.class);
                    System.out.println("El valor " + cantidadCLPUSD + " en pesos Chilenos corresponde al valor final de =>>> " + Conversion6.getValorDeConversion() + " Dólares");
                    break;
                case 7:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadUSDBOB=teclado.nextDouble();
                    HttpClient client7 = HttpClient.newHttpClient();
                    HttpRequest request7 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/USD/BOB/"+cantidadUSDBOB))
                            .build();

                    HttpResponse<String> response7 = client7
                            .send(request7, HttpResponse.BodyHandlers.ofString());
                    String json7 = response7.body();
                    Gson gson7 = new Gson();
                    javaVariables Conversion7=gson7.fromJson(json7,javaVariables.class);
                    System.out.println("El valor " + cantidadUSDBOB + " en Dólares corresponde al valor final de =>>> " + Conversion7.getValorDeConversion() + " Soles");
                    break;
                case 8:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadBOBUSD=teclado.nextDouble();
                    HttpClient client8 = HttpClient.newHttpClient();
                    HttpRequest request8 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/BOB/USD/"+cantidadBOBUSD))
                            .build();

                    HttpResponse<String> response8 = client8
                            .send(request8, HttpResponse.BodyHandlers.ofString());
                    String json8 = response8.body();
                    Gson gson8 = new Gson();
                    javaVariables Conversion8=gson8.fromJson(json8,javaVariables.class);
                    System.out.println("El valor " + cantidadBOBUSD + " en Soles corresponde al valor final de =>>> " + Conversion8.getValorDeConversion() + " Dólares");
                    break;
                case 9:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadUSDBRL=teclado.nextDouble();
                    HttpClient client9 = HttpClient.newHttpClient();
                    HttpRequest request9 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/USD/BRL/"+cantidadUSDBRL))
                            .build();

                    HttpResponse<String> response9 = client9
                            .send(request9, HttpResponse.BodyHandlers.ofString());
                    String json9 = response9.body();
                    Gson gson9 = new Gson();
                    javaVariables Conversion9=gson9.fromJson(json9,javaVariables.class);
                    System.out.println("El valor " + cantidadUSDBRL + " en Dólares corresponde al valor final de =>>> " + Conversion9.getValorDeConversion() + " Reales");
                    break;
                case 10:
                    System.out.println("Escriba la cantidad que desea convertir");
                    double cantidadBRLUSD=teclado.nextDouble();
                    HttpClient client10 = HttpClient.newHttpClient();
                    HttpRequest request10 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/134c02a0dc720fcb0bb5ef93/pair/BRL/USD/"+cantidadBRLUSD))
                            .build();

                    HttpResponse<String> response10 = client10
                            .send(request10, HttpResponse.BodyHandlers.ofString());
                    String json10 = response10.body();
                    Gson gson10 = new Gson();
                    javaVariables Conversion10=gson10.fromJson(json10,javaVariables.class);
                    System.out.println("El valor " + cantidadBRLUSD + " en Reales corresponde al valor final de =>>> " + Conversion10.getValorDeConversion() + " Dólares");
                    break;
                case 11:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
