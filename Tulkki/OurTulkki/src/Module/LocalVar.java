package Module;

public class LocalVar {
	int type;
	public int inx;
	String name;
	
	public LocalVar(String _name, int _inx, int _type)
	{
		name = _name;
		inx = _inx;
		type = _type;
		//System.out.println(name + " "+ inx + " " + type + " " + this);
	} 
}
