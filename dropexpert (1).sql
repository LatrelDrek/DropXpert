-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26/11/2023 às 23:34
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dropexpert`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `categoria`
--

CREATE TABLE `categoria` (
  `idcategoria` int(11) NOT NULL,
  `nomeproduto` varchar(26) NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `tipo` varchar(16) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `idempresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `categoria`
--

INSERT INTO `categoria` (`idcategoria`, `nomeproduto`, `descricao`, `tipo`, `quantidade`, `idempresa`) VALUES
(1, '1', '1', '', 145, 0),
(2, '1221', '1', '1', 0, 0),
(3, '1', '12', '12', 145, 0),
(4, '1', '1', '1', 145, 0),
(5, '1', '1', '1', 145, 0),
(6, 'boi', 'fosda', 'Bovino', 100, 0),
(8, 'po', 'po', 'po', 0, 0),
(11, 'TUts', 'foda', 'solido', 0, 18),
(12, 'Batsat', '123', '123', 56476, 19),
(13, 'Tutu', '123', '123', 9976, 19),
(15, '1237', '123', '123', 0, 19),
(16, '546465', '544', '454', 12, 19),
(18, '1235', '123', '123', 1223, 19),
(21, '123564656874', '123', '123', 0, 19),
(22, '98978997979', '7887977', '7797', 0, 19),
(25, '123ooiiiu', '123', '123', 0, 19),
(26, '123ooiiiu', '8796786798', '1239678786', 0, 19),
(27, '89798', '78987', '789789', 0, 19),
(29, '123o', '123', '123', 0, 19),
(32, '12213323', '3442343', '423423', 0, 20);

-- --------------------------------------------------------

--
-- Estrutura para tabela `comprador`
--

CREATE TABLE `comprador` (
  `idcomprador` int(11) NOT NULL,
  `nomecomprador` varchar(26) NOT NULL,
  `descricaocomprador` varchar(50) NOT NULL,
  `idempresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `comprador`
--

INSERT INTO `comprador` (`idcomprador`, `nomecomprador`, `descricaocomprador`, `idempresa`) VALUES
(1, 'Rick', 'Baderninha', 0),
(2, 'bobdi', '1', 0),
(3, '13', '13', 0),
(4, '123', '123', 18),
(5, 'Yuyu', '123', 19),
(7, 'Yuyu2', '1221', 19),
(8, 'supermercado vivela', 'comercio', 20);

-- --------------------------------------------------------

--
-- Estrutura para tabela `empresa`
--

CREATE TABLE `empresa` (
  `idempresa` int(11) NOT NULL,
  `senhaempresa` varchar(16) NOT NULL,
  `nomeempresa` varchar(26) NOT NULL,
  `cnpj` varchar(18) NOT NULL,
  `email` varchar(46) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `empresa`
--

INSERT INTO `empresa` (`idempresa`, `senhaempresa`, `nomeempresa`, `cnpj`, `email`) VALUES
(18, '123', '123', '123', '123'),
(19, '123', 'ToeiYu', '5676543', 'TOie'),
(20, '12345', 'marcelo ltda', '31011973', '12345');

-- --------------------------------------------------------

--
-- Estrutura para tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `nomefornecedor` varchar(26) NOT NULL,
  `data` varchar(10) NOT NULL,
  `telefone` varchar(16) NOT NULL,
  `idfornecedor` int(11) NOT NULL,
  `cnpj` varchar(16) NOT NULL,
  `celular` varchar(16) NOT NULL,
  `inscricao` varchar(26) NOT NULL,
  `cep` varchar(16) NOT NULL,
  `email` varchar(46) NOT NULL,
  `endereco` varchar(46) NOT NULL,
  `idempresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `fornecedor`
--

INSERT INTO `fornecedor` (`nomefornecedor`, `data`, `telefone`, `idfornecedor`, `cnpj`, `celular`, `inscricao`, `cep`, `email`, `endereco`, `idempresa`) VALUES
('1', '1', '1', 1, '1', '1', '1', '1', '1', '1', 0),
('1', '121023', '1', 2, '1', '1', '1', '1', '1', '1', 0),
('31232', '213213', '3123123', 3, '123123', '13123213213', '21312', '2112', '123', '31', 0),
('Babidi', '132', 'q21', 4, '13', '32', '21', '1', '1', '1', 0),
('bik1', '231023', '21212', 5, '212112', '22121', '21221', '21212', '21212', '1212212', 0),
('6546', '564', '56654', 6, '5465', '545654', '6545', '4546', '5445', '56', 0),
('JonhBrabo', '27087', '124324233', 7, '4345325', '131', '21313', '3131231', '1321331', '1232131', 0),
('123', '12', '12', 8, '21', '121', '122', '112', '1221', '1212', 18),
('Teco32', '12', '321324', 9, '324324234', '3243243', '4324234', '3243243242', '432432432', '4242423', 18),
('Nome', '123', '123', 11, '123', '123', '123', '123', '123', '123', 19),
('12398', '121221', '324', 12, '324324', '432432', '324432', '4324232', '342432324', '32423432', 19),
('jussara', '19/11/2023', '31462473', 13, '12345', '9919669', '12345', '12760000', '12345', 'flor de liz', 20),
('678678678', '8676978', '78678678', 14, '676786', '786767867', '7868767', '67867867', '67678678', '678678', 19),
('768786678678', '7867867', '8676786', 15, '6786786767', '7867867', '676767', '876876', '676767', '676', 19);

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `idproduto` int(11) NOT NULL,
  `nomeproduto` varchar(26) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `dataentrada` varchar(10) NOT NULL,
  `horaentrada` varchar(5) NOT NULL,
  `preco` double NOT NULL,
  `idempresa` int(11) NOT NULL,
  `fornecedor` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`idproduto`, `nomeproduto`, `quantidade`, `dataentrada`, `horaentrada`, `preco`, `idempresa`, `fornecedor`) VALUES
(1, '1', 1, '1', '1', 0, 0, '0'),
(2, '11', 1, '1', '1', 0, 0, '0'),
(3, '1', 1, '11', '1', 0, 0, '0'),
(4, '1', 1, '1', '1', 0, 0, '0'),
(5, '1', 1, '1', '1', 0, 0, '0'),
(6, '1', 1, '1', '1', 0, 0, '0'),
(7, '1', 23, '1', '1', 0, 0, '0'),
(8, '1', 56, '1', '1', 0, 0, '0'),
(9, 'boi', 100, '1', '1', 0, 0, '0'),
(10, '1', 100, '1', '1', 0, 0, '0'),
(11, '1233', 21, '1232', '12', 1000, 18, '0'),
(12, '123', 300, '08/22/2025', '12:00', 12500, 18, '0'),
(13, '123', 12, '12', '123', 12, 18, '0'),
(14, '1234', 21, '12', '12', 12, 18, '0'),
(15, '1233', 10000, '10', '10', 1, 18, '0'),
(16, '1234', 23, '221', '123', 21, 18, '0'),
(17, '1235', 423, '234', '324', 423, 19, 'Nome'),
(18, 'Batsat', 32, '32', '32', 32, 19, 'Nome'),
(19, '546465', 12, '12', '12', 21, 19, '0'),
(21, 'leite', 120, '17/11/2020', '11;00', 600, 20, 'jussara'),
(22, '1235', 1223, '2313', '21331', 2131, 19, 'Nome'),
(23, 'Batsat', 56465, '6456', '645', 456, 19, '678678678'),
(24, 'Tutu', 777, '87', '123', 787, 19, 'Nome');

-- --------------------------------------------------------

--
-- Estrutura para tabela `produtosaida`
--

CREATE TABLE `produtosaida` (
  `idproduto` int(11) NOT NULL,
  `datasaida` varchar(10) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `comprador` varchar(26) NOT NULL,
  `horasaida` varchar(5) NOT NULL,
  `preco` double NOT NULL,
  `nomeproduto` varchar(16) NOT NULL,
  `idempresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produtosaida`
--

INSERT INTO `produtosaida` (`idproduto`, `datasaida`, `quantidade`, `comprador`, `horasaida`, `preco`, `nomeproduto`, `idempresa`) VALUES
(1, '1', 1, 'bobdi', '1', 1, '1', 0),
(2, '1', 1, 'bobdi', '1', 1, '1', 0),
(3, '1', 10, 'bobdi', '1', 1, '1', 0),
(4, '11', 11, '123', '', 1, '1233', 18),
(5, '11', 111, '123', '', 1, '1233', 18),
(6, '12', 21, '123', '1', 1, '1233', 18),
(7, '12', 1, '123', '1', 1, '1234', 18),
(8, '1', 0, '123', '21', 21, '1233', 18),
(9, '02', 300, '123', '222', 222, '1233', 18),
(11, '878', 878, 'Yuyu2', '788', 878, '1235', 19),
(12, '18/11/23', 50, 'supermercado vivela', '11;00', 300, 'leite', 20);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `senha` varchar(26) NOT NULL,
  `nome` varchar(46) NOT NULL,
  `idempresa` int(11) NOT NULL,
  `nivel` int(11) NOT NULL,
  `logar` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`idusuario`, `senha`, `nome`, `idempresa`, `nivel`, `logar`) VALUES
(569806, '12', '1234', 18, 1234, '1234'),
(569807, '123', 'UsuarioPrimario', 19, 3, '123'),
(569808, '123', '1', 19, 2, '1'),
(569809, '123', '12343', 19, 3, '12343'),
(569810, '12345', 'UsuarioPrimario', 20, 3, 'marcelo'),
(569811, '123', '12345', 20, 1, '12345');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idcategoria`);

--
-- Índices de tabela `comprador`
--
ALTER TABLE `comprador`
  ADD PRIMARY KEY (`idcomprador`);

--
-- Índices de tabela `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`idempresa`);

--
-- Índices de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`idfornecedor`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idproduto`);

--
-- Índices de tabela `produtosaida`
--
ALTER TABLE `produtosaida`
  ADD PRIMARY KEY (`idproduto`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idcategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de tabela `comprador`
--
ALTER TABLE `comprador`
  MODIFY `idcomprador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idempresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `idfornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de tabela `produtosaida`
--
ALTER TABLE `produtosaida`
  MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=569812;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
