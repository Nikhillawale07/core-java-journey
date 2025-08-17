class RelianceMobile
{
	private Sim r= new VodaphonesSim();
	RelianceMobile()
	{
		StartMobile();
		r.StartSim();
	}
	private void StartMobile()
	{
		System.out.println("Welcome to relanceMobile");
	}
	
}