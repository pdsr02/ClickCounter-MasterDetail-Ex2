package es.ulpgc.eite.cleancode.clickcounter.master;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.eite.cleancode.clickcounter.app.DetailToMasterState;
import es.ulpgc.eite.cleancode.clickcounter.app.MasterToDetailState;
import es.ulpgc.eite.cleancode.clickcounter.data.CounterData;

public interface MasterContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(MasterViewModel viewModel);
    void navigateToNextScreen();

  }

  interface Presenter {
    void onItemClicked(CounterData item);

    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();
    void onButtonPressed();
  }

  interface Model {
    List<CounterData> getStoredData();
    void addCounter(CounterData counter);
    void onIncrementCounter(CounterData item);
    void onIncrementClicks();
    CounterData getCounter(CounterData item);
    //int getClicks();
    void setCounter(CounterData item);
  }


}
