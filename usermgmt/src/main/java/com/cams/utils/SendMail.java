//package com.cams.utils;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.StringWriter;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Properties;
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.activation.FileDataSource;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.Message.RecipientType;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import javax.mail.util.ByteArrayDataSource;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.poi.util.IOUtils;
//import org.apache.velocity.Template;
//import org.apache.velocity.VelocityContext;
//import org.apache.velocity.app.Velocity;
//public class SendMail {
//	public static void main(String[] args) throws Exception {
//        
//		String from="dpatidar@pcbapps.com";
//		String to ="dpatidar@pcbapps.com";
//		String subject="Notification";
//		String content="Sucessfull";
//		//mail(from,to,subject,content);
//		Properties p = new Properties();
//		p.setProperty("resource.loader", "class");
//		p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
//		Velocity.init( p ); 
//		  /*  Get the Template  */
//        Template t = Velocity.getTemplate("velocity/template/RequestQuote.vm" );
//        /*  create a context and add data */
//        VelocityContext context = new VelocityContext();
//        StringWriter writer = new StringWriter();
//        t.merge( context, writer );
//		//new SendMail().localmail("durgesh.java@gmail.com","durgesh.java@gmail.com",subject,writer.toString(),"","");
//		//new SendMail().mail("Glesby Marks<noreply@glesby.com>","durgesh.java@gmail.com","Add Vendor Form Attachment",writer.toString(),"vendor contract.docx","vendor-contract.docx");
//    }
//	
//	public  void mail(String from, List to, String subject, String content,String filePath,String fileName,String contentType)throws MessagingException, IOException{
//		
////		Properties p = new Properties();
////		p.setProperty("resource.loader", "class");
////		p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
////		Velocity.init( p ); 
////		  /*  Get the Template  */
////        Template t = Velocity.getTemplate("velocity/template/UpdateDriverInfo.vm" );
////        /*  create a context and add data */
////        VelocityContext context = new VelocityContext();
////      
////        //Setting Vehicle Info
////        context.put("vinNum", "Durgesh");
////        context.put("year", "111111");
////        context.put("make", "111111");
////        context.put("model", "111111");
////        
////        //Setting Driver updated info
////        context.put("driverName", "Durgesh");
////        context.put("unitId", "111111");
////        context.put("address", "111111");
////        context.put("city", "111111");
////        context.put("state", "111111");
////        context.put("zipcode", "Durgesh");
////        context.put("country", "111111");
////        context.put("comments", "111111");
////        context.put("emailAddress", "Durgesh");
////        /* now render the template into a StringWriter */
////        StringWriter writer = new StringWriter();
////        t.merge( context, writer );
////        /* show the World */
////       System.out.println(writer.toString()); 
//		if(to==null) {
//			return;
//		}else {
//			if(to!=null&&to.size()<1)
//			return;
//		}
//	  String env=PropertyFilesUtil.getProperty("cecs.env");
//	  String emailfrom=PropertyFilesUtil.getProperty("cecs.emailfrom");
//	  List toListTemp= new ArrayList();
//	  if("local".equalsIgnoreCase(env)) {
//		  
//		  toListTemp.add("durgesh.java@gmail.com");
//		  localmail(from,toListTemp,subject,content,filePath,fileName,contentType);
//	  }
//	  else if("dev".equalsIgnoreCase(env)) {
//		  
//		  toListTemp.add("dpatidar@pcbapps.com");
//		 // toListTemp.add("rearlu@pcbapps.com");
//		  devmail(emailfrom,toListTemp,subject,content,filePath,fileName,contentType);
//	  }
//	  else if("prod".equalsIgnoreCase(env)) {
//		  devmail(emailfrom,to,subject,content,filePath,fileName,contentType);
//	  }
// 
//		
//	}
//	
//	public  void localmail(String from, List to, String subject, String content,String filePath,String fileName,String contentType)throws MessagingException, IOException{
//		
//		  //Get properties object    
//        Properties props = new Properties();    
//        props.put("mail.smtp.host", "smtp.gmail.com");    
//        props.put("mail.smtp.socketFactory.port", "465");    
//        props.put("mail.smtp.socketFactory.class",    
//                  "javax.net.ssl.SSLSocketFactory");    
//        props.put("mail.smtp.auth", "true");    
//        props.put("mail.smtp.port", "465");    
//        //get Session   
//        Session session = Session.getDefaultInstance(props,    
//         new javax.mail.Authenticator() {    
//         protected PasswordAuthentication getPasswordAuthentication() {    
//         return new PasswordAuthentication("durgesh.java@gmail.com","durgesh@1984");  
//         }    
//        });    
//        //compose message    
//        try {    
//       
//        	System.out.println("localmail?????????????????????????");
//        	
//        	 // Create a default MimeMessage object.
//            Message message = new MimeMessage(session);
//            // Set From: header field of the header.
//            message.setFrom(new InternetAddress("durgesh.java@gmail.com"));
//            // Set To: header field of the header.
//            
//            InternetAddress[] mailAddress_TO=null;
//            
//            if(to!=null&&to.size()>0) {
//          	 mailAddress_TO = new InternetAddress [to.size()] ;
//        		for (int i = 0; i < to.size(); i++) {
//        			 mailAddress_TO[i] = new InternetAddress((String) to.get(i));
//       		}
//            }
//            
//            
//            message.addRecipients(Message.RecipientType.TO, mailAddress_TO);
//            
//            // Set Subject: header field
//            message.setSubject(subject);
//            // This mail has 2 part, the BODY and the embedded image
//            MimeMultipart multipart = new MimeMultipart("related");
//            // first part (the html)
//            BodyPart messageBodyPart = new MimeBodyPart();
//            //String htmlText = "<H1>Hello</H1><img src=\"cid:image\">";
//            messageBodyPart.setContent(content, "text/html");
//            // add it
//            multipart.addBodyPart(messageBodyPart);
//            // second part (the image)
//            messageBodyPart = new MimeBodyPart();
//          
//            InputStream imageStream = this.getClass().getClassLoader().getResourceAsStream("glesby-marks-logo.png");
//            //InputStream imageStream = SendMail.class.getClass().getResourceAsStream("/glesby-marks-logo.png");
//            System.out.println("imageStream"+imageStream);
//            DataSource fds = new ByteArrayDataSource(IOUtils.toByteArray(imageStream), "image/png");
//            messageBodyPart.setDataHandler(new DataHandler(fds));
//            messageBodyPart.setHeader("Content-ID", "<image>");
//            // add image to the multipart
//            multipart.addBodyPart(messageBodyPart);
//            BodyPart messageBodyPart1 = new MimeBodyPart();
//            if(StringUtils.isNotBlank(filePath)&&StringUtils.isNotBlank(fileName)) {
//            // Part two is attachment
//            	//InputStream   imageStream1 = this.getClass().getClassLoader().getResourceAsStream(filePath);
//            	Path file=Paths.get(filePath);
//            	InputStream imageStream1=Files.newInputStream(file);
//                //InputStream imageStream = SendMail.class.getClass().getResourceAsStream("/glesby-marks-logo.png");
//                System.out.println("imageStream"+imageStream1);
//                DataSource fds1 = new ByteArrayDataSource(IOUtils.toByteArray(imageStream1), "image/png");
//           // DataSource source = new FileDataSource(filePath);
//                messageBodyPart1.setDataHandler(new DataHandler(fds1));
//                messageBodyPart1.setFileName(fileName);
//            multipart.addBodyPart(messageBodyPart1);
//            // Part two is attachment
//            }
//            // put everything together
//            message.setContent(multipart);
//            // Send message
//            Transport.send(message);
//            System.out.println("Sent message successfully....");
//        	
//        	
//         System.out.println("message sent successfully");    
//        } catch (MessagingException e) {
//        	e.printStackTrace();
//        	throw new RuntimeException(e);
//        	}    
//           
//  }  
//	
//	
//	
//   public void devmail(String from, List to, String subject, String content,String filePath,String fileName,String contentType)throws MessagingException, IOException{
//	   Properties props = new Properties();
//       props.put("mail.smtp.host", "ems-esa02.ems-1.net");
//       props.put("mail.smtp.port", "25");
//       props.put("mail.debug", "true");
//       Session session = Session.getDefaultInstance(props);
//       
//       try {    
//           
//       	
//       	
//      	 // Create a default MimeMessage object.
//          Message message = new MimeMessage(session);
//          // Set From: header field of the header.
//          message.setFrom(new InternetAddress(from));
//          // Set To: header field of the header.
//          InternetAddress[] mailAddress_TO=null;
//          
//          if(to!=null&&to.size()>0) {
//        	 mailAddress_TO = new InternetAddress [to.size()] ;
//      		for (int i = 0; i < to.size(); i++) {
//      			 mailAddress_TO[i] = new InternetAddress((String) to.get(i));
//     		}
//          }
//          
//          
//         
//         // mailAddress_TO[1] = new InternetAddress("durgesh.java@hotmail.com");
//        
//          // message.setRecipients(Message.RecipientType.TO,
//         //    InternetAddress.parse(to));
//          message.addRecipients(Message.RecipientType.TO, mailAddress_TO); 	
//          // Set Subject: header field
//          message.setSubject(subject);
//          // This mail has 2 part, the BODY and the embedded image
//          MimeMultipart multipart = new MimeMultipart("related");
//          // first part (the html)
//          BodyPart messageBodyPart = new MimeBodyPart();
//          //String htmlText = "<H1>Hello</H1><img src=\"cid:image\">";
//          messageBodyPart.setContent(content, "text/html");
//          // add it
//          multipart.addBodyPart(messageBodyPart);
//          // second part (the image)
//          messageBodyPart = new MimeBodyPart();
//        
//          InputStream imageStream = this.getClass().getClassLoader().getResourceAsStream("glesby-marks-logo.png");
//          //InputStream imageStream = SendMail.class.getClass().getResourceAsStream("/glesby-marks-logo.png");
//          System.out.println("imageStream"+imageStream);
//          DataSource fds = new ByteArrayDataSource(IOUtils.toByteArray(imageStream), "image/png");
//          messageBodyPart.setDataHandler(new DataHandler(fds));
//          messageBodyPart.setHeader("Content-ID", "<image>");
//          // add image to the multipart
//          multipart.addBodyPart(messageBodyPart);
//         
//          if(StringUtils.isNotBlank(filePath)&&StringUtils.isNotBlank(fileName)) {
//          // Part two is attachment
//        	  BodyPart messageBodyPart1 = new MimeBodyPart();
//        	 // InputStream  imageStream1 = this.getClass().getClassLoader().getResourceAsStream(filePath);
//	          	Path file=Paths.get(filePath);
//	          	InputStream imageStream1=Files.newInputStream(file);
//              //InputStream imageStream = SendMail.class.getClass().getResourceAsStream("/glesby-marks-logo.png");
//              System.out.println("imageStream"+imageStream1);
//              DataSource fds1 = new ByteArrayDataSource(IOUtils.toByteArray(imageStream1), contentType);
//         // DataSource source = new FileDataSource(filePath);
//              messageBodyPart1.setDataHandler(new DataHandler(fds1));
//              messageBodyPart1.setFileName(fileName);
//          multipart.addBodyPart(messageBodyPart1);
//          // Part two is attachment
//          }
//          // put everything together
//          message.setContent(multipart);
//          // Send message
//          Transport.send(message);
//          System.out.println("Sent message successfully....");
//      	
//      	
//       System.out.println("message sent successfully");    
//      } catch (MessagingException e) {throw new RuntimeException(e);}
//		
//	}
//	
//}