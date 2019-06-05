package serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization
{
	
	
	
		public static void main(String[] args) {
	
			Emp e=new Emp(10,"Sonal");
			String filename="demo";
			try {
				FileOutputStream out=new FileOutputStream(filename);
				ObjectOutputStream objout=new ObjectOutputStream(out);
				
				objout.writeObject(e);
				objout.close();
				out.close();
				e.b=78;
				e.age=60;
				e.name="Rajat";
				e.c=34;
				System.out.println("Object has been serialised \n a: "+e.age+" b: "+e.b+" c: "+e.c+" name:"+e.name);
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			Emp e1=null;
			try {
				FileInputStream in=new FileInputStream(filename);
				ObjectInputStream objin = new ObjectInputStream(in);
				e1=(Emp) objin.readObject();
				
				objin.close();
				in.close();
				System.out.println("Object has been deserialised \n a: "+e1.age+" b: "+e1.b+" c: "+e1.c+" name:"+e1.name);
			} 
			catch (IOException e2) {
				e2.printStackTrace();
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}
			
}
}

class Emp implements Serializable{
	int age;
	static int b=5;
	transient int c=4;
	String name;
	Emp(){}
	Emp(int age, String name){
		this.age=age;
		this.name=name;
	}
}