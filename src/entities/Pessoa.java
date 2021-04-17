package entities;

public abstract class Pessoa 
{
	private String nome;
	private Double ganhoAnual;
	
	public Pessoa()
	{
		
	}
	
	
	public Pessoa(String nome, Double ganhoAnual)
	{
		this.nome = nome;
		this.ganhoAnual = ganhoAnual;
	}
	
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setGanhoAnual(Double ganhoAnual)
	{
		this.ganhoAnual = ganhoAnual;
	}
	
	public Double getGanhoAnual()
	{
		return ganhoAnual;
	}
	
	
	public abstract Double impostoPago();
}
