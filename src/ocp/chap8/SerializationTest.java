package ocp.chap8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Data d = new Data();
		d.f1 = "f1";
		d.f2 = 2;
		d.f3 = true;
		System.out.println("Old data:" + d);
		FileOutputStream fos = new FileOutputStream("test.ser");
		ObjectOutputStream ot = new ObjectOutputStream(fos);
		ot.writeObject(d);
		ot.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"test.ser"));
		Data des = (Data) in.readObject();
		System.out.println("New data:" + des);
	}
}

class Data implements java.io.Serializable {
	public static String f1;
	public static transient int f2;
	public transient boolean f3;
	public final static String f4 = "4";
	public String f5 = "5";
	public transient int f6 = 10;

	@Override
	public String toString() {
		return "Data [f1=" + f1 + ", f2=" + f2 + ", f3=" + f3 + ", f4=" + f4
				+ ", f5=" + f5 + ",f6=" + f6 + "]";
	}
}
