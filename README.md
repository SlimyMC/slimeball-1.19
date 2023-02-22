Slimeball is a fork of the Minestom Minecraft server software, created as a dependency of Mojang. This Java jar file can be used to run a Minecraft server and provide players with a unique gameplay experience.

Slimeball is a powerful tool for server owners and Minecraft enthusiasts who want to create their own customized Minecraft gameplay experience. With the ability to modify and customize the game rules, create custom plugins, and add new content, Slimeball offers endless possibilities for Minecraft server owners and players alike.


If youn want to see player statistics from SlimyMC Networks use the SlimeballAPI for your own needs.

  ```import org.slimeball.SlimeballAPI;

public class Example {
    public static void main(String[] args) {
        // Start the Slimeball server
        SlimeballAPI.startServer();

        // Get the number of players currently connected to the server
        int numPlayers = SlimeballAPI.getNumPlayers();

        // Print the number of players to the console
        System.out.println("There are currently " + numPlayers + " players on the Slimeball server.");

        // Get a player's Skywars achievements
        int skywarsAchievements = SlimeballAPI.getPlayerAchievements("playername", "skywars");

        // Print the player's Skywars achievements to the console
        System.out.println("Playername has " + skywarsAchievements + " Skywars achievements.");

        // Get a player's Arcade rewards
        int arcadeRewards = SlimeballAPI.getPlayerRewards("playername", "arcade");

        // Print the player's Arcade rewards to the console
        System.out.println("Playername has " + arcadeRewards + " Arcade rewards.");

        // Get a player's Bedwars coins
        int bedwarsCoins = SlimeballAPI.getPlayerCoins("playername", "bedwars");

        // Print the player's Bedwars coins to the console
        System.out.println("Playername has " + bedwarsCoins + " Bedwars coins.");

        // Get the leaderboard for Skywars
        String skywarsLeaderboard = SlimeballAPI.getLeaderboard("skywars");

        // Print the Skywars leaderboard to the console
        System.out.println("Skywars leaderboard:\n" + skywarsLeaderboard);

        // Stop the Slimeball server
        SlimeballAPI.stopServer();
    }
}
  ```
