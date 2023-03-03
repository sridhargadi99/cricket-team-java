// Write your code here
package com.example.player;

import java.util.ArrayList;

public interface PlayerRepository{
    ArrayList<Player> getPlayersList();
    Player createPlayerDetails(Player player);
    Player getPlayerDetails(int playerId);
    Player updatePlayerDetails(int playerId, Player player);

    void deletePlayer(int playerId);
}