-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2021 at 03:57 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_library`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_anggota`
--

CREATE TABLE `tbl_anggota` (
  `id_anggota` varchar(6) NOT NULL,
  `nim` varchar(15) NOT NULL,
  `nama_anggota` varchar(50) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `id_semester` int(3) NOT NULL,
  `kd_prodi` varchar(10) NOT NULL,
  `id_kelas` int(2) NOT NULL,
  `nope` varchar(13) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_anggota`
--

INSERT INTO `tbl_anggota` (`id_anggota`, `nim`, `nama_anggota`, `jk`, `id_semester`, `kd_prodi`, `id_kelas`, `nope`, `status`) VALUES
('A00001', '6706200018', 'Ade Yusuf Hidayat', 'PRIA', 3, 'RPLA', 4, '082258063520', 'AKTIF'),
('A00002', '6706204050', 'Ihsanudin Pradana Putra', 'PRIA', 3, 'RPLA', 4, '089673767265', 'AKTIF'),
('A00003', '6706204040', 'Siti Shafira', 'WANITA', 3, 'RPLA', 1, '081210056862', 'AKTIF');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_databuku`
--

CREATE TABLE `tbl_databuku` (
  `ISBN` int(30) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `pengarang` varchar(30) NOT NULL,
  `penerbit` varchar(30) NOT NULL,
  `tahun_terbit` int(5) NOT NULL,
  `jumlah_halaman` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_databuku`
--

INSERT INTO `tbl_databuku` (`ISBN`, `judul`, `pengarang`, `penerbit`, `tahun_terbit`, `jumlah_halaman`) VALUES
(97860234, 'Terbang', 'Siti Shafira', 'Best Media', 2020, 300),
(978602550, 'Hello Salma', 'Erisca Febriani', 'Coconut Book', 2018, 384),
(978602694, 'Dear Nathan', 'Erisca Febriani', 'Best Media', 2016, 520);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kelas`
--

CREATE TABLE `tbl_kelas` (
  `id_kelas` int(2) NOT NULL,
  `kelas` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_kelas`
--

INSERT INTO `tbl_kelas` (`id_kelas`, `kelas`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_peminjaman`
--

CREATE TABLE `tbl_peminjaman` (
  `id_peminjaman` varchar(100) NOT NULL,
  `nim` varchar(15) NOT NULL,
  `nama_anggota` varchar(50) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `prodi` varchar(50) NOT NULL,
  `nope` varchar(15) NOT NULL,
  `tgl_pinjam` varchar(30) NOT NULL,
  `tgl_kembali` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_peminjaman`
--

INSERT INTO `tbl_peminjaman` (`id_peminjaman`, `nim`, `nama_anggota`, `judul`, `prodi`, `nope`, `tgl_pinjam`, `tgl_kembali`) VALUES
('P00001', '6706204040', 'Siti Shafira', 'Dear Nathan', 'RPLA', '081210056862', '18 Januari 2021', '25 Januari 2022'),
('P00002', '6706200018', 'Ade Yusuf Hidayat', 'Hello Salma', 'MP', '081234568123', '10 Januari 2022', '17 Januari 2022');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_prodi`
--

CREATE TABLE `tbl_prodi` (
  `kd_prodi` varchar(10) NOT NULL,
  `prodi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_prodi`
--

INSERT INTO `tbl_prodi` (`kd_prodi`, `prodi`) VALUES
('MP', 'Manajemen Pemasaran'),
('PH', 'Perhotelan'),
('RPLA', 'Rekayasa Perangkat Lunak Aplikasi'),
('SI', 'Sistem Informasi'),
('SIA', 'Sistem Informasi Akuntansi'),
('TK', 'Teknologi Komputer'),
('TRM', 'Teknologi Rekayasa Multimedia'),
('TT', 'Teknologi Telekomunikasi');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_semester`
--

CREATE TABLE `tbl_semester` (
  `id_semester` int(3) NOT NULL,
  `semester` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_semester`
--

INSERT INTO `tbl_semester` (`id_semester`, `semester`) VALUES
(1, 'Satu'),
(2, 'Dua'),
(3, 'Tiga'),
(4, 'Empat'),
(5, 'Lima'),
(6, 'Enam');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(20) CHARACTER SET latin1 NOT NULL,
  `username` varchar(50) CHARACTER SET latin1 NOT NULL,
  `password` varchar(50) CHARACTER SET latin1 NOT NULL,
  `level` varchar(15) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id_user`, `nama`, `username`, `password`, `level`) VALUES
(1, 'Fira', 'Fira', 'Fira', 'Kepala'),
(2, 'Ihsan', 'Ihsan', 'Ihsan', 'pustakawan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_anggota`
--
ALTER TABLE `tbl_anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indexes for table `tbl_databuku`
--
ALTER TABLE `tbl_databuku`
  ADD PRIMARY KEY (`ISBN`);

--
-- Indexes for table `tbl_kelas`
--
ALTER TABLE `tbl_kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indexes for table `tbl_peminjaman`
--
ALTER TABLE `tbl_peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`);

--
-- Indexes for table `tbl_prodi`
--
ALTER TABLE `tbl_prodi`
  ADD PRIMARY KEY (`kd_prodi`);

--
-- Indexes for table `tbl_semester`
--
ALTER TABLE `tbl_semester`
  ADD PRIMARY KEY (`id_semester`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_databuku`
--
ALTER TABLE `tbl_databuku`
  MODIFY `ISBN` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=978979781;

--
-- AUTO_INCREMENT for table `tbl_kelas`
--
ALTER TABLE `tbl_kelas`
  MODIFY `id_kelas` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_semester`
--
ALTER TABLE `tbl_semester`
  MODIFY `id_semester` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
