package com.abas.ecoerak.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Distribution
{
	@JsonProperty("NwinsiparisDetID")
	long nwinsiparisDetID;
	
	@JsonProperty("KartKodu")
	String kartKodu;
	
	@JsonProperty("Sku")
	String sku;
	
	@JsonProperty("Beden")
	String beden;
	
	@JsonProperty("Boy")
	double boy;
	
	@JsonProperty("MusteriAdetY")
	double musteriAdetY;
	
	@JsonProperty("YikamaTalimati")
	String yikamaTalimati;
	
	@JsonProperty("Dil")
	String dil;
	
	@JsonProperty("FirmaAdi")
	String firmaAdi;
	
	@JsonProperty("UrunTanimi")
	String urunTanimi;
	
	@JsonProperty("UlkeKodu")
	String ulkeKodu;
	
	@JsonProperty("Alan1")
	String alan1;
	
	@JsonProperty("UretimYeri")
	String uretimYeri;
	
	@JsonProperty("UretilenAdet")
	double uretilenAdet;
	
	@JsonProperty("Adi")
	String adi;
	
	@Override
	public String toString()
	{
		return "Distribution [nwinsiparisDetID="+nwinsiparisDetID+", kartKodu="+kartKodu+", sku="+sku+", beden="+beden+", boy="+boy+", musteriAdetY="+musteriAdetY+", yikamaTalimati="+yikamaTalimati+", Dil="+dil+", firmaAdi="+firmaAdi+", urunTanimi="+urunTanimi+", ulkeKodu="+ulkeKodu+", alan1="
		+alan1+", uretimYeri="+uretimYeri+", uretilenAdet="+uretilenAdet+", adi="+adi+"]";
	}
	
}
