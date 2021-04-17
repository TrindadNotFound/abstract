package entities;


public class Individual extends TaxPayer
{
	private Double healthExpenditures;
	
	public Individual()
	{
		super();
	}
	
	public Individual(String nome, Double ganhoAnual, Double healthExpenditures)
	{
		super(nome, ganhoAnual);
		this.healthExpenditures = healthExpenditures;
	}
	
	public void setHealthExpenditures(Double healthExpenditures)
	{
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures()
	{
		return healthExpenditures;
	}
	
	@Override
	public Double tax()
	{
		if(super.getAnualIncome() < 20000)
		{
			if(healthExpenditures > 0)
			{
				return ((super.getAnualIncome() * 1.15) - (healthExpenditures * 1.5));
			}
			else
			{
				return super.getAnualIncome() * 1.15;
			}
		}
		else
		{
			if(healthExpenditures > 0)
			{
				return ((super.getAnualIncome() * 1.25) - (healthExpenditures * 1.5));
			}
			else
			{
				return super.getAnualIncome() * 1.25;
			}
		}
	}
}
