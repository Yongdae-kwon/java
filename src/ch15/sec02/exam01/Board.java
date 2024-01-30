package ch15.sec02.exam01;

public class Board {
	
	//필드
	private String subject;		// 제목
	private String content;		// 내용
	private String writer;		// 글쓴이
	
	//생성자
	public Board(String subject, String content, String writer) {
		//this.subject = subject;
		//this.content = content;
		//this.writer = writer;
		setSubject(subject);
		setContent(content);
		setWriter(writer);   // this 대신에 set 가능
	}

	public String getSubject() { return subject; }
	public void setSubject(String subject) {this.subject = subject;	}

	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}

	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;	}
}
