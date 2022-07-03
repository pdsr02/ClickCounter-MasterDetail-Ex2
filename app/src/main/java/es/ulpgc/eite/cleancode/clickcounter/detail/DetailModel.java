package es.ulpgc.eite.cleancode.clickcounter.detail;

import es.ulpgc.eite.cleancode.clickcounter.data.CounterData;

public class DetailModel implements DetailContract.Model {

  public static String TAG = DetailModel.class.getSimpleName();

  private CounterData counter;
  private int clicks;

  @Override
  public CounterData getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return counter;
  }


  @Override
  public void onDataFromPreviousScreen(CounterData item, int numClicks) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
    counter=item;
    clicks=numClicks;
  }

  @Override
  public void onIncrement() {
    clicks++;
    counter.value++;
  }

  @Override
  public int getClicks(){
    return clicks;
  }

  @Override
  public int getCounter(){
    return counter.value;
  }
}
