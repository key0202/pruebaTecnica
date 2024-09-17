package com.nttdata.pruebatecnica.persistence;


import java.time.LocalDateTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ExchangeTransaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "convertedAmount", nullable = false)
    private Double convertedAmount;

    @Column(name = "originCurrency", nullable = false, length = 3)
    private String originCurrency;

    @Column(name = "destinationCurrency", nullable = false, length = 3)
    private String destinationCurrency;

    @Column(name = "exchangeRate", nullable = false)
    private Double exchangeRate;

    @Column(name = "transactionDate", nullable = false)
    private LocalDateTime transactionDate;

    
    
    
	public ExchangeTransaction() {
		
	}

	public ExchangeTransaction(Long id, double amount, Double convertedAmount, String originCurrency,
			String destinationCurrency, Double exchangeRate, LocalDateTime transactionDate) {
		this.id = id;
		this.amount = amount;
		this.convertedAmount = convertedAmount;
		this.originCurrency = originCurrency;
		this.destinationCurrency = destinationCurrency;
		this.exchangeRate = exchangeRate;
		this.transactionDate = transactionDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Double getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(Double convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	public String getOriginCurrency() {
		return originCurrency;
	}

	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}

	public String getDestinationCurrency() {
		return destinationCurrency;
	}

	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	

	

}
