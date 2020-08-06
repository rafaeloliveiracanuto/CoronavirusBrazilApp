package com.example.coronavirusbrazil.service.model

import com.google.gson.annotations.SerializedName

class CovidDataModel {

    @SerializedName("uid")
    var id: Int = 0

    @SerializedName("uf")
    var uf: String = ""

    @SerializedName("state")
    var state: String = ""

    @SerializedName("cases")
    var cases: Int = 0

    @SerializedName("deaths")
    var deaths: Int = 0

    @SerializedName("suspects")
    var suspects: Int = 0

    @SerializedName("refuses")
    var refuses: Int = 0

    @SerializedName("datetime")
    var datetime: String = ""

}