package 	org.mycomp.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class TesterWS {
	public List<String> getProducts(String str){
		List<String> lst = new ArrayList<String>();
		lst.add("He");
		lst.add("is ");
		lst.add("Stupid");
		return lst;
	}
}