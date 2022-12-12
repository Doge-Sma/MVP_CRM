package com.crm.crm.load;

import org.springframework.stereotype.Service;

import com.crm.crm.entity.Procedimento;
import com.crm.crm.repository.ProcedimentoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoadProcedimentos {
    
    ProcedimentoRepository procedimentoRepository;

    public void carregarProcedimento(){
        Procedimento procedimento1 = new Procedimento();
        procedimento1.setDescricao("Para verificar o procedimento estético adequado ao paciente");
        procedimento1.setNome("Análise Facial");
        procedimento1.setTipo("Analise");
        procedimento1.setValor((long) 20);
        procedimentoRepository.save(procedimento1);

        Procedimento procedimento2 = new Procedimento();
        procedimento2.setDescricao("Marcação de linhas de expressão");
        procedimento2.setNome("Pré botox");
        procedimento2.setTipo("Analise");
        procedimento2.setValor((long) 30);
        procedimentoRepository.save(procedimento2);

        Procedimento procedimento3 = new Procedimento();
        procedimento3.setDescricao("Teste antialérgicos dos produtos");
        procedimento3.setNome("Pré limpeza de pele");
        procedimento3.setTipo("Analise");
        procedimento3.setValor((long) 10);
        procedimentoRepository.save(procedimento3);

        Procedimento procedimento4 = new Procedimento();
        procedimento4.setDescricao("Para realização do botox");
        procedimento4.setNome("Exame pré operatórios");
        procedimento4.setTipo("Exames");
        procedimento4.setValor((long) 50);
        procedimentoRepository.save(procedimento4);

        Procedimento procedimento5 = new Procedimento();
        procedimento5.setDescricao("Para deixar seu rosto mais bonito");
        procedimento5.setNome("Limpeza de pele");
        procedimento5.setTipo("Consulta");
        procedimento5.setValor((long) 150);
        procedimentoRepository.save(procedimento5);

        Procedimento procedimento6 = new Procedimento();
        procedimento6.setDescricao("Para combater liinhas de expressão e rugas, faça nosso botox com os melhores produtos e profissionais do mercado");
        procedimento6.setNome("Botox");
        procedimento6.setTipo("Cirurgia");
        procedimento6.setValor((long) 1000);
        procedimentoRepository.save(procedimento6);

        Procedimento procedimento7 = new Procedimento();
        procedimento7.setDescricao("Combate ao envelhecimento do rosto");
        procedimento7.setNome("Microagulhamento");
        procedimento7.setTipo("Consulta");
        procedimento7.setValor((long) 250);
        procedimentoRepository.save(procedimento7);

        Procedimento procedimento8 = new Procedimento();
        procedimento8.setDescricao("Mascara para hidratação do rosto");
        procedimento8.setNome("Skinbooster");
        procedimento8.setTipo("Consulta");
        procedimento8.setValor((long) 200);
        procedimentoRepository.save(procedimento8);

        Procedimento procedimento9 = new Procedimento();
        procedimento9.setDescricao("Procedimento para melhorar a harmonia do rosto");
        procedimento9.setNome("Harmonização facial");
        procedimento9.setTipo("Cirurgia");
        procedimento9.setValor((long) 5000);
        procedimentoRepository.save(procedimento9);
    }
    

}
