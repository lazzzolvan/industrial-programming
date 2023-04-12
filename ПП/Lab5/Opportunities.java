package Lab5;

import java.util.List;

interface  Opportunities {
    MedicinalPreparations addMedicinalPreparations();
    int calculateDosage(MedicinalPreparations substance);
    MedicinalPreparations changeStatus(MedicinalPreparations substance);
    MedicinalPreparations changeInformation(MedicinalPreparations substance);
    void toString(MedicinalPreparations substance);
    void setAllMedicinalsPreparationOnNumbers(List<MedicinalPreparations> substance);
    MedicinalPreparations choiseMedicinalPreparations(List<MedicinalPreparations> arrayMedicinalPreparations);
}
