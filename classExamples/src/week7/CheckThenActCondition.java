package week7;

import java.util.Map;

public class CheckThenActCondition {

	public void checkThenActConditionOnMap(Map<String, String> customerMap) {
		if(customerMap.containsKey("Peter_C18762431")) {
			String value = customerMap.remove("Peter_C18762431");
			if(value == null) {
				System.out.println("Value for Peter_C18762431 was null! ");
			}else {
				customerMap.put("Peter_C18762431", "Dublin");
			}
		}
	}
	
	public static void main(String[] args) {
			

	}

}

//MAPPING
//Id -> Address
