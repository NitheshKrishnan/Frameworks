package edu.jspiders.implicitbeanwiringannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CPU {

	@Autowired
	private MotherBoard mb;
	@Autowired
	private Processor pro;
	private Harddisk hd;
	private Ram ram;
	
	public CPU(MotherBoard mb, Processor pro, Harddisk hd, Ram ram) {
		
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		
		this.mb = mb;
		this.pro = pro;
		this.hd = hd;
		this.ram = ram;
	}
	
	public CPU() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public MotherBoard getMb() {
		return mb;
	}

	public void setMb(MotherBoard mb) {
		this.mb = mb;
	}

	public Processor getPro() {
		return pro;
	}

	public void setPro(Processor pro) {
		this.pro = pro;
	}

	public Harddisk getHd() {
		return hd;
	}
	
	@Autowired
	public void setHd(Harddisk hd) {
		this.hd = hd;
	}

	public Ram getRam() {
		return ram;
	}
	
	@Autowired
	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "CPU [mb=" + mb + ", pro=" + pro + ", hd=" + hd + ", ram=" + ram + "]";
	}
}