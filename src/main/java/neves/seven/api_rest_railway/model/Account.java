package neves.seven.api_rest_railway.model;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String number;

    private String agency;
    @Column
    private BigDecimal balance;
    @Column
    private BigDecimal limit;
    public long getId(){
        return id;
    }
    public String getNumber(){
        return number;
    }
    public String getAgency(){
        return agency;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public BigDecimal getLimit(){
        return limit;
    }
}
