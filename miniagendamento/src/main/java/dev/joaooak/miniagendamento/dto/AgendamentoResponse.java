package dev.joaooak.miniagendamento.dto;


import dev.joaooak.miniagendamento.model.StatusAgendamento;

import java.time.LocalDateTime;

public record AgendamentoResponse(
        Long id,
        String titulo,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        StatusAgendamento status,
        String usuario,
        LocalDateTime criadoEm,
        LocalDateTime atualizadoEm
) {
}
