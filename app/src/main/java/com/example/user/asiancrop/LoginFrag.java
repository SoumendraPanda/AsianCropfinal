package com.example.user.asiancrop;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Connection;

public class LoginFrag extends Fragment {
    EditText usnm;
    EditText password;
    Button logn;
    Connection con;
    String usname,pasword,db,ip;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.loginpage,
                container, false);
        final EditText usnm = view.findViewById(R.id.let1);
        final EditText password= view.findViewById(R.id.let2);
        Button logn = view.findViewById(R.id.login);
        ip="your server ip is here";
        db="your database name is here";
        usname="your user name for databse is here";
        pasword="your pasword for databse is here";


        logn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                      CheckLogin checkLogin=new CheckLogin();
                                      checkLogin.execute();
                                   }

                               }

        );


        return view;
    }
    public class CheckLogin extends AsyncTask<String,String,String> {

        String z="";
        Boolean isSuccess=false;

        @Override
        protected String doInBackground(String... strings) {
            String usname= usnm.getText().toString();
            String pasword=password.getText().toString();
            if(usname.trim().equals("")|| pasword.trim().equals(""))
            {
                z="Please enter username and password";
            }
            else
            {
                try
                {
                    con=connectionclass(usname,pasword,db,ip);
                    if(con== null)
                    {
                        z="check your internet access";
                    }
                    else
                    {
                        String query="select * from employee where
                    }
                }
            }
            return null;
        }
    }

}
