package com.smk.bi.ticketing.model;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * // TODO Comment
 */
// Nama Mohammad Reza
// NIS 16101071

    @Entity
    @Table (name  ="Rails")
    public class Rails {
        @id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long railsId;
        private String railsName;
        private Long capacity;
}
