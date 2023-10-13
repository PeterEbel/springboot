package com.shop.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

    private long id;
    private String entityId;
    private String customerNumber;
    private String validFrom;
    private String validTo;
    private String genderCode;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String countryCode;
    private String postalCode;
    private String city;
    private String street;
    private String partitionDate;

    public Customer() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "entity_id", nullable = false)
    public String getEntityId() {
        return entityId;
    }
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Column(name = "customer_number", nullable = false)
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Column(name = "valid_from_date", nullable = false)
    public String getValidFrom() {
        return validFrom;
    }
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    @Column(name = "valid_to_date", nullable = false)
    public String getValidTo() {
        return validTo;
    }
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    @Column(name = "gender_code", nullable = false)
    public String getGenderCode() {
        return genderCode;
    }
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "birth_date", nullable = false)
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "country_code", nullable = false)
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Column(name = "postal_code", nullable = false)
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Column(name = "city", nullable = false)
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "street", nullable = false)
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "data_date_part", nullable = false)
    public String getPartitionDate() {
        return partitionDate;
    }
    public void setPartitionDate(String partitionDate) {
        this.partitionDate = partitionDate;
    }

}
