import java.io.*; 
import java.util.*; 
//NOT SOLVED
class ArtGallery {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] nk = br.readLine().split("\\s+");
    int n = Integer.parseInt(nk[0]);
    int k = Integer.parseInt(nk[1]);

    int[][] gal = new int[n][2];

    String[] line;
    int total = 0;

    for(int i = 0; i < n; i++){
        line = br.readLine().split("\\s+");
        gal[i][0] = Integer.parseInt(line[0]);
        gal[i][1] = Integer.parseInt(line[1]);
        total += gal[i][0] + gal[i][1];
    }

    System.out.println(total);
    
  }
}