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
    @Table (name ="Route")
    public class route {
        @id
        @GenerateValue(strategy = GenerationType.IDENTITY)
        private Long routeId;
        private String routeName;
        private String isValid;
}
