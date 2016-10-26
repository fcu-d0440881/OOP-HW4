package fcu.iecs.oop.tiida;

public class NissanTiida {
	public int cnt;
	public NissanTiida(){
		cnt = 0;
	}
	public void tiida(){
		cnt++;
		for(int i = 1; i <= cnt*cnt; i++){
			System.out.print("*");
			if(i%cnt == 0) System.out.println("");
		}
	}
}
