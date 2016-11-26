-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Servidor: mysql05-farm53.uni5.net
-- Tempo de Geração: Nov 18, 2016 as 09:36 AM
-- Versão do Servidor: 5.5.43
-- Versão do PHP: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


--
-- Banco de Dados: `elevedhl`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `ESTADO`
--

-- CREATE TABLE IF NOT EXISTS `ESTADO` (
--   `id` int(11) NOT NULL AUTO_INCREMENT,
--   `nome` varchar(75) DEFAULT NULL,
--   `uf` varchar(5) DEFAULT NULL,
--   `pais` int(7) DEFAULT NULL,
--   PRIMARY KEY (`id`),
--   KEY `fk_ESTADO_pais` (`pais`)
-- ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

--
-- Extraindo dados da tabela `ESTADO`
--

INSERT INTO `ESTADO` (`id`, `nome`, `uf`, `pais`) VALUES
(1, 'Acre', 'AC', 1),
(2, 'Alagoas', 'AL', 1),
(3, 'Amazonas', 'AM', 1),
(4, 'Amapá', 'AP', 1),
(5, 'Bahia', 'BA', 1),
(6, 'Ceará', 'CE', 1),
(7, 'Distrito Federal', 'DF', 1),
(8, 'Espírito Santo', 'ES', 1),
(9, 'Goiás', 'GO', 1),
(10, 'Maranhão', 'MA', 1),
(11, 'Minas Gerais', 'MG', 1),
(12, 'Mato Grosso do Sul', 'MS', 1),
(13, 'Mato Grosso', 'MT', 1),
(14, 'Pará', 'PA', 1),
(15, 'Paraíba', 'PB', 1),
(16, 'Pernambuco', 'PE', 1),
(17, 'Piauí', 'PI', 1),
(18, 'Paraná', 'PR', 1),
(19, 'Rio de Janeiro', 'RJ', 1),
(20, 'Rio Grande do Norte', 'RN', 1),
(21, 'Rondônia', 'RO', 1),
(22, 'Roraima', 'RR', 1),
(23, 'Rio Grande do Sul', 'RS', 1),
(24, 'Santa Catarina', 'SC', 1),
(25, 'Sergipe', 'SE', 1),
(26, 'São Paulo', 'SP', 1),
(27, 'Tocantins', 'TO', 1);
