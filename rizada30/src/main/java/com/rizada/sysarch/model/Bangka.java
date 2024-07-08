package com.rizada.sysarch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bangka")
public class Bangka {

    @Id
    private String bangkaId;
    private String bangkaName;
    private double totalPrices;

    public String getBangkaId() {
        return bangkaId;
    }

    public void setBangkaId(String bangkaId) {
        this.bangkaId = bangkaId;
    }

    public String getBangkaName() {
        return bangkaName;
    }

    public void setBangkaName(String bangkaName) {
        this.bangkaName = bangkaName;
    }

    public double getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(double totalPrices) {
        this.totalPrices = totalPrices;
    }
}
