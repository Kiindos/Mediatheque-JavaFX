# Introduction à JavaFX
## Le MVC
Le code est séparé en 3 parties:
- Une première partie dédiée au stockage, Model, ici c'est la médiathèque.
- Une seconde partie pour l'affichage, View, qui, dans ce cas, est le fichier Main.
- Une dernière partie pour contrôler le tout, Controller, c'est le fichier MédiathèqueController.
## Le Code
Ce projet exploite l'héritage, ce qui permet de développer la notion de Model dans le MVC. Cela le rend plus tolérant aux modifications permettant des améliorations comme par exemple la gestion des différents média qui ne sont pas encore gérables avec cette version de Controller.

### Précisions
#### Le stockage
Dans le code il est facile de remarquer l'apparition de deux stockage différent, dont un en dehors de la partie stockage: ListView et Mediatheque. Le ListView n'est pas réellement un point de stockage, c'est en réalité un point d'affichage contenant des valeurs extérieurs. C'est donc plus un hybride n'ayant pas vocation à être dans la partie stockage car hors du MVC pur.
#### Le GetTitre
La fonction getTitre est obligatoire tant l'attribut titre de Document est privé, il faut donc créer une méthode qui lie la méthode Document (privé) dans une class différente à notre class où elle devra être exploitée