/*package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport 
{
		public static  void generateJvmReport(String jsonfile) 
		{
			File f = new File("C:\\Users\\Sowmiya\\eclipse-workspace\\CucumberPractise\\src\\test\\resources\\JVMReport");
			Configuration configuration=new Configuration(f, "CucumberPractise");
			configuration.addClassifications("Sprint", "15");
			configuration.addClassifications("Platform", "Windows");
			configuration.addClassifications("OS", "Win-10");
			configuration.addClassifications("Browser", "Chrome");
			
			List<String> list=new ArrayList<String>();
			list.add(jsonfile);
			
			ReportBuilder builder=new ReportBuilder(list, configuration);
			builder.generateReports();

		}
}
*/