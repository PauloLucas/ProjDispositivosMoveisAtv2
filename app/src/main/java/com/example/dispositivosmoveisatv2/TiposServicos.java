package com.example.dispositivosmoveisatv2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.dispositivosmoveisatv1.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class TiposServicos extends AppCompatActivity {
    RequestQueue requestQueue;
    TextView list;
    JSONObject teste = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_servicos);
        list = (TextView) findViewById(R.id.listServicos);
        requestQueue = Volley.newRequestQueue(this);
        GetApoioData();


    }
    private  void GetApoioData(){
        String JSON_URL = "https://my-json-server.typicode.com/paulolucas/atividade2DispositivosMoveis/Servicos";
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                JSON_URL,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        try{
                            for(int i=0;i<response.length();i++){
                                JSONObject jsonObject = response.getJSONObject(i);
                                list.append(" \n\n"+jsonObject.get("tipo").toString());
                            }
                        }catch ( JSONException e){
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                    }
                }
        );

        requestQueue.add(jsonArrayRequest);
    }

}