import java.util.Scanner;

class Hashtag{
	public String name;
	public long counter; // total number of occurrences
	
	// write your code here
	public Hashtag(String name) {
        this.name = name;
        this.counter = 0;
    }
}

public class HW6_StudentID {

	// write your code here
    private List<Hashtag> hashtagList = new ArrayList<>();
    private int totalTweets = 0;
    private int totalRetweets = 0;

	public void readTweet(String line) {
		// write your code here
        totalTweets++;

        if (line.startsWith("RT")) {
            totalRetweets++;
        }

        String[] words = line.split("\\s+");
        for (String word : words) {
            if (word.startsWith("#")) {
                String hashtag = word.toLowerCase();
                insertHashtag(hashtag);
            }
        }
	}
	
	public void insertHashtag(String ht) {
		// write your code here
        for (Hashtag hashtag : hashtagList) {
            if (hashtag.name.equals(ht)) {
                hashtag.counter++;
                return;
            }
        }
        hashtagList.add(new Hashtag(ht));
	}

	public void showMostPopularHashtags(int k) {
		// write your code here
        System.out.println("Top " + k + " popular hashtags:");
        hashtagList.sort((h1, h2) -> Long.compare(h2.counter, h1.counter));
        int count = 0;
        for (Hashtag hashtag : hashtagList) {
            if (count >= k) {
                break;
            }
            System.out.println("Tag " + hashtag.name + " - " + hashtag.counter + " occurrence(s)");
            count++;
        }
	}
	
	public void printMenu() {
		System.out.println();
		System.out.println("Welcome to Twitter Feeds Stats");
		System.out.println("The options are:");
		System.out.println("1. load tweet data file and update stats");
		System.out.println("2. show overall stats (number of tweets, retweets, and hashtags)");
		System.out.println("3. show most popular hashtags");
		System.out.println("9. quit");
		System.out.println("--------> Enter your option: ");
	}
	
    public int getOption(Scanner input) {
        int option = input.nextInt();
        input.nextLine();
        return option;
    }
	public static void main(String[] args){
		// write your code here
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            twitterStats.printMenu();
            option = twitterStats.getOption(scanner);

            switch (option) {
                case 1:
                    System.out.print("Enter filename: ");
                    String filename = scanner.nextLine();
                    twitterStats.updateStatsFromFile(filename);
                    break;
                case 2:
                    twitterStats.showOverallStats();
                    break;
                case 3:
                    System.out.print("Enter the number of popular hashtags to display: ");
                    int k = scanner.nextInt();
                    twitterStats.showMostPopularHashtags(k);
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 9);

        scanner.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                readTweet(line);
            }
            System.out.println("Stats updated successfully!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Tweets: " + totalTweets + ", Retweets: " + totalRetweets + ", Hashtags: " + hashtagList.size());
	}

}
