package com.nttdata.pruebatecnica.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ExchangeRateResponse {
	

	@JsonProperty("monto")
    private String monto;
	
	@JsonProperty("montoConTipoCambio")
    private String montoConTipoCambio;
	
	@JsonProperty("monedaOrigen")
    private String monedaOrigen;
	
	@JsonProperty("monedaDestino")
    private String monedaDestino;

	@JsonProperty("result")
    private String result;
	
	@JsonProperty("documentation")
    private String documentation;
	
	@JsonProperty("terms_of_use")
    private String termsOfUse;
	
	@JsonProperty("time_last_update_unix")
    private String timeLastUpdate;
	
	
	@JsonProperty("time_last_update_utc")
    private String timeLastUpdateUtc;
	
	@JsonProperty("time_next_update_unix")
    private String timeNextUpdateUnix;
	
	@JsonProperty("time_next_update_utc")
    private String timeNextUpdateUtc;
	
	@JsonProperty("base_code")
    private String baseCode;
	
	@JsonProperty("target_code")
    private String targetCode;
	
	@JsonProperty("conversion_rate")
    private String conversionRate;
	
	@JsonProperty("conversion_result")
    private String conversionResult;

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getMontoConTipoCambio() {
		return montoConTipoCambio;
	}

	public void setMontoConTipoCambio(String montoConTipoCambio) {
		this.montoConTipoCambio = montoConTipoCambio;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String getTermsOfUse() {
		return termsOfUse;
	}

	public void setTermsOfUse(String termsOfUse) {
		this.termsOfUse = termsOfUse;
	}

	public String getTimeLastUpdate() {
		return timeLastUpdate;
	}

	public void setTimeLastUpdate(String timeLastUpdate) {
		this.timeLastUpdate = timeLastUpdate;
	}

	public String getTimeLastUpdateUtc() {
		return timeLastUpdateUtc;
	}

	public void setTimeLastUpdateUtc(String timeLastUpdateUtc) {
		this.timeLastUpdateUtc = timeLastUpdateUtc;
	}

	public String getTimeNextUpdateUnix() {
		return timeNextUpdateUnix;
	}

	public void setTimeNextUpdateUnix(String timeNextUpdateUnix) {
		this.timeNextUpdateUnix = timeNextUpdateUnix;
	}

	public String getTimeNextUpdateUtc() {
		return timeNextUpdateUtc;
	}

	public void setTimeNextUpdateUtc(String timeNextUpdateUtc) {
		this.timeNextUpdateUtc = timeNextUpdateUtc;
	}

	public String getBaseCode() {
		return baseCode;
	}

	public void setBaseCode(String baseCode) {
		this.baseCode = baseCode;
	}

	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}

	public String getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(String conversionRate) {
		this.conversionRate = conversionRate;
	}

	public String getConversionResult() {
		return conversionResult;
	}

	public void setConversionResult(String conversionResult) {
		this.conversionResult = conversionResult;
	}
	
	


}
