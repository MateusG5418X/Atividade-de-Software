package facade;


import pc.fabricaacessorios.Acessorios;
import pc.fabrica.CPU;
import pc.fabrica.HD;
import pc.fabrica.Memoria;
import pc.fabrica.SO;
import pc.fabrica.Gabinete;

public class ComputerFacade {

	private Memoria memoria;
	private HD hd;
	private CPU cpu;
	private Acessorios acessorios;
	private SO so;
    private Gabinete gabinete;

	public ComputerFacade() {

		this.memoria = new Memoria();
		this.hd = new HD();
		this.cpu = new CPU();
		this.acessorios = new Acessorios();
		this.so = new SO();
        this.gabinete = new Gabinete();

	}

	public void montarPC() {
		System.out.println("Montando uma nova maquina\n");
		
		memoria.adicionarMemoria();
		hd.adicionarHD();
		cpu.adicionaProcessador();
        Gabinete.adicionarGabinete();
		acessorios.adicionarMouse();
		acessorios.adicionarTeclado();
		acessorios.adicionarMonitor();
		so.instalarSO();
		
		System.out.println("\nComputador fabricado");
	}

}