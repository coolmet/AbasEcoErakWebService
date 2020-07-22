package com.abas.ecoerak.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import com.fasterxml.jackson.annotation.JsonFormat;

public class TestOrder
{
	int WinSiparisID;
	String TedarikciKodu;
	String TedarikciAdi;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd'T'HH:mm:ss",timezone="Europe/Istanbul")
	String SiparisTarihi;
	String SiparisNo;
	String MusteriFirmaAdi;
	String KarsiSiparisNo;
	@Column
	@ElementCollection(targetClass=Line.class)
	List<Line> Lines;
	@Column
	@ElementCollection(targetClass=Distribution.class)
	List<Distribution> distribution;
	
	public int getWinSiparisID()
	{
		return WinSiparisID;
	}
	
	public void setWinSiparisID(int winSiparisID)
	{
		WinSiparisID=winSiparisID;
	}
	
	public String getTedarikciKodu()
	{
		return TedarikciKodu;
	}
	
	public void setTedarikciKodu(String tedarikciKodu)
	{
		TedarikciKodu=tedarikciKodu;
	}
	
	public String getTedarikciAdi()
	{
		return TedarikciAdi;
	}
	
	public void setTedarikciAdi(String tedarikciAdi)
	{
		TedarikciAdi=tedarikciAdi;
	}
	
	public String getSiparisTarihi()
	{
		return SiparisTarihi;
	}
	
	public void setSiparisTarihi(String siparisTarihi)
	{
		SiparisTarihi=siparisTarihi;
	}
	
	public String getSiparisNo()
	{
		return SiparisNo;
	}
	
	public void setSiparisNo(String siparisNo)
	{
		SiparisNo=siparisNo;
	}
	
	public String getMusteriFirmaAdi()
	{
		return MusteriFirmaAdi;
	}
	
	public void setMusteriFirmaAdi(String musteriFirmaAdi)
	{
		MusteriFirmaAdi=musteriFirmaAdi;
	}
	
	public String getKarsiSiparisNo()
	{
		return KarsiSiparisNo;
	}
	
	public void setKarsiSiparisNo(String karsiSiparisNo)
	{
		KarsiSiparisNo=karsiSiparisNo;
	}
	
	public List<Line> getLines()
	{
		return Lines;
	}
	
	public void setLines(List<Line> lines)
	{
		Lines=lines;
	}
	
	public List<Distribution> getDistribution()
	{
		return distribution;
	}
	
	public void setDistribution(List<Distribution> distribution)
	{
		this.distribution=distribution;
	}

	@Override
	public String toString()
	{
		return "Master [WinSiparisID="+WinSiparisID+", TedarikciKodu="+TedarikciKodu+", TedarikciAdi="+TedarikciAdi+", SiparisTarihi="+SiparisTarihi+", SiparisNo="+SiparisNo+", MusteriFirmaAdi="+MusteriFirmaAdi+", KarsiSiparisNo="+KarsiSiparisNo+", Lines="+Lines+", distribution="+distribution+"]";
	}
	
}
