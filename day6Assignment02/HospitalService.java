package day6Assignment02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HospitalService {

	List<Hospital> hospital_list = new ArrayList<Hospital>();


	public List<Hospital>  addHospital(Hospital hospital){

		hospital_list.add(hospital);

		return hospital_list;

	}

	public HashMap<Integer,String>  getHospitals(){
		HashMap<Integer,String> hospitalKeyNameList =new HashMap<Integer,String>();

		for(Hospital h:hospital_list) {

			hospitalKeyNameList.put(h.getHospitalCode(), h.getHospitalName());
		}
		return hospitalKeyNameList;

	}

	public ArrayList<Hospital> getHospitalDetails(int hospitalCode) throws HosiptalDetailsNotFoundException{
		ArrayList<Hospital> hospitalDetailsByHpCode = new ArrayList<>();
		int count = 0;
		for(Hospital h: hospital_list) {
			if(h.getHospitalCode() == hospitalCode) {
				count = count + 1;

			}
			if(count == 1) {
				count++;
				hospitalDetailsByHpCode.add(h);
			}
		}
		if(count == 0) {
			throw new HosiptalDetailsNotFoundException("Hospital code is not valid");
		}
		return hospitalDetailsByHpCode;


	}


}
