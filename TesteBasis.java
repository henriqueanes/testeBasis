public class TesteBasis{
	public static void main(String [] args){
		System.out.println(
        		new TesteBasis().balancearParentesis("((1+1)*2) + (10+2) + ()(((2-1)-1)*1)")
        	);
	}
	
	public boolean balancearParentesis(String frase){
    		int numCaracteres = frase.length() - 1;
    		int qtdParentAberto = 0;
    		int qtdParentFechado = 0;
    	
    		for(int i = 0; i <= numCaracteres; i++){
    			char caracterAtual = frase.charAt(i);
    		
    			if(verificarParentAberto(caracterAtual)){
    				qtdParentAberto++;
    			} else if(verificarParentFechado(caracterAtual)){
    				qtdParentFechado++;
    			}
    		}
    	
    		if(qtdParentAberto == qtdParentFechado){
    			return true;
    		}
    		return false;
    	}
    
    	public boolean verificarParentAberto(char caracter){
    		if(caracter == '('){
    			return true;
    		}
    		return false;
    	}
    
    	public boolean verificarParentFechado(char caracter){
    		if(caracter == ')'){
    			return true;
    		}
    		return false;
    	}
}