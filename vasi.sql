

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;




CREATE TABLE IF NOT EXISTS `kartela` (
  `kwdikos` varchar(100) NOT NULL,
  `onoma` varchar(100) NOT NULL,
  `eponimo` varchar(100) NOT NULL,
  `hm_gen` varchar(10) NOT NULL,
  `om_aimatos` varchar(40) NOT NULL,
  `pathisi` varchar(200) NOT NULL,
  `allergies` text NOT NULL,
  `tilephono` varchar(12) NOT NULL,
  `hm_eggrafis` varchar(10) NOT NULL,
  `simioseis` longtext NOT NULL,
  PRIMARY KEY (`kwdikos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `kartela` (`kwdikos`, `onoma`, `eponimo`, `hm_gen`, `om_aimatos`, `pathisi`, `allergies`, `tilephono`, `hm_eggrafis`, `simioseis`) VALUES
('3234', 'anestis', 'karamichalis', '27-04-1994', 'A+', 'uperkoposi', 'mathimata', '66622211', '26-2-2017', ''),
('1232', 'maria', 'latsikaki', '03-3-1992', 'B+', 'gripi', 'giri', '6855864', '12-8-2017', ''),
('4123', 'dimitra', 'theoxari', '07-11-1994', 'B+', 'gripi ton xoirwn', 'kamia', '88994452', '13-9-2017', '');

-- --------------------------------------------------------




CREATE TABLE IF NOT EXISTS `users` (
  `id` mediumint(9) NOT NULL,
  `user` varchar(50) CHARACTER SET utf8 NOT NULL,
  `pass` varchar(50) CHARACTER SET utf8 NOT NULL,
  `dik` varchar(10) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user` (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




INSERT INTO `users` (`id`, `user`, `pass`, `dik`) VALUES
(1, 'gramateas', '1111', 'gram'),
(2, 'giatros', '1111', 'gia'),
(3, 'nosokomos', '1111', 'nos');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
