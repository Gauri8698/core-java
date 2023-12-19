package CovariantDemo;

public class Color {

	protected Color getColor()
	{
		Color obj = new Color();
		return obj;
		
	}

}


// child class
class Red extends  Color
{
	public Red getColor()
	{
		Red obj1 = new Red();
		return obj1;
	}
}
 

//child class
class Yellow extends  Color
{
	public Yellow getColor()
	{
	Yellow obj2 = new Yellow();
		return obj2;
	}
}



//child class
class Blue extends Color
{
	public Blue getColor()
	{
		Blue obj3 = new Blue();
		return obj3;
	}
}



	
