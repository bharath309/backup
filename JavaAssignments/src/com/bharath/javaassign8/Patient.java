package com.bharath.javaassign8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Patient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Doctor dc=new Doctor(1234, "Ram", "Physician");
		Doctor dc1=new Doctor(1234, "Srikanth", "Physician");
		Doctor dc2=new Doctor(1234, "Ashish", "Cardiologist");
		Doctor dc3=new Doctor(1234, "Ronaldo", "Dermotologist");
		Doctor dc4=new Doctor(1234, "Sakshi", "Neurologist");

		Address ad=new Address("1400", "Sheperd dr", "Sterling", "VA", 20164);
		Address ad1=new Address("1600", "Belmont", "Herndon", "VA", 20167);
		Address ad2=new Address("2219", "Astoria", "Ashburn", "VA", 20170);
		Address ad3=new Address("1202", "Jones rd", "Reston", "VA", 20172);
		Address ad4=new Address("2265", "Ashis ave", "Chantily", "VA", 20168);

		Hospital hsp=new Hospital("abc",dc,ad);
		Hospital hsp1=new Hospital("abc",dc1,ad1);
		Hospital hsp2=new Hospital("bcd",dc2,ad2);
		Hospital hsp3=new Hospital("cde",dc3,ad3);
		Hospital hsp4=new Hospital("efg",dc4,ad4);

		List<Hospital> al=new ArrayList<>();
		al.add(hsp);
		al.add(hsp1);
		al.add(hsp2);
		al.add(hsp3);
		al.add(hsp4);
		for(Hospital oa:al) {

			System.out.println(oa.toString());
		}
		nearbyhptl(al);
		splHptl(al);
		Scanner in =new Scanner(System.in);
		System.out.println("Please Enter the details of hospital that you want to update.");
		System.out.println("Enter hospital Name");
		String hname=in.nextLine();
		System.out.println("Enter hospital Address Step by step");
		System.out.println("Enter hospital addre1");
		String addre1=in.nextLine();
		System.out.println("enter hospital add2");
		String addre2=in.nextLine();
		System.out.println("enter city name");
		String city1=in.nextLine();
		System.out.println("enter state name in short form");
		String state1=in.nextLine();
		System.out.println("enter zip code");
		int zip=in.nextInt();
		Address ad5=new Address(addre1, addre2, city1, state1, zip);
		Doctor dc5=new Doctor();
		Hospital hp5=new Hospital(hname, dc5, ad5);
		if(al.contains(hp5)) {
			 System.out.println(" we have already this hospital details");
		}else {
			System.out.println("we dont have this hospital. we are now updating and doctor details");
			System.out.println("enter doctor Id");
			int docId=in.nextInt();
			System.out.println("enter name of doctor");
			String name=in.nextLine();
			System.out.println("enter Specialization");
			String specialization=in.nextLine();
			Doctor dcf=new Doctor(docId,name,specialization);
			Hospital hpnew=new Hospital(hname, dcf, ad5);
			al.add(hpnew);
			System.out.println("new hospital added");
		}
		System.out.println("**********************************************************************");
	
		
	}
	@SuppressWarnings("resource")
	public static void nearbyhptl(List<Hospital>al)	{	
		Scanner in =new Scanner(System.in);
		System.out.println("ente zip code");

		int zip1=in.nextInt();
		
		Hospital near=null;
		for(Hospital oa:al) {
			if(Math.abs(zip1-oa.hospitalAddress.getZipCode())<zip1){
				
				System.out.println(Math.abs(zip1-oa.hospitalAddress.getZipCode()));
				near=new Hospital(oa.getHospitalName(),oa.doc,oa.hospitalAddress);
			}
		}
		System.out.println(near);
	}
	public static void splHptl(List<Hospital> al){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sepcialist required :");
		String illName = scan.next();
		for(Hospital h:al){
			if(illName.equals(h.doc.getSpecialization())){
				System.out.println(h.getHospitalName());
			}
		}
		scan.close();
	}
}
class Hospital{
	String hospitalName;
	Doctor doc;
	Address hospitalAddress;
	public Hospital(String hospitalName, Doctor doc, Address hospitalAddress) {
		super();
		this.hospitalName = hospitalName;
		this.doc = doc;
		this.hospitalAddress = hospitalAddress;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public Address getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(Address hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	@Override
	public String toString() {
		return "Hosipital [hospitalName=" + hospitalName + ", doc=" + doc + ", hospitalAddress=" + hospitalAddress
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hospitalAddress == null) ? 0 : hospitalAddress.hashCode());
		result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (hospitalAddress == null) {
			if (other.hospitalAddress != null)
				return false;
		} else if (!hospitalAddress.equals(other.hospitalAddress))
			return false;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		return true;
	}




}
class Doctor{
	int docId;
	String name;
	String specialization;
	public Doctor(int docId, String name, String specialization) {
		super();
		this.docId = docId;
		this.name = name;
		this.specialization = specialization;
	}
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", name=" + name + ", specialization=" + specialization + "]";
	}


}

class Address{

	String address1;
	String address2;
	String city;
	String state;
	int zipCode;
	public Address(String address1, String address2, String city, String state, int zipCode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}



}