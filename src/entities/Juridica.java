package entities;

public class Juridica extends Pessoa
{
	private Integer numFuncionarios;
	
	public Juridica()
	{
		super();
	}
	
	public Juridica(String nome, Double ganhoAnual, Integer numFuncionarios)
	{
		super(nome, ganhoAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() 
	{
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) 
	{
		this.numFuncionarios = numFuncionarios;
	}
	
	
	
	@Override
	public Double impostoPago()
	{
		if(numFuncionarios > 10)
		{
			return super.getGanhoAnual() * 1.14;
		}
		else
		{
			return super.getGanhoAnual() * 1.16;
		}
	}
}
