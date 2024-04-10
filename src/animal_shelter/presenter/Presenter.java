package animal_shelter.presenter;

import animal_shelter.model.service.Service;
import animal_shelter.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }
}
