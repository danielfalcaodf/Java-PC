import javax.swing.JOptionPane;
class Imposto
{
	public static void main(String onze[])
	{
		
		double salar,desco;
		
		do{
			salar=Double.parseDouble(JOptionPane.showInputDialog("Qual e seu salario ?"));
		if (salar<=0)
		{
			JOptionPane.showMessageDialog(null, "Você digitou 0 ou negativo");
		}
		
		
		}while (salar<=0);
		if (salar<=1200.00)
		{
			JOptionPane.showMessageDialog(null,"Nao sera descontado o seu salario do Imposto Sindical");
		}
		else if (salar>1200.00 && salar<=2500.00)
		{
			desco=(salar-(salar*0.08));
			JOptionPane.showMessageDialog(null,"sera descontado 8% para Imposto Sindical \nseu salario atual com desconto e "+desco);
			
			
		}
		else
		{
			desco=(salar-(salar*0.12));
			JOptionPane.showMessageDialog(null,"sera descontado 12% para Imposto Sindical \nseu salario atual com desconto e "+desco);
		}
		
	}
}