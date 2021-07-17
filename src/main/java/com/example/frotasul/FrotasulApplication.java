package com.example.frotasul;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.frotasul.entities.Motorista;
import com.example.frotasul.entities.Pneu;
import com.example.frotasul.enums.CondicaoPneu;
import com.example.frotasul.enums.TipoPneu;
import com.example.frotasul.repositories.MotoristaRepository;
import com.example.frotasul.repositories.PneuRepository;

@SpringBootApplication
public class FrotasulApplication implements CommandLineRunner {
	
	@Autowired
	private MotoristaRepository motoristaRepository;
	
	@Autowired
	private PneuRepository pneuRepository;

	public static void main(String[] args) {
		SpringApplication.run(FrotasulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Motorista mot1 = new Motorista(null, "Arquimedes", "412.457.587-77");
		motoristaRepository.saveAll(Arrays.asList(mot1));
		
		Pneu pn1 = new Pneu(null, 550, "XXC 45BYT 88 4021", TipoPneu.BORRACHUDO, CondicaoPneu.NOVO);
		
		pneuRepository.saveAll(Arrays.asList(pn1));
	}

}
