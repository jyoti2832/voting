import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
public class TextMail  
{  
 	public void sendMessage(String toaddress,String otp)  
 	{
 		Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        //get Session   
        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication("thbsdc283204@gmail.com","yapokkpfjiucoxur");  
         }    
        });    
        //compose message    
        try {    
         MimeMessage message = new MimeMessage(session);    
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(toaddress));    
         message.setSubject("Welcome to Voting Agra Here is OTP ");
         Random r=new Random();
 	     message.setText(otp);         
         //send message  
         Transport.send(message);    
         System.out.println("message sent successfully");    
        }
        catch (Exception e) {
			System.out.println(e);
		}
        }

 	/*public static void main(String[] args) {
		TestMail obj=new TestMail();
		obj.sendMessage();
	}
	*/
}