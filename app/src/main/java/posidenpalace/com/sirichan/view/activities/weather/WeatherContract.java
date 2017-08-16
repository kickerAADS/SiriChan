package posidenpalace.com.sirichan.view.activities.weather;


import posidenpalace.com.sirichan.view.activities.BasePresenter;
import posidenpalace.com.sirichan.view.activities.BaseView;
import posidenpalace.com.sirichan.view.activities.restcalls.model.weathermodel.WeatherDataPojo;
import retrofit2.Response;

public interface WeatherContract {
    interface View extends BaseView{
        void weatherResponse(Response<WeatherDataPojo> response);

    }
    interface Presenter extends BasePresenter<View>{
        void getLocationsWeather(double lat, double lon);


        void getMultipleDays(double lat, double lon);

    }
}
