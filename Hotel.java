

public class Hotel {
    
    public static void main(String[] args) {
        String kamar[][]= {
        {"*","*","*","x","*"},
        {"*","*","*","*","*"},
        {"*","*","*","*","*"},
        {"*","*","*","*","x"},
    };
        
        for (int i=0; i<kamar.length; i++){
            for(int j=0; j<kamar[i].length; j++){
                if(kamar[i][j]=="x"){
                    System.out.println("Tamu berada di Lantai " + (kamar.length-i) + " Kamar " + (j+1));
                }
                }
            }
        int jumlahKamarKosong = 0;
        
        for (String[] kamar1 : kamar){
            for (int j = 0; j < kamar1.length; j++) {
                if (kamar1[j] == "*") {
                    jumlahKamarKosong++;
                }
            }
        }
        System.out.println("Jumlah kamar yang tersedia adalah " + jumlahKamarKosong + " kamar");
    }
  }
  
