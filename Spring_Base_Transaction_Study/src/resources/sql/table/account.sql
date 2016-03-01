DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  accountID int(11) NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  money double default null,
  PRIMARY KEY (`accountID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `account` VALUES (1, 'aaa',1000);
INSERT INTO `account` VALUES (2, 'bbb',1000);
INSERT INTO `account` VALUES (3, 'ccc',1000);