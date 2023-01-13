-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Jan 2023 pada 15.08
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_rental_mobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_pengembalian`
--

CREATE TABLE `tabel_pengembalian` (
  `id_pengembalian` int(10) NOT NULL,
  `id_penyewa` int(16) NOT NULL,
  `id_transaksi` int(10) NOT NULL,
  `konfirmasi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabel_pengembalian`
--

INSERT INTO `tabel_pengembalian` (`id_pengembalian`, `id_penyewa`, `id_transaksi`, `konfirmasi`) VALUES
(1, 1, 1, 'TIDAK KONFIRMASI');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_penyewa`
--

CREATE TABLE `tabel_penyewa` (
  `id_penyewa` varchar(10) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `nama` varchar(26) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabel_penyewa`
--

INSERT INTO `tabel_penyewa` (`id_penyewa`, `nik`, `nama`, `alamat`) VALUES
('1', '2121212', '1212', '1212'),
('2', '22222', 'fauzan', 'tettt');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_transaksi`
--

CREATE TABLE `tabel_transaksi` (
  `id_transaksi` varchar(10) NOT NULL,
  `mobil` varchar(30) NOT NULL,
  `harga_sewa` int(30) NOT NULL,
  `lama_sewa` int(10) NOT NULL,
  `total_harga` int(20) NOT NULL,
  `harga_dp` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabel_transaksi`
--

INSERT INTO `tabel_transaksi` (`id_transaksi`, `mobil`, `harga_sewa`, `lama_sewa`, `total_harga`, `harga_dp`) VALUES
('1', 'Avanza', 400000, 2, 800000, 400000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tabel_pengembalian`
--
ALTER TABLE `tabel_pengembalian`
  ADD PRIMARY KEY (`id_pengembalian`);

--
-- Indeks untuk tabel `tabel_penyewa`
--
ALTER TABLE `tabel_penyewa`
  ADD PRIMARY KEY (`id_penyewa`);

--
-- Indeks untuk tabel `tabel_transaksi`
--
ALTER TABLE `tabel_transaksi`
  ADD PRIMARY KEY (`id_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
