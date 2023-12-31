package encapsula.controle;

public class Controle_remoto implements Controlador{

		
		private int volume;
	    private boolean ligado;
	    private boolean tocando;
	    
	    public Controle_remoto() {
	        this.volume = 50;
	        this.ligado = false;
	        this.tocando = false;
	}
	    
	    private int getVolume() {
	        return volume;
	    }

	 

	    private void setVolume(int volume) {
	        this.volume = volume;
	    }

	 

	    private boolean getLigado() {
	        return ligado;
	    }

	 

	    private void setLigado(boolean ligado) {
	        this.ligado = ligado;
	    }

	 

	    private boolean getTocando() {
	        return tocando;
	    }

	 

	    private void setTocando(boolean tocando) {
	        this.tocando = tocando;
	    }
	    
	    //Métodos Abstratos
	    
	    @Override
	    public void ligar() {
	        this.setLigado(true);
	        
	    }

	 

	    @Override
	    public void desligar() {
	        this.setLigado(false);
	        
	    }

	 

	    @Override
	    public void abrirMenu() {
	        System.out.println( "---MENU---" + this.getLigado());
	        System.out.println( "Está ligado?R: " + this.getLigado());
	        System.out.println("Está Tocando?R: " + this.getLigado());
	        System.out.print("Volume:" + this.getVolume());
	                    for(int i = 0 ; i <= this.getVolume(); i+=10) {
	                        System.out.print("|||||");
	                        
	                    }
	        System.out.println();
	        
	    }

	 

	    @Override
	    public void fecharMenu() {
	        // TODO Auto-generated method stub
	        System.out.println("Fechando Menu");
	        
	    }

	 

	    @Override
	    public void maisVolume() {
	        if(this.getLigado() ) {
	            this.setVolume(this.getVolume()+5);
	        }

	 

	        
	    }

	 

	    @Override
	    public void menosVolume() {
	        if(this.getLigado() ) {
	            this.setVolume(this.getVolume()-5);
	        }
	        
	    }

	 

	    @Override
	    public void ligarMudo() {
	        // TODO Auto-generated method stub
	        if(this.getLigado() && this.getVolume() > 0) {
	            this.setVolume(0);
	        }
	        
	    }

	 

	    @Override
	    public void desligarMudo() {
	        if(this.getLigado() && this.getVolume() == 0) {
	            this.setVolume(50);
	        }
	            
	        
	    }

	 

	    @Override
	    public void play() {
	        if (this.getLigado() && !(this.getTocando())){
	                 this.setTocando(true);
	        }
	        
	    }

	 

	    @Override
	    public void pause() {
	        if (this.getLigado() && (this.getTocando())){
	             this.setTocando(false);
	        }
	    }
}
