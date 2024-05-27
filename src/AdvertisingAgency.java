import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdvertisingAgency {
    private List<Campaign> campaigns;

    // Constructor
    public AdvertisingAgency() {
        this.campaigns = new ArrayList<>();
    }

    // Method to add a campaign to the list
    public void addCampaign(Campaign campaign) {
        campaigns.add(campaign);
    }

    // Method to remove a campaign from the list
    public void removeCampaign(Campaign campaign) {
        campaigns.remove(campaign);
    }

    // Getter for campaigns list
    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    // Method to save the state of the organization to a CSV file
    public void saveState() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("state.csv"))) {
            for (Campaign campaign : campaigns) {
                writer.println(campaign.getName() + "," + campaign.getBudget());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to restore the state of the organization from a CSV file
    public void restoreState() {
        campaigns.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("state.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int budget = Integer.parseInt(parts[1]);
                    campaigns.add(new Campaign(name, budget));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}