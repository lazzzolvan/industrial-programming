package Lab5.Lab5;

import java.util.List;

interface  Opportunities {
    MedicinalPreparations addMedicinalPreparations(MedicinalPreparations substance,String name,int concentration,int statusSubstance);
    int calculateDosage(MedicinalPreparations substance,int weightBody);
    MedicinalPreparations changeStatus(MedicinalPreparations substance,int choice);
    MedicinalPreparations changeInformation(MedicinalPreparations substance,String name,int concentration,int statusSubstance);
    void toString(MedicinalPreparations substance);
    void setAllMedicinalsPreparationOnNumbers(List<MedicinalPreparations> substance);
    MedicinalPreparations choiseMedicinalPreparations(List<MedicinalPreparations> arrayMedicinalPreparations,int numberPreparation,MedicinalPreparations rightSubstance);
}
