package ch20.mysql.sec09.exam02;

import java.sql.Blob;
import java.util.Date;
import lombok.Data;

@Data
// Constructor, Getter, Setter, hashCode(), equals(), toString() 자동 생성
// Board를 펼쳐서 있는지 확인해야한다
public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfilename;
	private Blob bfiledata;
}
