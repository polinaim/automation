public class SmurfsVillage {
    public static void main(String[] args){
        Smurf smurfList[]=new Smurf[50];

        smurfList[0]= new PapaSmurf();
        smurfList[1] = new Clumsy();
        smurfList[2] = new Brainy();

        for(int i=3; i<smurfList.length; i++){
            smurfList[i] = new Smurf();
        }

        for(int j=0; j<smurfList.length; j++){
            smurfList[j].printDetails();
        }
    }
}
