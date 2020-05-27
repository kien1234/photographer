/*
* Gallery.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package model;

/**
 * Gallery.<br>
 *
 * <pre>
 * Class mô tả đối tượng Gallery
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetId.
 * . SetId.
 * . getName.
 * . setName.
 * . getMainPicture.
 * . setMainPicture.
 * . getDescription.
 * . setDescription.
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class Gallery {
    /**
     * Store id.
     */
    private int id;
    /**
     * Store name.
     */
    private String name;
    /**
     * Store mainPicture.
     */
    private String mainPicture;
    /**
     * Store description.
     */
    private String description;

    /**
     * Constructor no parameter.<br>
     */
    public Gallery() {
    }

    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param name
     * @param mainPicture
     * @param description
     */
    public Gallery(int id, String name, String mainPicture, String description) {
        this.id = id;
        this.name = name;
        this.mainPicture = mainPicture;
        this.description = description;
    }

    /**
     * get id <br>
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
     * get name <br>
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.<br>
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get mainPicture <br>
     *
     * @return the mainPicture
     */
    public String getMainPicture() {
        return mainPicture;
    }

    /**
     * Set mainPicture.<br>
     *
     * @param mainPicture the mainPicture
     */
    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    /**
     * get description <br>
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description.<br>
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
