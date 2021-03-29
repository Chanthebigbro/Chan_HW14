package com.example.hw13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;

    private Button d4Button;
    private Button d6Button;
    private Button d8Button;
    private Button d10Button;
    private Button d12Button;
    private Button d20Button;

    private TextView qtyTV;
    private TextView dicesideTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.oneButton = this.findViewById(R.id.OneB);
        this.twoButton = this.findViewById(R.id.TwoB);
        this.threeButton = this.findViewById(R.id.ThreeB);
        this.fourButton = this.findViewById(R.id.FourB);
        this.fiveButton = this.findViewById(R.id.FiveB);
        this.sixButton = this.findViewById(R.id.SixB);
        this.sevenButton = this.findViewById(R.id.SevenB);
        this.eightButton = this.findViewById(R.id.EightB);
        this.nineButton = this.findViewById(R.id.NineB);
        this.zeroButton = this.findViewById(R.id.ZeroB);

        this.d4Button = this.findViewById(R.id.D4B);
        this.d6Button = this.findViewById(R.id.D6B);
        this.d8Button = this.findViewById(R.id.D8B);
        this.d10Button = this.findViewById(R.id.D10B);
        this.d12Button = this.findViewById(R.id.D12B);
        this.d20Button = this.findViewById(R.id.D20B);

        this.qtyTV = this.findViewById(R.id.Scr3);
        this.dicesideTV = this.findViewById(R.id.Scr4);

    }

    public void qtvButtonPressed(View v)
    {
        if(v == this.oneButton)
        {
            this.qtyTV.setText("1");
        }
        if(v == this.twoButton)
        {
            this.qtyTV.setText("2");
        }
        if(v == this.threeButton)
        {
            this.qtyTV.setText("3");
        }
        if(v == this.fourButton)
        {
            this.qtyTV.setText("4");
        }
        if(v == this.fiveButton)
        {
            this.qtyTV.setText("5");
        }
        if(v == this.sixButton)
        {
            this.qtyTV.setText("6");
        }
        if(v == this.sevenButton)
        {
            this.qtyTV.setText("7");
        }
        if(v == this.eightButton)
        {
            this.qtyTV.setText("8");
        }
        if(v == this.nineButton)
        {
            this.qtyTV.setText("9");
        }
        if(v == this.zeroButton)
        {
            this.qtyTV.setText("0");
        }

    }

    public void dicesideButtonPressed(View v)
    {
        if(v == this.d4Button)
        {
            this.dicesideTV.setText("D4");
        }
        if(v == this.d6Button)
        {
            this.dicesideTV.setText("D6");
        }
        if(v == this.d8Button)
        {
            this.dicesideTV.setText("D8");
        }
        if(v == this.d10Button)
        {
            this.dicesideTV.setText("D10");
        }
        if(v == this.d12Button)
        {
            this.dicesideTV.setText("D12");
        }
        if(v == this.d20Button)
        {
            this.dicesideTV.setText("D20");
        }
    }

}