package Implementation;

public class SupermarketArray  implements supermarket{

	private final String[] itens;
	
	private int lastindex;
	
	public  SupermarketArray(final int size) {
		itens = new String[size];
		lastindex = -1;
	}
	
	
	
	@Override
	public void add(String item) {
		if(lastindex == itens.length-1) {
			System.err.println("Lista de supermercado esta cheia");
		}else {
			lastindex++;
			itens[lastindex] = item;
		}
	}
	

	@Override
	public void print() {
		System.out.print("==================");
		if(lastindex < 0) {
			System.out.println("Lista de supermercado está vazia")
		}
		for(int i = 0; i<= lastindex; i++) {
			System.out.print(i+"-"+ itens[i]);
		}
		System.out.print("==================");
	}

	@Override
	public void delete(int index) {
		if (index >= 0 && index<= lastindex) {
			shift(index);
			lastindex--;
		}else {
			System.err.println("Indice invalindo"+index);
		}
	}



	private void shift(int index) {
		for(int i= index;i <lastindex;i++) {
			itens[i] = itens[i+1];
		}
	}
}
