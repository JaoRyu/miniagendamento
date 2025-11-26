package dev.joaooak.miniagendamento.mapper;

import dev.joaooak.miniagendamento.dto.AgendamentoCreateRequest;
import dev.joaooak.miniagendamento.dto.AgendamentoResponse;
import dev.joaooak.miniagendamento.dto.AgendamentoUpdateRequest;
import dev.joaooak.miniagendamento.model.Agendamento;
import dev.joaooak.miniagendamento.model.StatusAgendamento;

import java.time.LocalDateTime;

public class AgendamentoMapper {

    public static Agendamento toEntity(AgendamentoCreateRequest req) {
        return Agendamento.builder()
                .titulo(req.titulo())
                .usuario(req.usuario())
                .descricao(req.descricao())
                .dataInicio(req.dataInicio())
                .dataFim(req.dataFim())
                .status(StatusAgendamento.AGENDADO)
                .criadoEm(LocalDateTime.now())
                .atualizadoEm(LocalDateTime.now())
                .build();
    }

    public static void merge(Agendamento entity, AgendamentoUpdateRequest req){
        if(req.titulo() !=null){
            entity.setTitulo(req.descricao());
        }
        if(req.descricao() !=null){
            entity.setDescricao(req.descricao());
        }
        if(req.dataInicio() !=null){
            entity.setDataInicio(req.dataInicio());
        }
        if(req.dataFim() !=null){
            entity.setDataFim(req.dataFim());
        }

    }

    public static AgendamentoResponse toResponse(Agendamento a) {
        return new AgendamentoResponse(
                a.getId(),
                a.getTitulo(),
                a.getDescricao(),
                a.getDataInicio(),
                a.getDataFim(),
                a.getStatus(),
                a.getUsuario(),
                a.getCriadoEm(),
                a.getAtualizadoEm()

        );
    }
}
