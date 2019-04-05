import javax.swing.JOptionPane;
class TrabalhoHoras
{
	
	public static void main (String ar[])
	{
		double	sala,hora, trabalho;
		do
		{
			
		
		hora=Double.parseDouble(JOptionPane.showInputDialog("Quantas horas voce trabalhou no mes?"));
		if(hora<=0)
		{
			JOptionPane.showMessageDialog(null,"horas são invalida, não pode ser negativo ou zero  digita novamente"); 
		}
		}while(hora<=0);
		do{
		sala=Double.parseDouble(JOptionPane.showInputDialog("Qual e seu salario por hora?"));
		if (sala<=0)
		{
			JOptionPane.showMessageDialog(null,"salario são invalida, não pode ser negativo ou zero  digita novamente");
		}
		}while(sala<=0);
		
		
		if (hora>160)
		{
			trabalho=((hora-160)*((sala/2)+sala)+(sala*hora));
		
		JOptionPane.showMessageDialog(null,"O seu salario total e: "+trabalho);
		}
		else
		{
			trabalho=hora*sala;
			JOptionPane.showMessageDialog(null,"O seu salario total e: "+trabalho);
		}
		
	System.exit(0);	
	}
}