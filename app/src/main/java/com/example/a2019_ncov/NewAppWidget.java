package com.example.a2019_ncov;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

/**
 * Implementation of App Widget functionality.
 */
public class NewAppWidget extends AppWidgetProvider {

    static void updateAppWidget(final Context context, final  AppWidgetManager appWidgetManager,
                                final int appWidgetId) {


        // Construct the RemoteViews object

        // Instruct the widget manager to update the widget

        OkHttpClient mOkHttpClient = new OkHttpClient();
//2,创建一个Request
        final Request request = new Request.Builder()
                .url("https://3g.dxy.cn/newh5/view/pneumonia")
                .build();
//3,新建一个call对象
        Call call = mOkHttpClient.newCall(request);
//4，请求加入调度，这里是异步Get请求回调
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: "+e.getMessage());

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

//                CharSequence  widgetText = (response.body().string().split("window.getAreaStat ="))[1];
                String re = response.body().string();
                String body =((re.split("window.getAreaStat ="))[1].split("catch"))[0];
                   List<Bean> beans =new Gson().fromJson(body.substring(0,body.length()-1), new TypeToken<List<Bean>>(){}.getType());

                   String country=((re.split("getStatisticsService =")[1]).split("countRemark")[1]).split(" ")[1];
                Log.d(TAG, "onResponse: "+body);
              Log.d(TAG, "onResponsesize: "+country);
                final RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);
                views.setTextViewText(R.id.country_count,country);

                for (Bean b :beans
                        ) {
                    if(b.getProvinceName().equals("广东省")){
                        views.setTextViewText(R.id.province_count,String.valueOf(b.getConfirmedCount()));
                        for (Bean.CitiesBean citiesBean: b.getCities()
                             ) {
                            if(citiesBean.getCityName().equals("江门市")) views.setTextViewText(R.id.city_count,String.valueOf(citiesBean.getConfirmedCount()));
                        }
                    }
                }


                appWidgetManager.updateAppWidget(appWidgetId, views);

            }
        });
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

