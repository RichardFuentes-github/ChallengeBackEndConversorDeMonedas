package com.aluradesafio.CoversorDeMoneda;

import com.google.gson.annotations.SerializedName;

public class javaVariables {
    @SerializedName("conversion_result")
    private String valorDeConversion;

    public String getValorDeConversion(){
        return valorDeConversion;
    }

}
