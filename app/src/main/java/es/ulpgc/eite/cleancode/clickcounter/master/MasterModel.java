package es.ulpgc.eite.cleancode.clickcounter.master;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.clickcounter.data.CounterData;

public class MasterModel implements MasterContract.Model {

  public static String TAG = MasterModel.class.getSimpleName();

  private List<CounterData> datasource;
  //private int clicks;

  public MasterModel() {
    datasource = new ArrayList<>();
    //clicks=0;
  }

  @Override
  public List<CounterData> getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return datasource;
  }

  @Override
  public void addCounter(CounterData counter) {
    datasource.add(counter);
  }

  @Override
  public void onIncrementCounter(CounterData item) {
    for (CounterData counter : datasource) {
      if (counter.id == item.id) {
        counter.value++;
      }
    }
  }

  @Override
  public void onIncrementClicks() {
    //clicks++;
  }

  @Override
  public CounterData getCounter(CounterData item) {
    for (CounterData counter : datasource) {
      if (counter.id == item.id) {
        return counter;
      }
    }return null;
  }

  /*@Override
  public int getClicks(){
    return clicks;
  }*/

  @Override
  public void setCounter(CounterData item) {
    for (CounterData counter : datasource) {
      if (counter.id == item.id) {
        counter.value=item.value;
      }
    }
  }

}