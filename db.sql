-- phpMyAdmin SQL Dump
-- version 3.1.3.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 23, 2013 at 10:02 AM
-- Server version: 5.1.33
-- PHP Version: 5.2.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbkaryawan`
--

CREATE TABLE IF NOT EXISTS `tbkaryawan` (
  `nik` varchar(20) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `jeniskelamin` varchar(10) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `IDtelp` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbkaryawan`
--


-- --------------------------------------------------------

--
-- Table structure for table `tbsiswa`
--

CREATE TABLE IF NOT EXISTS `tbsiswa` (
  `nis` varchar(20) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `IDtelp` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsiswa`
--

INSERT INTO `tbsiswa` (`nis`, `nama`, `alamat`, `IDtelp`) VALUES
('02', 'afuza sudibyo', 'malang', '0989');
