public class Player {
	private String name;
	private char symbol;

	Player(String name, char symbol){
		this.name = name;
		this.symbol = symbol;
	}

	public void setName(String name){
		if(!name.isEmpty()){
			this.name = name;
		}
	}

	public String getName(){
		return this.name;
	}

	public void setSymbol(char symbol){
		if(symbol != '\0'){
			this.symbol = symbol;
		}
	}
	
	public char getSymbol(){
		return this.symbol;
	}
	
}