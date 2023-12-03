
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            int counterGames = 0;
            int wins = 0;
            int losses = 0;

            while (reader.hasNext()) {
                String[] parts = reader.nextLine().split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);
                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    counterGames++;
                    if (homeTeam.equals(team)) {
                        if (homePoints > visitPoints) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                    if (visitingTeam.equals(team)) {
                        if (visitPoints > homePoints) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                }

            }
            System.out.println("Games: " + counterGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());

        }

    }

}
