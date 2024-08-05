Java 9 module service sample.

```
                     API (Interfaces)     ---------|
                    [joueur.de.go.api]    <-- uses |
                    
                      ^            ^
                      |            |
            requires  |            |  requires
          & provides  |            |
                      |            |
                      
                   Provider       Consumer
                [chinese.pro]   [jeu.de.go]
```

> [!NOTE] 
> Pour éviter une dépendance à `ServiceLoader.load()` dans le consumer, celle-ci est cachée dans une méthode statique de récupération de l'API, ce qui explique la clause `uses`. 