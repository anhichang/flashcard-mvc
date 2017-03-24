package ch.fhnw.webfr.flashcard.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.fhnw.webfr.flashcard.domain.Questionnaire;
import ch.fhnw.webfr.flashcard.persistence.QuestionnaireRepository;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@Autowired
	private QuestionnaireRepository questionnaireRepository;
// ist ein POJO
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody // responsebody nicht mehr verwenden -> nicht MVC konform
	public String findName(@RequestParam String name, HttpServletResponse response, HttpServletRequest request) throws IOException {
		String a = "You have " + questionnaireRepository.count() + " Questionnairies in your repo";
		return name + '\n' + a ;
		
//		Questionnaire questionnaire = questionnaireRepository.findOne(id);		
		//PrintWriter writer = response.getWriter();
		
//		writer.append("<html lang='en'><head><title>Hello World</title></head><body>");
//		writer.append("<h2>Hallo " + name  +"</h2>");
//		writer.append("<h2>You have  " + questionnaireRepository.count() + " Questionnairies in your repo"  +"</h2>");
//		
//		writer.append("<a href='" + request.getContextPath() + "/questionnaires'>Back</a>");
//		
//		writer.append("</body></html>");
	}
}
