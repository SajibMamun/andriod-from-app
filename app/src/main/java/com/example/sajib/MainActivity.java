package com.example.sajib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText fname,lname,email,phone,pass,conpass;
Button b1;
String firstname,lastname,emailadd,phonenum,password,confirmpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fsnameid);
        lname=findViewById(R.id.lnameid);
        phone=findViewById(R.id.phoneid);
        email=findViewById(R.id.emailid);
        pass=findViewById(R.id.passid);
        conpass=findViewById(R.id.conpassid);
        b1=findViewById(R.id.buttonid);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstname=fname.getText().toString();
                lastname=lname.getText().toString();
                emailadd=email.getText().toString();
                phonenum=phone.getText().toString();
                password=pass.getText().toString();
                confirmpassword=conpass.getText().toString();

                if(firstname.isEmpty())
                {
                    fname.setError("Please Enter First name");
                }
                else if(lastname.isEmpty())
                {
                    lname.setError("Please Enter Last name");
                }
               else  if(phonenum.isEmpty()||phonenum.length()!=11)
                {
                    phone.setError("Please Enter 11 digits phone number");
                }
               else if(emailadd.isEmpty())
                {
                    email.setError("Please enter your Email");
                }
               else if(password.isEmpty()||password.length()!=8)
                {
                    pass.setError("Please Enter the 8 Digits Password");
                }
               else if(confirmpassword.isEmpty()||confirmpassword.length()!=password.length())
                {
                    conpass.setError("Re-type the Similar Password");
                }
               else {


                    Toast.makeText(MainActivity.this, "First Name: " + firstname + "\n" +
                            "Last Name: " + lastname + "\n" +
                            "Phone: " + phonenum + "\n" +
                            "Email: " + emailadd + "\n" +
                            "password: " + password + "\n", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}