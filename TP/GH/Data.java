package trabalho;

public class Data {
    private int dia;
    private int mes;

    public Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    
    private int[] computeTime(String date){ // metodo para reduzir cada parcela da data a um inteiro
		int[] data = new int[3];
		int i=0;
		for(String str : date.split("/")) {
			data[i++]=Integer.parseInt(str);
			return data;
		}
		return data;

	}
    
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
}
