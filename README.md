# Docker

Ce projet démarre avec Docker, de la façon suivante : 

## Mise à jour du projet en développement

- Faire un maven clean package pour générer un jar de l'application
- Faire un "docker build . -t springbootapp" à la racine du projet pour générer l'image Docker
- Faire un "docker-compose up" pour lancer les containers Docker de l'application et la base postgres

Le fichier DockerFiler décrit la construction de l'image Docker à utiliser pour démarrer l'application dans un container.
Le fichier docker-compose.yml décrit les différents containers à démarrer pour lancer l'application spring et la base postgres dans des containers.

# Hexagonal Architecture

Ce projet est architecturé sous trois packages :

- l'infrastructure contient la configuration et les requêtes à la base postgres.
- l'application contient la configuration générale de l'application spring ainsi que les controllers pour l'exposition de l'api au client.
- le domain contient le coeur de l'application, le métier et est exempt de toute dépendance à un framework.

Doc : https://blog.octo.com/architecture-hexagonale-trois-principes-et-un-exemple-dimplementation/

# jdbc template

Ce projet ne contient pas de dépendances Hibernate et utilise jdbcTemplate.


# Spring boot

Ce projet est démarré avec une configuration spring boot standard. 
Voir @SpringBootApplication dans le fichier Application.java.

- Doc : https://spring.io/projects/spring-boot

# Flywaydb

Flyway est implémenté pour versionner la base de donnée à partir des fichiers sql du classpath dans db/migration. 

Le classpath est scanné à chaque démarrage de context spring pour migrer une éventuelle nouvelle version de la base de donnée à partir des noms des fichiers sql.

Exemple : V1__init.sql, V2__add_table.sql...

- doc : https://flywaydb.org/documentation/

# test Containers & Junit 5

TestContainers sert à démarrer un container Docker pour l'exécution de tests d'intégrations et est implémenté dans ce projet pour être compatible avec Junit 5.

Spring étant démarré à l'exécution des tests d'intégration, un container Docker avec la derrière version des scripts sql est démarré grace à flywaydb.

- doc : https://www.testcontainers.org/quickstart/junit_5_quickstart/

# Webflux

# GraphQL

# Kafka
