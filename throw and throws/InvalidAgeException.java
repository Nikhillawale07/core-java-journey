class InvalidAgeException extends RuntimeException
{
	private String msg="Invalid age!!!";
	public InvalidAgeException(String msg){this.msg=msg;}
	public InvalidAgeException(){}
	public String toString()
	{
		return "InvalidAgeException"+msg;
	}
	
}
		 