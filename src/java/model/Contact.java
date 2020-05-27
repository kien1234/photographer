/*
* Article.java
*
* All Right Reserved
* Copyright (c) 2019 FPT University
 */
package model;

/**
 * Contact.<br>
 *
 * <pre>
 * Class mô tả đối tượng Contact
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetId.
 * . SetId.
 * . GetAddress.
 * . SetAddress.
 * . GetCity.
 * . SetCity.
 * . GetCountry.
 * . SetCountry.
 * . GetTel.
 * . SetTel.
 * . GetEmail.
 * . SetEmail.
 * . GetAboutMe.
 * . SetAboutMe.
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class Contact {

    /**
     * Store id.
     */
    private int id;
    /**
     * Store address.
     */
    private String address;
    /**
     * Store city.
     */
    private String city;
    /**
     * Store country.
     */
    private String country;
    /**
     * Store tel
     */
    private String tel;
    /**
     * Store email.
     */
    private String email;
    
    /**
     * Store aboutMe.
     */
    private String aboutMe;

    /**
     * Constructor no parameter.<br>
     */
    public Contact() {
    }

    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param address
     * @param city
     * @param country
     * @param tel
     * @param email
     */
    public Contact(int id, String address, String city, String country, String tel, String email) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.email = email;
    }

    /**
     * Get id.<br>
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id.<br>
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get address.<br>
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.<br>
     *
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get city.<br>
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set city.<br>
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get address.<br>
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set country.<br>
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get tel.<br>
     *
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Set tel.<br>
     *
     * @param tel the tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Get email.<br>
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set address.<br>
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * get aboutMe <br>
     *
     * @return the aboutMe
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * Set aboutMe.<br>
     *
     * @param aboutMe the aboutMe
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}
