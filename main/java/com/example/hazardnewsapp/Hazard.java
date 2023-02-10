package com.example.hazardnewsapp;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Hazard {

    @SerializedName("LocationName")
    @Expose
    public String locationName;
    @SerializedName("Longitude")
    @Expose
    public String longitude;
    @SerializedName("Latitude")
    @Expose
    public String latitude;
    @SerializedName("HazardType")
    @Expose
    public String hazardType;
    @SerializedName("ReporterName")
    @Expose
    public String reporterName;

}