package br.com.philippesis.viewmodellivedataexample;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModel mModel = ViewModelProviders.of(this).get(MainViewModel.class);

        // Exemplo LiveData
        //mModel.setCurrentName("MC1");
        mModel.getCurrentName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                String name = s;
            }
        });

        // Exemplo MutableLiveData
        //mModel.getCurrentNameMut().setValue("MC1-Mut");
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                String name = s;
            }
        };

        mModel.getCurrentNameMut().observe(this, nameObserver);

        //
        TestViewModel.getInstance().testViewModel(mModel);

        TestViewModel.getInstance().testViewModelMut(mModel);

    }
}
