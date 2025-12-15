# API WILL BE IN MAIN REPO IN 0.16.6

# TanApi


API for Towns and Nations

Additional information :
- [Installation tutorial](https://arcadia-9.gitbook.io/towns-and-nations/developpers/api)  <=== **Better than the readme !**
- [Javadoc](https://javadoc.io/doc/io.github.leralix/tan-api)


## Gradle download
```gradle
repositories {
    mavenCentral()
}

dependencies {
    compileOnly 'io.github.leralix:tan-api:0.2.1'
}
```

## Example code

```java
import org.tan.api.TanAPI;
import org.tan.api.getters.TanPlayerManager;
import org.tan.api.interfaces.TanPlayer;
import org.tan.api.interfaces.TanTown;

public void getPlayerTowns() {
    Collection<TanPlayer> players = playerManager.getAll();
    TanAPI api = TanAPI.getInstance(); //Entry point of the api
    TanPlayerManager playerManager = api.getPlayerManager();
        for (TanPlayer player : players) {
            Optional<TanTown> playerTown = player.getTown();
            if(playerTown.isEmpty()){
                getLogger().info("Player: " + player.getNameStored() + " is not in a town");
            }
            else {
                getLogger().info("Player: " + player.getNameStored() + " is in town : " + playerTown.get().getName());
            }
        }
    }
}

```
