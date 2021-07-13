package com.codeunlu.model;

import java.util.Date;

public class Flight {
    private Integer id;
    private Company company;
    private Date flightTimeStart;
    private Date flightTimeEnd;

    public Flight(){}

    public Flight(Integer id, Company company, Date flightTimeStart, Date flightTimeEnd) {
        this.id = id;
        this.company = company;
        this.flightTimeStart = flightTimeStart;
        this.flightTimeEnd = flightTimeEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getFlightTimeStart() {
        return flightTimeStart;
    }

    public void setFlightTimeStart(Date flightTimeStart) {
        this.flightTimeStart = flightTimeStart;
    }

    public Date getFlightTimeEnd() {
        return flightTimeEnd;
    }

    public void setFlightTimeEnd(Date flightTimeEnd) {
        this.flightTimeEnd = flightTimeEnd;
    }
}
