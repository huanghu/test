package oozie.expand;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MySecondMail {
	protected Session session = null;
	//邮件用户名
	String mailUser = "huanghu";
	String host = "mail.360buy.com";
	String pwd = "*2wsx#edc";
	public MySecondMail()
	{
	init();
	}
	public void init()
	{
	Properties props = new Properties();
	props.put("mail.transpost.protocol", "smtp");
	props.put("mail.smtp.host", host);
	//必须要有一个类来认证
//	props.put("mail.smtp.auth", "true");
	props.put("mail.smpt.port", "25");
	Email_Autherticatorbean auth =  new Email_Autherticatorbean(mailUser,pwd);
	//session认证
	session = Session.getInstance(props,auth);
	//这个是跟踪后台消息。打印在控制台
	session.setDebug(true);
	}
	public static void main(String[] args)
	{
	new MySecondMail().sendMails();
	System.out.println("send mail success!");
	}
	@SuppressWarnings("static-access")
	public void sendMails()
	{
	try
	{
	Message msg = new MimeMessage(session);           
	msg.setFrom(new InternetAddress("huanghu@360buy.com"));         
	msg.setRecipients(Message.RecipientType.TO,
	InternetAddress.parse("huanghu@360buy.com"));
//	msg.setRecipients(Message.RecipientType.BCC,
//	InternetAddress.parse("huanghu@360buy.com"));
	msg.setSentDate(new Date());
	msg.setSubject("this is my Threee mail");
	msg.setContent("this is my mail","text/html");
	msg.setText("我成功了。哈哈");

	Transport transport = session.getTransport("smtp");
	//与发送者的邮箱相连
	transport.connect(host,mailUser,pwd);
	transport.send(msg);
	}
	catch (SendFailedException e)
	{
	e.printStackTrace();
	}
	catch (Exception ee)
	{
	ee.printStackTrace();
	}

	}
}
