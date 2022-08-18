package com;

import java.io.IOException;
import java.util.regex.Pattern;

public class Signupvalidations {
	public boolean checkUsername(String user) throws IOException{

		if(Pattern.matches("[a-zA-Z]{5,12}",user)) {
			return true;
		}
		else {
			throw new IOException("username can only alphabets and length is 5-13");
		}

	}
    public boolean checkPassword(String pwd) throws IOException{

		if(Pattern.matches("[a-zA-Z0-9@#]{6,}",pwd)) {
			return true;
		}
		else {
			throw new IOException("Minimum length of the password is 6");
		}

	}

    public boolean checkPhone(String phone) throws IOException{
    	if(Pattern.matches("[+91]{3}[6789]{1}[0-9]{9}", phone))
    	{
    		return true;
    	}
    	else {
    		throw new IOException("not a valid phone number");
    	}
    }


}
