public class AdvertisingAgencyMain {
    public static void main(String[] args) {
        // Create an instance of AdvertisingAgency
        AdvertisingAgency agency = new AdvertisingAgency();

        // Create some sample campaigns
        Campaign campaign1 = new Campaign("Campaign 1", 1000);
        Campaign campaign2 = new Campaign("Campaign 2", 2000);

        // Add campaigns to the agency
        agency.addCampaign(campaign1);
        agency.addCampaign(campaign2);

        // Print the list of campaigns
        System.out.println("Initial Campaigns:");
        for (Campaign campaign : agency.getCampaigns()) {
            System.out.println(campaign.getName() + ": $" + campaign.getBudget());
        }

        // Save the state
        agency.saveState();

        // Remove a campaign
        agency.removeCampaign(campaign1);

        // Print the updated list of campaigns
        System.out.println("\nCampaigns after removal:");
        for (Campaign campaign : agency.getCampaigns()) {
            System.out.println(campaign.getName() + ": $" + campaign.getBudget());
        }

        // Restore the state
        agency.restoreState();

        // Print the restored list of campaigns
        System.out.println("\nCampaigns after restoration:");
        for (Campaign campaign : agency.getCampaigns()) {
            System.out.println(campaign.getName() + ": $" + campaign.getBudget());
        }
    }
}