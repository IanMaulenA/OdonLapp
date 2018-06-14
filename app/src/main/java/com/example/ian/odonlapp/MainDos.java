package com.example.ian.odonlapp;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainDos extends AppCompatActivity {

    TextView sal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);
        Button BtnAceptar = (Button)findViewById(R.id.BtnAceptar);
        sal = (TextView)findViewById(R.id.salida);

        // getData();
    }

    /*public void getData(){
        String sql = "odonlap.chjyhzz1p6m8.us-east-2.rds.amazonaws.com";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        URL url = null;
        HttpURLConnection conn;

        try{
            url = new URL(sql);
            conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();


            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;

            StringBuffer response = new StringBuffer();

            String json = "";

            while((inputLine = in.readLine()) != null){
            response.append(inputLine);
            }

            json = response.toString();

            JSONArray jsonArr = null;

            jsonArr = new JSONArray(json);
            String mensaje = "";
            for(int i = 0;i<jsonArr.length();i++) {
                JSONObject jsonObject = jsonArr.getJSONObject(i);

                Log.d("SLIDA", jsonObject.optString("description"));
                mensaje += "DESCRIPCION " + i + " " + jsonObject.optString("description") + "\n";
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    */
    public void cambio (View view){
        Intent objI = new Intent(MainDos.this,MainTres.class);
        startActivity(objI);
    }
}
