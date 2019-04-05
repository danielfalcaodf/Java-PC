import javax.swing.JOptionPane;
public class Pesoideal16 {

	
	public static void main(String[] args) 
	{
		String sexo;
		double calc, altura;
		do
		{
		sexo=JOptionPane.showInputDialog("Qual é seu sexo\n  F- femenina\n M- masculino\n (é so F/M)");
		if (sexo.equals("F"))
		{
			altura=Double.parseDouble(JOptionPane.showInputDialog( "Qual sua altura?"));
			calc=(62.1*altura)-44.7;
			JOptionPane.showMessageDialog(null,"Seu peso ideal é:"+calc);
			
		}
		else if (sexo.equals("M"))
		{
			altura=Double.parseDouble(JOptionPane.showInputDialog("Qual sual altura?"));
			calc=(72.7*altura)-58;
		JOptionPane.showMessageDialog(null,"Seu peso ideal é: "+calc);
			
				
			
		}

		}while((!sexo.equals("M")) || (!sexo.equals("F")));
	}

}
