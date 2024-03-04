// Exception Handling with method over riding
// -> if super class method does not declare an exception then sub class overridden method cannot declare the checked exception but it can
// a uncehecked exception!


import java.util.HashMap;
import java.util.Map;

public class feb2703 {
    
    // Define interest rates
    static Map<String, Map<String, Double>> fdRatesBelow1Cr = new HashMap<>();
    static Map<String, Double> fdRatesAbove1Cr = new HashMap<>();
    static Map<String, Map<String, Double>> rdRates = new HashMap<>();
    static Map<String, Double> sbRates = new HashMap<>();
    
    static {
        // FD rates below 1 crore
        fdRatesBelow1Cr.put("7 days to 14 days", Map.of("General", 4.50, "Senior Citizen", 5.00));
        fdRatesBelow1Cr.put("15 days to 29 days", Map.of("General", 4.75, "Senior Citizen", 5.25));
        fdRatesBelow1Cr.put("30 days to 45 days", Map.of("General", 5.50, "Senior Citizen", 6.00));
        fdRatesBelow1Cr.put("45 days to 60 days", Map.of("General", 7.00, "Senior Citizen", 7.50));
        fdRatesBelow1Cr.put("61 days to 184 days", Map.of("General", 7.50, "Senior Citizen", 8.00));
        fdRatesBelow1Cr.put("185 days to 1 year", Map.of("General", 8.00, "Senior Citizen", 8.50));
        
        // FD rates above 1 crore
        fdRatesAbove1Cr.put("7 days to 14 days", 6.50);
        fdRatesAbove1Cr.put("15 days to 29 days", 6.75);
        fdRatesAbove1Cr.put("30 days to 45 days", 6.75);
        fdRatesAbove1Cr.put("45 days to 60 days", 8.00);
        fdRatesAbove1Cr.put("61 days to 184 days", 8.50);
        fdRatesAbove1Cr.put("185 days to 1 year", 10.00);
        
        // RD rates
        rdRates.put("6 months", Map.of("General", 7.50, "Senior Citizen", 8.00));
        rdRates.put("9 months", Map.of("General", 7.75, "Senior Citizen", 8.25));
        rdRates.put("12 months", Map.of("General", 8.00, "Senior Citizen", 8.50));
        rdRates.put("15 months", Map.of("General", 8.25, "Senior Citizen", 8.75));
        rdRates.put("18 months", Map.of("General", 8.50, "Senior Citizen", 9.00));
        rdRates.put("21 months", Map.of("General", 8.75, "Senior Citizen", 9.25));
        
        // SB rates
        sbRates.put("Normal", 4.00);
        sbRates.put("NRI", 6.00);
    }
    
    public static double calculateInterest(String accountType, double amount, String accountHolderStatus, String duration) {
        double interestRate;
        
        // Determine applicable interest rates based on account type and amount
        if (accountType.equals("FD")) {
            if (amount < 10000000) { // Below 1 crore
                interestRate = fdRatesBelow1Cr.get(duration).get(accountHolderStatus);
            } else {
                interestRate = fdRatesAbove1Cr.get(duration);
            }
        } else if (accountType.equals("RD")) {
            interestRate = rdRates.get(duration).get(accountHolderStatus);
        } else { // SB Account
            interestRate = sbRates.get(accountType);
        }
        
        // Calculate interest earned
        double interestEarned = (amount * interestRate) / 100;
        return interestEarned;
    }
    
    public static void main(String[] args) {
        // Example usage:
        // FD interest calculation for a general account holder with an amount of 5000000 for 6 months
        System.out.println("FD Interest: " + calculateInterest("FD", 5000000, "General", "6 months"));
        
        // RD interest calculation for a senior citizen account holder with an amount of 2000000 for 18 months
        System.out.println("RD Interest: " + calculateInterest("RD", 2000000, "Senior Citizen", "18 months"));
        
        // SB interest calculation for a normal account holder with an amount of 1000000
        System.out.println("SB Interest: " + calculateInterest("Normal", 1000000, null, null));
    }
}

