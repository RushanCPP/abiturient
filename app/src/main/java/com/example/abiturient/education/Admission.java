package com.example.abiturient.education;

public class Admission implements AdmissionInterface {
    USEWork egeWork;
    OlympiadsWork olympiadsWork;
    public Admission(USEWork egeWork, OlympiadsWork olympiadsWork) {
        this.egeWork = egeWork;
        this.olympiadsWork = olympiadsWork;
    }
    @Override
    public boolean isAccepted(User user, University university) {
        return egeWork.isAccepted(user.getUse(), university.getUSELessons()) ||
                olympiadsWork.isAccepted(user.getOlympiads(), university.getOlympiads());
    }
}
