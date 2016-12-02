
public class ComposeMail {
	private String to;
	private String cc;
	private String bcc;
	public String subject;
	public String content;
	
	public void attach(){
		Attachments att = new Attachments();
		att.image();
		att.emoji();
		att.files();
	}
}
