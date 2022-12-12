package com.crm.crm.load;

import org.springframework.stereotype.Service;

import com.crm.crm.entity.Medico;
import com.crm.crm.repository.MedicoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoadMedico {
    MedicoRepository medicoRepository;

    public void carregarMedicos(){
        Medico medico1 = new Medico();
        medico1.setCargo("Demartologista");
        medico1.setCrm("123456");
        medico1.setNome("Raul Pacheco");
        medicoRepository.save(medico1);

        Medico medico2 = new Medico();
        medico2.setCargo("Demartologista");
        medico2.setCrm("123426");
        medico2.setNome("Henrique Silveira");
        medicoRepository.save(medico2);

        Medico medico3 = new Medico();
        medico3.setCargo("Esteticista");
        medico3.setCrm("123451");
        medico3.setNome("Alceu Marques");
        medicoRepository.save(medico3);

        Medico medico4 = new Medico();
        medico4.setCargo("Esteticista");
        medico4.setCrm("123457");
        medico4.setNome("Iago Madruga");
        medicoRepository.save(medico4);

        Medico medico5 = new Medico();
        medico5.setCargo("Esteticista");
        medico5.setCrm("123479");
        medico5.setNome("Alexandre Gimenes");
        medicoRepository.save(medico5);

        Medico medico6 = new Medico();
        medico6.setCargo("Dermatogista");
        medico6.setCrm("223456");
        medico6.setNome("Pablo Nogueira");
        medicoRepository.save(medico6);

        Medico medico7 = new Medico();
        medico7.setCargo("Esteticista");
        medico7.setCrm("523456");
        medico7.setNome("Valquíria Bernardes");
        medicoRepository.save(medico7); 
        
        Medico medico8 = new Medico();
        medico8.setCargo("Demartologista");
        medico8.setCrm("143456");
        medico8.setNome("Cristina Vargas");
        medicoRepository.save(medico8);

        Medico medico9 = new Medico();
        medico9.setCargo("Demartologista");
        medico9.setCrm("143452");
        medico9.setNome("Tatiana Antunes");
        medicoRepository.save(medico9);
  
    }
}
