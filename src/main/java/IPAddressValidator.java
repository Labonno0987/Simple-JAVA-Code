public class IPAddressValidator {
    public static void main(String[] args) {
        String[] ipAddresses = {"192.168.0.1", "172.16.56", "0.0.0.1", "1.12.72.2"};

        for (String ip : ipAddresses) {
            if (isValidIP(ip)) {
                System.out.println(ip + " → Valid IP");
            } else {
                System.out.println(ip + " → Invalid IP");
            }
        }
    }

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4) return false;
        if (parts[0].startsWith("0") || parts[0].length() < 2) return false;

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
