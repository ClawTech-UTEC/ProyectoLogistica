package com.log.app.entidades;

<<<<<<< HEAD
public class EstadoRecepcion {
=======
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estado_recepcion")
public class EstadoRecepcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadoRecepcion;
    
    @ManyToOne
    private Recepcion recepcion;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private TipoEstadoRecepcion tipoEstado;


    @Column(name = "fecha_estado")
    private Date fecha;
    @OneToOne
    private EstadoRecepcion estadoAnterior;

    
>>>>>>> 22f3221eb35d198dc4d47b338cc0a1282e0d0a02

}
