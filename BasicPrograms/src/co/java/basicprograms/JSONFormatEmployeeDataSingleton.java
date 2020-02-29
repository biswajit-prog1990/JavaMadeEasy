package co.java.basicprograms;
import java.util.*;
import org.json.*;

import co.java.basicprograms.CrunchifyJSON.Employees;

class CrunchifyJSON {
	private String _name;
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_address() {
		return _address;
	}
	public void set_address(String _address) {
		this._address = _address;
	}
	private String _address;
	List<Employees> empList;
	
	public List<Employees> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employees> empList) {
		this.empList = empList;
	}

	//Employees Class
	class Employees {
		private String _name;
		public String get_name() {
			return _name;
		}
		public void set_name(String _name) {
			this._name = _name;
		}
		public String get_address() {
			return _address;
		}
		public void set_address(String _address) {
			this._address = _address;
		}
		public String get_phonenumber() {
			return _phonenumber;
		}
		public void set_phonenumber(String _phonenumber) {
			this._phonenumber = _phonenumber;
		}
		private String _address;
		private String _phonenumber;
		public Employees(String _name, String _address, String _phonenumber) {
			this._name = _name;
			this._address = _address;
			this._phonenumber = _phonenumber;
		}
	}
}

class Singleton {
	private List<Employees> _empList = new ArrayList<Employees>();
	private static Singleton _SingletonInstance = null;
	private CrunchifyJSON _objectCrunchify = new CrunchifyJSON();
	
	public static Singleton getInstance() {
		if(_SingletonInstance == null)
			_SingletonInstance = new Singleton();
		return _SingletonInstance;
	}
	
	public void addEmployee(Employees _empObject) {
		synchronized (_empList) {
			_empList.add(_empObject);
		}
	}
	
	public List<Employees> getEmployees(){
		return _empList;
	}
	
	public void addCrunchifyJSON(CrunchifyJSON _objectCrunchify) {
		synchronized (_objectCrunchify) {
			this._objectCrunchify = _objectCrunchify;
		}
	}
	
	public String getCrunchifyJSON() {
		JSONObject _object = new JSONObject();
		_object.put("name", _objectCrunchify.get_name());
		_object.put("address", _objectCrunchify.get_address());
		
		JSONArray _employeeJSON = new JSONArray();
		for(Employees _empObject : _empList) {
			Map<String, String> _employeeMap = new HashMap <String,String>();
			_employeeMap.put("name", _empObject.get_name());
			_employeeMap.put("address", _empObject.get_address());
			_employeeMap.put("phone number", _empObject.get_phonenumber());
			_employeeJSON.put(_employeeMap);
		}
		_object.put("Employees", _employeeJSON);
		return _object.toString();
	}
}

public class JSONFormatEmployeeDataSingleton {
	static Singleton _singletonInstance = Singleton.getInstance();
	public static void main(String[]args) {
		ArrayList<String> _employeeNames = new ArrayList<>();
		_employeeNames.add("Biswajit Dutta");
		_employeeNames.add("Madhav Srivastava");
		_employeeNames.add("Apurva Rai");
		ArrayList<String> _employeeAddress = new ArrayList<>();
		_employeeAddress.add("A09 Chicago IL");
		_employeeAddress.add("A34 Indiana CL");
		_employeeAddress.add("R09 Bay Road CL NY");
		ArrayList<String> _employeeTelephone = new ArrayList<>();
		_employeeTelephone.add("01190887299");
		_employeeTelephone.add("09876399392");
		_employeeTelephone.add("05211456356");
		
		for(int index=0; index<_employeeNames.size(); index++) {
			_singletonInstance.addEmployee(new CrunchifyJSON().new Employees(_employeeNames.get(index),_employeeAddress.get(index), _employeeTelephone.get(index)));			
		}
		CrunchifyJSON _object = new CrunchifyJSON();
		_object.set_name("Biswajit-JSONCrunchify");
		_object.set_address("Kolkata IN");
		_singletonInstance.addCrunchifyJSON(_object);
		System.out.println(_singletonInstance.getCrunchifyJSON());
	}
}
