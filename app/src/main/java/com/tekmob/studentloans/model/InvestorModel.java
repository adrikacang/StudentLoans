package com.tekmob.studentloans.model;

/**
 * Created by Asus on 10/27/2016.
 */
public class InvestorModel extends UserModel {

    long fundPrice;
    String companyDescription;
    String criteria;

    public InvestorModel(long fundPrice, String companyDescription, String criteria) {
        this.fundPrice = fundPrice;
        this.companyDescription = companyDescription;
        this.criteria = criteria;
    }

    public InvestorModel(String name, String photo_profile, String id, long fundPrice, String companyDescription, String criteria) {
        super(name, photo_profile, id);
        this.fundPrice = fundPrice;
        this.companyDescription = companyDescription;
        this.criteria = criteria;
    }

    public long getFundPrice() {
        return fundPrice;
    }

    public void setFundPrice(long fundPrice) {
        this.fundPrice = fundPrice;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
}
