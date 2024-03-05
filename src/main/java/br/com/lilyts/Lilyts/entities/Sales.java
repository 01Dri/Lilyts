package br.com.lilyts.Lilyts.entities;


import br.com.lilyts.Lilyts.enums.IsSales;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "vendedoras")
@Data
@AllArgsConstructor
public class Sales implements Serializable {

    public Sales() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_completo")
    @NotNull
    private String fullName;

    @NotNull
    private String cpf;

    @Column(name = "telefone_whatsapp")
    private String whatsappNumber;

    @Column(name = "data_nascimento")
    @NotNull
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "trabalha_com_venda_direta")
    @NotNull
    private IsSales isSales;

    @Lob
    @Column(name = "documento_pessoal")
    @NotNull
    private byte[] personalDocument;

    @Lob
    @Column(name = "comprovante_residencia")
    @NotNull
    private byte[] bithCertificate;


}
