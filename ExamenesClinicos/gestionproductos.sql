-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2020 a las 05:49:46
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestionproductos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `certificado`
--

CREATE TABLE `certificado` (
  `id` int(11) NOT NULL,
  `calidad` int(11) NOT NULL,
  `anomalias` text NOT NULL,
  `idensayo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `certificado`
--

INSERT INTO `certificado` (`id`, `calidad`, `anomalias`, `idensayo`) VALUES
(5345, 43, '343', 0),
(234567, 5, 'lolxD', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `controlcalidad`
--

CREATE TABLE `controlcalidad` (
  `id` int(11) NOT NULL,
  `fechavencimiento` text NOT NULL,
  `eficiencia` int(11) NOT NULL,
  `tipo` int(11) NOT NULL,
  `idlaboratorio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `controlcalidad`
--

INSERT INTO `controlcalidad` (`id`, `fechavencimiento`, `eficiencia`, `tipo`, `idlaboratorio`) VALUES
(323, '434', 9, 43, 2219321),
(53, '4234', 8, 434, 2219321),
(434, '43', 4, 4343, 2219321),
(5353, '32', 2, 32, 2219321),
(6565, '535', 8, 545, 2219321);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ensayo`
--

CREATE TABLE `ensayo` (
  `id` int(11) NOT NULL,
  `codigojefe` int(11) NOT NULL,
  `medidas` text NOT NULL,
  `tipoconcreto` text NOT NULL,
  `fecha` text NOT NULL,
  `idproducto` int(11) NOT NULL,
  `idcalidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ensayo`
--

INSERT INTO `ensayo` (`id`, `codigojefe`, `medidas`, `tipoconcreto`, `fecha`, `idproducto`, `idcalidad`) VALUES
(4353, 3553, '5353', '3553', '5353', 123, 5353),
(6546, 466, '656', '6565', '665', 23242, 6565);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `ciudad` text NOT NULL,
  `direccion` text NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`id`, `nombre`, `ciudad`, `direccion`, `telefono`) VALUES
(2219321, 'hawkins', 'cartagena', 'centro', 6747727);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `lote` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `lote`) VALUES
(1234, '544', ''),
(123, 'douglas', '23 al lado'),
(123, 'douglas', '23 al lado'),
(23242, '345678', 'duvan'),
(332, 'oscar', 'tumae'),
(323, '3232', '3232');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
