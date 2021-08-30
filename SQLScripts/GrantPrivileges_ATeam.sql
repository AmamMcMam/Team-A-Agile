#Must be run by mentor or someone who has permissions for `%\_A`
GRANT ALL PRIVILEGES ON `%\_A`.* TO `Stephen`@`%` WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON `%\_A`.* TO `kristina`@`%` WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON `%\_A`.* TO `Amir`@`%` WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON `%\_A`.* TO `Thomas`@`%` WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON `%\_A`.* TO `RuxandraS`@`%` WITH GRANT OPTION;

#Must be run by mentor
CREATE USER 'Ateam'@'%' IDENTIFIED BY 'tempAAAAA!';

GRANT SELECT ON `%\_A`.* TO `Ateam`@`%` WITH GRANT OPTION;