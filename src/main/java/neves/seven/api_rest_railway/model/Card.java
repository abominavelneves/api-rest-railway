package neves.seven.api_rest_railway.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name="tb_cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String cardNumber;
    @Column
    private BigDecimal cardLimit;
    
    public long getId(){
        return id;
    }
    public String getNumber(){
        return cardNumber;
    }
    public BigDecimal getLImit(){
        return cardLimit;
    }
}
