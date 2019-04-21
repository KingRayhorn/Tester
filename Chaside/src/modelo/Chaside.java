package modelo;

public class Chaside implements Questions
{
	private int yes, no;
	private String question;

	@Override
	public int yesAnswer() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return yes;
	}

	@Override
	public int noAnswer() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return no;
	}

	@Override
	public String question() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return question;
	}

	public int getYes() {
		return yes;
	}

	public void setYes(int yes) {
		this.yes = yes;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
}
