package com.softsec.cert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.softsec.cert.CertificateUtils;

public class CertificateUtilsTest {
	static Logger logger = LogManager.getLogger("CertificateUtilTest");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String pathname = "K:\\Desktop\\Total.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径  
//		File filename = new File(pathname); // 要读取以上路径的input。txt文件
//		List<String>list = new ArrayList<String>(); 
//		InputStreamReader reader;
//		try {
//			reader = new InputStreamReader(new FileInputStream(filename));
//			BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言  
//			String line = "";  
//			line = br.readLine();  
//			while (line != null&& !line.isEmpty() && !line.equals("")) {  
//				line = line.trim();
//				list.add(line);
//				line = br.readLine(); // 一次读入一行数据  
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 建立一个输入流对象reader  
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for (int i = 0; i < list.size(); i++) {
//			String fileNameString = "G:\\GooglePlayTop_2015.02\\1\\" + list.get(i);
//			Certificate[] clist = CertificateUtils.getCertificates(fileNameString);
//			if(clist != null && clist.length > 0) {
//				for(int j = 0; j < clist.length; j ++) {
////					System.out.println(clist[j]);
//					logger.info("---------------FILE[" + i + "]" + fileNameString +"-----------------------");
//					logger.info(clist[j]);
//					logger.info("---------------------------------------------------------");
//				}
//			}
//		}
		Certificate[] clist = CertificateUtils.getCertificates(args[0]);
		logger.info("111");
		if(clist != null && clist.length > 0) {
			for(int i = 0; i < clist.length; i ++) {
				System.out.println(clist[i]);	
			}
		}
	}

}
