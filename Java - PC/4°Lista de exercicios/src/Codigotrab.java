import javax.swing.JOptionPane;

class Codigotrab
{
	public static void main (String Dezoito[])
	{
	double  horas,calc,calc1,calcT;
	int codigo;
	do{
	codigo=Integer.parseInt(JOptionPane.showInputDialog("Qual seu codigo? "));
	horas=Double.parseDouble(JOptionPane.showInputDialog("Quantos horas trabalhadas? "));
		if(horas<=0 || codigo<0 )
		{
		JOptionPane.showMessageDialog(null,"Codigo errado e horas errada ou horas não pode ser 0");
		}
	} while (horas<=0 || codigo<0 );
		calc=horas*10.00;
		if (horas>50)
		{
		
		calc1=((horas-50)*20.00);
		calcT=calc+calc1;
		JOptionPane.showMessageDialog(null,"o Trabalhador "+codigo+" vai receber: \nTotal sem excedente "+calc+"\nSalario excente "+calc1+"\nTOTAL: "+calcT);
		}
		else
		{
		calc1=0;
		calcT=calc;
		JOptionPane.showMessageDialog(null,"o Trabalhador "+codigo+" vai receber: \nTotal sem excedente: "+calc+"\nSalario excente: "+calc1+"\nTOTAL: "+calcT);
		}
	}
	
}