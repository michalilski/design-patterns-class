package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class ConcreteReportGenerator implements ReportGenerator {
	
	@Override
	public Report generateReport(ReportData data, String type) {
	Report generatedReport = null;

	if (type.equals("JSON")) {
		generatedReport = new JSONReport();
	} else if (type.equals("XML")) {
		generatedReport = new XMLReport();
	} else if (type.equals("HTML")) {
		generatedReport = new HTMLReport();
	} else if (type.equals("PDF")) {
		generatedReport = new PDFReport();
	}
	if (generatedReport != null) {
		generatedReport.generateReport(data);
	}

	return generatedReport;
	}
}
