package third.world.demo.model;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.identify
     *
     * @mbg.generated
     */
    private String identify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.authId
     *
     * @mbg.generated
     */
    private Integer authid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.identify
     *
     * @return the value of role.identify
     *
     * @mbg.generated
     */
    public String getIdentify() {
        return identify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.identify
     *
     * @param identify the value for role.identify
     *
     * @mbg.generated
     */
    public void setIdentify(String identify) {
        this.identify = identify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.authId
     *
     * @return the value of role.authId
     *
     * @mbg.generated
     */
    public Integer getAuthid() {
        return authid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.authId
     *
     * @param authid the value for role.authId
     *
     * @mbg.generated
     */
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
}