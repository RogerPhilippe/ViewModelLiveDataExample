package br.com.philippesis.viewmodellivedataexample;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> mCurrentName;
    private MutableLiveData<String> mCurrentNameMut;

    public LiveData<String> getCurrentName() {
        if(mCurrentName == null) {
            mCurrentName = new MutableLiveData<>();
        }
        return mCurrentName;
    }

    public void setCurrentName(String value) {
        if(mCurrentName == null) {
            mCurrentName = new MutableLiveData<>();
        }
        mCurrentName.postValue(value);
    }

    public MutableLiveData<String> getCurrentNameMut() {
        if(mCurrentNameMut == null) {
            mCurrentNameMut = new MutableLiveData<>();
        }
        return mCurrentNameMut;
    }

}
