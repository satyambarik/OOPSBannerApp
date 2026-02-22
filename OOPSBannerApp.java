
public class OOPSBannerApp{

    public static void main(String[] args) {

        String[][] pattern = {
			{"    ***        ***        ******         *****    "},
			{"  **   **    **   **      **    **      **    **  "},
			{" **     **  **     **     **    **     **      ** "},
			{" **     **  **     **     **    **      **        "},
			{" **     **  **     **     *******         ***     "},
			{" **     **  **     **     **                 **   "},
			{" **     **  **     **     **          **      **  "},
			{"  **   **    **   **      **           **     **  "},
			{"    ***        ***        **             *****    "},
            
        };

        
        for (String[] row : pattern) {
            System.out.println(String.join("  ", row));
        }
    }
}