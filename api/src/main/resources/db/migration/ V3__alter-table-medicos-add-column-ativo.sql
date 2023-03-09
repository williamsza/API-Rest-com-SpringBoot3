 Active: 1677949828857@@127.0.0.1@3306@medicalclinic_api

  alter table medicos add ativo tinyint;
  UPDATE medicos set ativo=1;