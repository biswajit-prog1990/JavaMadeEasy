package co.java.basicprograms;

import java.io.*;
import java.util.*;
public class fileBasedParser {

	public static void readNextLines(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s = "";
		List<String> list1 = new ArrayList<String>();
		int startIdx = 0;
		int endIdx = 0;
		String text = br.readLine();
		list1 = Arrays.asList(text.split(","));
		startIdx = list1.indexOf("Sample ID");
		endIdx = list1.indexOf("BottleType");
		List<String> sampleID = new ArrayList<String>();
		//ArrayList<String> sId = new ArrayList<String>();
		System.out.println(startIdx + " " + endIdx);
		while((s=br.readLine())!= null) {
			sampleID = Arrays.asList(s.split(","));
			//sId.add(sampleID.get(0));
		}
		for(String sa: sampleID) {
			System.out.println(sa);
		}
		br.close();
	}
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\B!SWAJ!T\\Desktop\\Training Folder\\Training File 2.csv");
		readNextLines(file);
	}

}
