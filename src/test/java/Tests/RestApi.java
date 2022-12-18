package Tests;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApi {

	public  void main1(String[] args) {
		// TODO Auto-generated method stub
		
		 RestAssured.baseURI ="https://demoqa.com/Account/v1"; 
		    RequestSpecification request = RestAssured.given(); 
//		    JSONObject requestParams = new JSONObject();
//		    requestParams.put("userName", "test_rest");
//		    requestParams.put("password", "Testrest@123"); 
		 Response response= request.get("/Users"); 
//		    ResponseBody body = response.getBody();
		    System.out.println(response.getStatusLine());
		   // System.out.println(body.asString());

	}

	public  void main2(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> ls=new ArrayList<String>();
	ls.add("muthu");
	ls.add("sachin");
	ls.add("raina");
	ls.add("abd");
	System.out.println(ls.get(3));
	for(String s:ls)
	{
		
	//	System.out.println(s);
		
	}
	
	}
	
	public  void main3(String[] args) {
		// TODO Auto-generated method stub
	HashSet<String> ls=new HashSet<String>();
	ls.add("muthu");
	ls.add("sachin");
	ls.add("raina");
	ls.add("abd");
	ls.add("zera");
	//System.out.println(ls.get(3));
	for(String s:ls)
	{		
		System.out.println(s);	
	}
	
	}
	public static void mai4(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String,String> ls=new HashMap<String,String>();
	ls.put("name","muthu");
	ls.put("id","123");
	ls.put("place","chennai");
	
//	for(Map.Entry m:ls.entrySet())
//	{		
//		System.out.println(m.getKey()+" "+m.getValue());	
//	}
	
	for(Object s:ls.keySet())
	{
		System.out.println(s +" issss "+ls.get(s));
	}
	}
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello ");  
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.append("Java");
		System.out.println(sb);
		
		String sb1=new String("welcome "); 
		StringBuilder s=new StringBuilder(sb1);
		System.out.println(s.reverse());
	sb1=new String(s);
		System.out.println(sb1);
		sb1.concat("Java");
		System.out.println(sb1);
		
	}
	}
	
	

