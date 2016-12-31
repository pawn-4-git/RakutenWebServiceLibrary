/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakuten.webservice.market.product.Entity;

import rakuten.webservice.market.product.Enum.RakutenIchibaAgeEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaCarrierEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaRankingSerchPeriodEnum;
import rakuten.webservice.market.product.Enum.RakutenIchibaSexEnum;


/**
 *
 * @author Pawn
 */
public class RakutenIchibaRankingSearchEntity {
    private Long genreId;
    private Integer age;
    private Integer sex;
    private Integer carrier;
    private Integer page;
    private String period;

    /**
     * @return the genreId
     */
    public Long getGenreId() {
        return genreId;
    }

    /**
     * @param genreId the genreId to set
     */
    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public void setAge(RakutenIchibaAgeEnum value){
        this.age=value.getValue();
    }
    
    

    /**
     * @return the sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    
    public void setSex(RakutenIchibaSexEnum value){
        this.sex=value.getValue();
    }

    /**
     * @return the carrier
     */
    public Integer getCarrier() {
        return carrier;
    }

    /**
     * @param carrier the carrier to set
     */
    public void setCarrier(Integer carrier) {
        this.carrier = carrier;
    }
    
    public void setCarrier(RakutenIchibaCarrierEnum value){
        this.carrier=value.getValue();
    }

    /**
     * @return the page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 非推奨
     * 指定するとエラーが返されるので
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }
    
    /**
     * 非推奨
     * 指定するとエラーが返されるので
     * @param value 
     */
    public void setPeriod(RakutenIchibaRankingSerchPeriodEnum value){
        this.period=value.getValue();
    }
    
    
}
