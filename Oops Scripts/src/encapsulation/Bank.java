package encapsulation;
class Account
{
	private String Name, Email;
	private float AccNo;
	private long Bal;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String Name1)
	{
		this.Name=Name1;
	}
	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String Email1)
	{
		this.Email=Email1;
	}
	public float getAccNo()
	{
		return AccNo;
	}
	public void setAccNo(float AccNo1)
	{
		this.AccNo=AccNo1;
	}
	public long getBal()
	{
		return Bal;
	}
	public void setBal(long Bal1)
	{
		this.Bal=Bal1;
	}
	
}


public class Bank
{

	public static void main(String[] args) 
	{
		Account a=new Account();
		System.out.println("*****CUSTOMER DETAILS*****");
		
		a.setName("sagar");
		a.setEmail("sagar@123");
		a.setAccNo(1231322222);
		a.setBal(100000);
		System.out.println("Customer Name: "+a.getName()+"\nCustomer Email: "+a.getEmail()+"\nAccNo: "+a.getAccNo()+"\nBal: "+a.getBal());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
