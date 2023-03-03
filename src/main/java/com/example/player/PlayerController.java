/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController 
public class PlayerController{
    PlayerService service = new PlayerService();
    
    @GetMapping("/players")
    public ArrayList getPlayersList(){
        return service.getPlayersList();
    }

    @PostMapping("/players")
    public Player createPlayerDetails(@RequestBody Player player){
        return service.createPlayerDetails(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerDetails(@PathVariable("playerId") int playerId){
        return service.getPlayerDetails(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayerDetails(@PathVariable ("playerId") int playerId, @RequestBody Player player){
        return service.updatePlayerDetails(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        service.deletePlayer(playerId);
    }
    
}