package com.example.frotasul;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.frotasul.entities.Abastecimento;
import com.example.frotasul.entities.Caminhao;
import com.example.frotasul.entities.Carreta;
import com.example.frotasul.entities.Motorista;
import com.example.frotasul.entities.Pneu;
import com.example.frotasul.entities.Viagem;
import com.example.frotasul.enums.CondicaoPneu;
import com.example.frotasul.enums.StatusViagem;
import com.example.frotasul.enums.TipoPneu;
import com.example.frotasul.repositories.AbastecimentoRepository;
import com.example.frotasul.repositories.CaminhaoRepository;
import com.example.frotasul.repositories.CarretaRepository;
import com.example.frotasul.repositories.MotoristaRepository;
import com.example.frotasul.repositories.PneuRepository;
import com.example.frotasul.repositories.ViagemRepository;

@SpringBootApplication
public class FrotasulApplication implements CommandLineRunner {
	
	@Autowired
	private MotoristaRepository motoristaRepository;
	
	@Autowired
	private PneuRepository pneuRepository;
	
	@Autowired
	private CarretaRepository carretaRepository;
	
	@Autowired
	private CaminhaoRepository caminhaoRepository;
	
	@Autowired
	private AbastecimentoRepository abastecimentoRepository;
	
	@Autowired
	private ViagemRepository viagemRepository;

	public static void main(String[] args) {
		SpringApplication.run(FrotasulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Motorista mot1 = new Motorista(null, "Arquimedes", "412.457.587-77");
		Motorista mot2 = new Motorista(null, "Kleber", "482.157.787-87");
		motoristaRepository.saveAll(Arrays.asList(mot1, mot2));
		
		Pneu pn1 = new Pneu(null, 523, "XXF 45X0 TRS 2020", TipoPneu.BORRACHUDO, CondicaoPneu.NOVO);
		Pneu pn2 = new Pneu(null, 524, "XXF 45X0 TRS 2020", TipoPneu.BORRACHUDO, CondicaoPneu.RESSOLADO);
		
		Pneu pn3 = new Pneu(null, 523, "XXF 45X0 TRS 2021", TipoPneu.LISO, CondicaoPneu.NOVO);
		Pneu pn4 = new Pneu(null, 524, "XXF 45X0 TRS 2020", TipoPneu.LISO, CondicaoPneu.NOVO);
	
		pneuRepository.saveAll(Arrays.asList(pn1, pn2, pn3, pn4));
		
		Carreta car1 = new Carreta(null, "EJV-7707", "RANDON");
		Carreta car2 = new Carreta(null, "EJV-7757", "RANDON");
		car1.getPneus().add(pn1);
		car2.getPneus().add(pn2);
		carretaRepository.saveAll(Arrays.asList(car1, car2));
		
		
		
		Caminhao camin1 = new Caminhao(null, "FCI-1J08", "IVECO", car1, mot1);
		Caminhao camin2 = new Caminhao(null, "GGE-3802", "MERCEDEZ", car2, mot2);
		camin1.getPneusCaminhao().add(pn3);
		camin2.getPneusCaminhao().add(pn4);
		caminhaoRepository.saveAll(Arrays.asList(camin1, camin2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Abastecimento abast1 = new Abastecimento(null, sdf.parse("17/07/2021"), "Rede Dom Pedro", 586801, 586990, 402.0, 1700.87);
		Abastecimento abast2 = new Abastecimento(null, sdf.parse("19/07/2021"), "Jaguariaiva", 586990, 587706, 202.0, 850.17);
		Abastecimento abast3 = new Abastecimento(null, sdf.parse("21/07/2021"), "Posto Alpino II", 587706, 588310, 452.0, 980.06);
		
		abastecimentoRepository.saveAll(Arrays.asList(abast1, abast2, abast3));
		
		Viagem via1 = new Viagem(null, sdf.parse("18/07/2021"), "Vargem Grande do Sul - SP",
				"Paraná - PR", 587451, camin1, 3000.0, StatusViagem.VIAJANDO);
		via1.setKmChegada(587861);
		
		via1.getAbastecimentos().add(abast1);
		via1.getAbastecimentos().add(abast2);
		
		viagemRepository.saveAll(Arrays.asList(via1));
		
		
	}

}
