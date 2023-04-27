package Lab5;

import java.util.List;

interface  Opportunities {
<<<<<<< HEAD:ПП/Lab5/Opportunities.java
    MedicinalPreparations addMedicinalPreparations(MedicinalPreparations substance,String name,int concentration,int statusSubstance);
    int calculateDosage(MedicinalPreparations substance,int weightBody);
    MedicinalPreparations changeStatus(MedicinalPreparations substance,int choice);
    MedicinalPreparations changeInformation(MedicinalPreparations substance,String name,int concentration,int statusSubstance);
=======
    MedicinalPreparations addTablet();
    int calculateDosage(MedicinalPreparations substance);
    MedicinalPreparations changeStatus(MedicinalPreparations substance);
    MedicinalPreparations changeInformation(MedicinalPreparations substance);
>>>>>>> 0466cafa0f64065623d39cd2b834e953373db1b2:ПП/5 laba Ilya/Opportunities.java
    void toString(MedicinalPreparations substance);
    void setAllMedicinalsPreparationOnNumbers(List<Opportunities> substance);
    MedicinalPreparations choiseMedicinalPreparations(List<Opportunities> arrayMedicinalPreparations,int numberPreparation,MedicinalPreparations rightSubstance);
}