-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 23. Oktober 2013 jam 04:42
-- Versi Server: 5.5.8
-- Versi PHP: 5.3.5

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
-- Struktur dari tabel `tbkelas`
--

CREATE TABLE IF NOT EXISTS `tbkelas` (
  `kodekelas` varchar(10) NOT NULL,
  `jurusan` varchar(10) NOT NULL,
  `ketuakelas` varchar(20) NOT NULL,
  `walikelas` varchar(20) NOT NULL,
  `jumlahsiswa` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbkelas`
--

INSERT INTO `tbkelas` (`kodekelas`, `jurusan`, `ketuakelas`, `walikelas`, `jumlahsiswa`) VALUES
('k1', 'rpl', 'jono', 'jojon', '36');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbsiswa`
--

CREATE TABLE IF NOT EXISTS `tbsiswa` (
  `nis` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `IDtelp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbsiswa`
--

INSERT INTO `tbsiswa` (`nis`, `nama`, `alamat`, `IDtelp`) VALUES
('s01', 'herlin', 'tulungagung', '80009'),
('s02', 'herlin', 'mlg', '100001'),
('s04', 'jskd', 'jdhk', '43535'),
('s06', 'gfjk', 'fgdj', '894379');
