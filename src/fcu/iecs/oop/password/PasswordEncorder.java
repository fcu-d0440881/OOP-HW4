package fcu.iecs.oop.password;

public class PasswordEncorder{
	public
		   char[] from = {'a','e','i','o','t','A','E','I','O','T'};
		   char[] to = {'4','3','1','0','7'};
	public String encode(String password){
		for(int i = 0; i < from.length; i++){
			password = password.replace(from[i], to[i%5]);
		}
		return password;
	}
}
