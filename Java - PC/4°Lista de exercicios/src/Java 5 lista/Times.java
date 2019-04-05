import javax.swing.JOptionPane;
class Times
{
	public static void main (String arg[])
	{
	 String time1, time2;
	 byte gol1, gol2;
	 time1=JOptionPane.showInputDialog("Esqueva o nome do time que jogou hoje:");
	 time2=JOptionPane.showInputDialog("Digita o nome do time que jogou contra o "+time1);
	 do{
	 gol1=Byte.parseByte(JOptionPane.showInputDialog("Quantos Gols fez o "+time1+"?"));
	 if(gol1<0)
	 {
		 JOptionPane.showMessageDialog(null,"Gol invalido, nao pode ser negativo digite novamente");
	 }
	 }while(gol1<0);
		 do
		 {
	 gol2=Byte.parseByte(JOptionPane.showInputDialog("Quantos Gols fez o "+time2+"?"));
	 if(gol2<0)
	 {
		 JOptionPane.showMessageDialog(null,"Gols invalido, nao pode ser negativo digite novamente"); 
	 }
		 }while(gol2<0);
	 if (gol1>gol2)
	 {
	 JOptionPane.showMessageDialog(null,"VENCEDOR FOI "+time1);
	
	}
	else if (gol1==gol2 || gol2==gol1)
	{
		 JOptionPane.showMessageDialog(null,"DEU EMPATE");
	}
	else
	{
		JOptionPane.showMessageDialog(null,"VENCEDOR FOI "+time2);
	}
	System.exit(0);	
	}
}