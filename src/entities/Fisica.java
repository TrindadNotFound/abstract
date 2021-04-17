package entities;


public class Fisica extends Pessoa
{
	private Double gastoSaude;
	
	public Fisica()
	{
		super();
	}
	
	public Fisica(String nome, Double ganhoAnual, Double gastoSaude)
	{
		super(nome, ganhoAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public void setGastosSaude(Double gastoSaude)
	{
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastosSaude()
	{
		return gastoSaude;
	}
	
	@Override
	public Double impostoPago()
	{
		if(super.getGanhoAnual() < 20000)
		{
			if(gastoSaude > 0)
			{
				return ((super.getGanhoAnual() * 1.15) - (gastoSaude * 1.5));
			}
			else
			{
				return super.getGanhoAnual() * 1.15;
			}
		}
		else
		{
			if(gastoSaude > 0)
			{
				return ((super.getGanhoAnual() * 1.25) - (gastoSaude * 1.5));
			}
			else
			{
				return super.getGanhoAnual() * 1.25;
			}
		}
	}
}
