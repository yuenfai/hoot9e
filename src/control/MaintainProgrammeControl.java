package control;

import da.CustomerDA;
import da.ProgrammeDA;
import domain.Programme;

public class MaintainProgrammeControl {

    private ProgrammeDA progDA;
    private CustomerDA custDA;

    public MaintainProgrammeControl() {
        progDA = new ProgrammeDA();
        custDA = new CustomerDA();
        
    }

    public Programme selectRecord(String code) {
        return progDA.getRecord(code);
    }

}
