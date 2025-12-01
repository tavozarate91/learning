//Interface Gustavo
public interface Calculator{
    String calculate(String expression);

    int sum (a, b);
}

//Implementation by Camilo
public Class Calculator{
    public int result;
    public int x;
    public int y;

    public Calculator(int var_x, int var_y){
	    this.x = var_x;
	    this.y = var_y;
    }

    public int sum(){
	    return this.result = this.x + this.y; 

    }

}

//Testing by Gustavo
