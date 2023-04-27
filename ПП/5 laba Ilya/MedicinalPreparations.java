package Lab5;

import java.util.List;
import java.util.Scanner;

public abstract class MedicinalPreparations {
    String name;
    int concentration;
    Status statusSubstance;

    MedicinalPreparations() {
    }

    MedicinalPreparations(String name, int concentration, Status statusSubstance) {
        this.name = name;
        this.concentration = concentration;
        this.statusSubstance = statusSubstance;
    }
}