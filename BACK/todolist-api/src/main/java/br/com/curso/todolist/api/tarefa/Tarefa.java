package br.com.curso.todolist.api.tarefa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @Entity: Marca esta classe como uma entidade JPA (uma tabela no banco de dados).
 * @Table(name = "tb_tarefas"): Especifica o nome da tabela no banco.
 * @Data (Lombok): Gera automaticamente getters, setters, toString, equals e hashCode.
 */
@Data
@Entity
@Table(name = "tb_tarefas")
public class Tarefa {

    /**
     * @Id: Marca este campo como a chave primária da tabela.
     * @GeneratedValue: Configura a estratégia de geração da chave primária.
     * IDENTITY significa que o próprio banco de dados irá gerar e gerenciar o valor.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private boolean concluida;

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}