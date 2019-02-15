package br.com.philippesis.viewmodellivedataexample;

public class TestViewModel {

    private TestViewModel() {}

    private static TestViewModel instance;

    private MainViewModel mModel;

    public static TestViewModel getInstance() {
        if(instance == null) {
            instance = new TestViewModel();
        }
        return instance;
    }

    public void testViewModel(MainViewModel mainViewModel) {

        mModel = mainViewModel;
        mModel.setCurrentName("MC1-External Call");

    }

    public  void testViewModelMut(MainViewModel mainViewModel) {

        mModel = mainViewModel;
        mModel.getCurrentNameMut().setValue("MC1-Mut-External Call");

    }

}
