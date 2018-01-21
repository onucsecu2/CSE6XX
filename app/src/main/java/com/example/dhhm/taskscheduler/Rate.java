package com.example.dhhm.taskscheduler;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RatingBar;
        import android.widget.TextView;
        import android.widget.Toast;

public class Rate extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        ratingBar = (RatingBar) findViewById(R.id.rateId);
        txt = (TextView) findViewById(R.id.rateTxt);
        btn = (Button)findViewById(R.id.btn);
        txt.setText("Your rating : 3");

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txt.setText("Your rating : " + rating);
            }
        });

    }
    public void click(View view){
        Toast.makeText(Rate.this,"Successfully Rated",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}