-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2017 at 10:25 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym_watch`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `BIRTH_DATE` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `COACH_ID` int(11) DEFAULT NULL,
  `GYM_ID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `name`, `phone`, `BIRTH_DATE`, `email`, `gender`, `COACH_ID`, `GYM_ID`) VALUES
(4, 'Ab', '7896', '1993-12-12 00:00:00', 'er@gmail.com', 'male', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `coach`
--

CREATE TABLE `coach` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `GYM_ID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coach`
--

INSERT INTO `coach` (`id`, `name`, `phone`, `info`, `GYM_ID`) VALUES
(3, 'AC', '23123', '', 1);

-- --------------------------------------------------------

--
-- Table structure for table `gym`
--

CREATE TABLE `gym` (
  `id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `MANAGER_ID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gym`
--

INSERT INTO `gym` (`id`, `address`, `name`, `MANAGER_ID`) VALUES
(1, 'Offenburg 77652', 'Offenburg', 2);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(9),
(9),
(9),
(9),
(9),
(9);

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `GYM_ID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`id`, `name`, `phone`, `info`, `GYM_ID`) VALUES
(2, 'CR', '3321', '', 1);

-- --------------------------------------------------------

--
-- Table structure for table `subscription`
--

CREATE TABLE `subscription` (
  `id` bigint(20) NOT NULL,
  `END_DATE` datetime DEFAULT NULL,
  `NUM_MONTHS` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `START_DATE` datetime DEFAULT NULL,
  `Client_ID` int(11) DEFAULT NULL,
  `GYM_ID` int(11) DEFAULT NULL,
  `SUB_TYPE_ID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subscription`
--

INSERT INTO `subscription` (`id`, `END_DATE`, `NUM_MONTHS`, `price`, `START_DATE`, `Client_ID`, `GYM_ID`, `SUB_TYPE_ID`) VALUES
(6, '2017-01-01 00:00:00', 1, 25, '2016-12-01 00:00:00', 4, 1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `subs_type`
--

CREATE TABLE `subs_type` (
  `id` int(11) NOT NULL,
  `details` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `PRICE_PER_MONTH` double DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subs_type`
--

INSERT INTO `subs_type` (`id`, `details`, `name`, `PRICE_PER_MONTH`) VALUES
(5, 'Primarycustomers', 'PrimaryPackages', 25);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `password`, `user`, `username`) VALUES
(0, '81dc9bdb52d04dc20036dbd8313ed055', 'MANAGER', 'user1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9p4s2tgakqqrwkxl0q8ywp07r` (`COACH_ID`),
  ADD KEY `FKglr4jy5g4bs30nigsht7jvjeo` (`GYM_ID`);

--
-- Indexes for table `coach`
--
ALTER TABLE `coach`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKk8e72clffkd9utxbn109bv4dw` (`GYM_ID`);

--
-- Indexes for table `gym`
--
ALTER TABLE `gym`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfysnitqtj6vygc17h59efh9k5` (`MANAGER_ID`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKeyukfyov13pf917nepy49qw6v` (`GYM_ID`);

--
-- Indexes for table `subscription`
--
ALTER TABLE `subscription`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2di9kyhv1tl8pexiwgx75wqnl` (`Client_ID`),
  ADD KEY `FKlwjxg0ra382ylqjgjv9271nc5` (`GYM_ID`),
  ADD KEY `FK8uo3qloqitlo6s6ofufjvgei3` (`SUB_TYPE_ID`);

--
-- Indexes for table `subs_type`
--
ALTER TABLE `subs_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
