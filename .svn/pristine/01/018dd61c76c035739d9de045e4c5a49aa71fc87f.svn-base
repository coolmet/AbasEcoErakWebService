package com.abas.ecoerak.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Master
{
	@JsonProperty("WinSiparisID")
	public long winSiparisID;
	
	@JsonProperty("TedarikciKodu")
	public String tedarikciKodu;
	
	@JsonProperty("TedarikciAdi")
	public String tedarikciAdi;
	
	@JsonProperty("SiparisTarihi")
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd'T'HH:mm:ss",timezone="Europe/Istanbul")
	public Date siparisTarihi;
	
	@JsonProperty("SiparisNo")
	public String siparisNo;
	
	@JsonProperty("MusteriFirmaAdi")
	public String musteriFirmaAdi;
	
	@JsonProperty("KarsiSiparisNo")
	public String karsiSiparisNo;
	
	//
	// @Column
	// @JsonProperty("Line")
	// @ElementCollection(targetClass=Line.class)
	// List<Line> line;
	
	@Override
	public String toString()
	{
		return "TestModel [winSiparisID="+winSiparisID+", tedarikciKodu="+tedarikciKodu+", tedarikciAdi="+tedarikciAdi+", siparisTarihi="+siparisTarihi+", siparisNo="+siparisNo+", musteriFirmaAdi="+musteriFirmaAdi+", karsiSiparisNo="+karsiSiparisNo+"]";
	}
	
}
