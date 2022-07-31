

public class student {
    private int id;
    private string name;
    private float greade;
    //    private int attendence;
    private int paidFrees;
    private int freesTotal;
//    private fees;

    public student(int id, string name, float greade, int paidFrees,int freesTotal) {
        paidFrees=0;
        freesTotal=3000;
        this.id = id;
        this.name = name;
        this.greade = greade;
        this.paidFrees = paidfrees;
        this.freesTotal=freesTotal
    }


    // **

    // update the sutdents grade
    // make the grade of the new students
    public void setGreade(float greade) {
        this.greade = greade;
    }

// keep adding fees to Fees paid ((paidFrees))
   public void updateFeetsPaied(int fees){
    paidFrees+=fees; // the idea of it

    }

    public int getId() {
        return id;
    }

    public string getName() {
        return name;
    }


    public float getGreade() {
        return greade;
    }

    public int getPaidFrees() {
        return paidFrees;
    }

    public int getFreesTotal(){
        return PaidFrees();
    }
    public getRemainingFees(){
      return freesTotal-updateFeetsPaied();
    }
}

