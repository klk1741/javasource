package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *직렬화(Serialization)
 *객체를데이터 스트림으로 만드는 것=> 객체에 저장된 데이터를 스트림에 쓰기위해 연속적인 데이터로 변환 
 * 
 * 역직렬화(Deserialization)
 * 스트림으로부터 데이터를 읽어서 객체를 만드는것
 * 
 */
public class SerializationEx1 {

	public static void main(String[] args) {
Person p1= new Person("김유신","엔지니어");	
	Person p2= new Person("이순신","선생님");	
	//ObjectOutputStream :스트림에 객체 출력
	
	try (FileInputStream fos= new FileInputStream("c:\\temp\\serial.dat");
		BufferedInputStream bos= new BufferedInputStream(fos);
				ObjectInputStream oos = new ObjectInputStream(bos)) {
	
		for (int i = 0; i < 2; i++) {
			Person p = (Person)  oos.readObject();
		}
	
				
	} catch (Exception e) {
e.printStackTrace();	
}
	}
	
	}

