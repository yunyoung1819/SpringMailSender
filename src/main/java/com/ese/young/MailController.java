package com.ese.young;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class MailController {
 
  @Autowired
  private JavaMailSender mailSender;
 
 
  // mailForm
  @RequestMapping(value = "/mail/mailForm")
  public String mailForm() {
	 
	System.out.println("mailForm");
    
	return "/mail/mailForm";
  }  
 
  // mailSending �ڵ�
  @RequestMapping(value = "/mail/mailSending")
  public String mailSending(HttpServletRequest request) {
	  	
	  System.out.println("mail Sending");
	  
	  String setfrom = "yunyoung1819@gmail.com";         
	  String tomail  = request.getParameter("tomail");     // �޴� ��� �̸���
	  String title   = request.getParameter("title");      // ����
	  String content = request.getParameter("content");    // ����
	  String charSet = "UTF-8";
	   
    try {
    	  MimeMessage message = mailSender.createMimeMessage();
          MimeMessageHelper messageHelper 
	                        = new MimeMessageHelper(message, true, "UTF-8");
	 
	      messageHelper.setFrom(setfrom);  // �����»�� �����ϰų� �ϸ� �����۵��� ����
	      messageHelper.setTo(tomail);     // �޴»�� �̸���
	      messageHelper.setSubject(title); // ���������� ������ �����ϴ�
	      messageHelper.setText(content);  // ���� ����
	     
	      mailSender.send(message);
    } catch(Exception e){
      System.out.println(e);
    }
   
    return "redirect:/mail/mailForm";
  }
} 