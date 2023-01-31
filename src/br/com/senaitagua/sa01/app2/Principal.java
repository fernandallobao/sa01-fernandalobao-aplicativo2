package br.com.senaitagua.sa01.app2;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoAnoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resp = JOptionPane.showInputDialog("Digite o ano para o calculo: ");
		int anoUsuario = Integer.parseInt(resp);
		
		CalculoAnoBO abo = new CalculoAnoBO();
		
		JOptionPane.showMessageDialog(null,"A diferença entre o ano iformado e o primeiro lançamento é de: " + abo.difAnos(anoUsuario) + " anos!");

	}

}
