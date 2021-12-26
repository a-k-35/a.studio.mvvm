package com.example.akacalculatordesk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.icu.number.Precision;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.akacalculatordesk.databinding.ActivityMainBinding;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private MainActivityViewModel viewModel;
    private String deger1,deger2,toplamasonuc,cikarmaSonuc,carpmaSonuc,bolmeSonuc,onUssu1,onUssu1Sonuc,degreeValue,aSindegreeValue;
    private double toplamadeger,cikarmadeger,bolmedeger,carpmadeger,tersinirdeger,yuzebol,onUssuDeger,radValue,sinSonuc,aSinradValue,aSinsonuc;
    private double cosRad,cosSonuc,aCosRad,aCosSonuc,tanRad,tanSonuc,aTanRad,aTanSonuc,exsonuc,karedbl,kupdbl,xydbl,kesirdbl,kokx,kupkokx,logdbl,lndbl;
    private double xfacdbl,rnd;
    private long xfac = 1;
    private String cosValue,acosValue,tanValue,aTanValue,ex,kare,kup,kesir,xfacstr,sinSonucStr,aSinStr,aSinTest;
    private Boolean toplama,cikarma,carpma,bolme,xy;
    private BigDecimal onUssuSonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        tasarim.setMainActivitynesnesi(this);
        toplama = false;
        cikarma = false;
        carpma = false;
        bolme = false;
        xy = false;

        viewModel.getSonuc().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tasarim.setHesaplamaSonucu(s);
            }
        });
    }

    public void button0Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("0");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "0");
    }
    public void button1Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("1");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "1");
    }
    public void button2Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("2");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "2");
    }
    public void button3Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("3");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "3");
    }
    public void button4Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("4");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "4");
    }
    public void button5Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("5");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "5");
    }
    public void button6Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("6");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "6");
    }
    public void button7Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("7");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "7");
    }
    public void button8Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("8");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "8");
    }
    public void button9Tikla(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if((tasarim.getHesaplamaSonucu().charAt(0)=='0'&& boyut==1 )){
            viewModel.getSonuc().setValue("9");
        }
        else if (boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else
            viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + "9");
    }
    public void buttonPiTikla(){
        viewModel.getSonuc().setValue("3.14159265358");
    }
    public void buttonETikla(){
            viewModel.getSonuc().setValue(String.valueOf(Math.exp(1)));
    }
    public void button10UzeriTikla(){
        onUssu1 = tasarim.getHesaplamaSonucu();
        double ans = Math.pow(10,Double.parseDouble(onUssu1));
        //onUssu1Sonuc = new BigDecimal(Double.toString(ans)).stripTrailingZeros().toPlainString();
        viewModel.getSonuc().setValue(String.valueOf(ans));
    }
    public void buttonSinTikla(){
        degreeValue = tasarim.getHesaplamaSonucu();
        radValue = Math.toRadians(Double.parseDouble(degreeValue));
        sinSonuc = Math.sin(radValue);
        viewModel.getSonuc().setValue(String.valueOf(sinSonuc));
    }
    public void buttonASinTikla(){
        aSindegreeValue = tasarim.getHesaplamaSonucu();
        aSinsonuc = Math.asin(Double.parseDouble(aSindegreeValue));
        aSinsonuc = (aSinsonuc*180)/Math.PI;
        viewModel.getSonuc().setValue(String.valueOf(aSinsonuc));
    }
    public void buttonCosTikla(){
        cosValue = tasarim.getHesaplamaSonucu();
        cosRad = Math.toRadians(Double.parseDouble(cosValue));
        cosSonuc = Math.cos(cosRad);
        viewModel.getSonuc().setValue(String.valueOf(cosSonuc));
    }
    public void buttonACosTikla(){
        acosValue = tasarim.getHesaplamaSonucu();
        aCosSonuc = Math.acos(Double.parseDouble(acosValue));
        aCosSonuc = (aCosSonuc*180)/Math.PI;
        viewModel.getSonuc().setValue(String.valueOf(aCosSonuc));
    }
    public void buttonTanTikla(){
        tanValue = tasarim.getHesaplamaSonucu();
        tanRad = Math.toRadians(Double.parseDouble(tanValue));
        tanSonuc = Math.tan(tanRad);
        viewModel.getSonuc().setValue(String.valueOf(tanSonuc));
    }
    public void buttonATanTikla(){
        aTanValue = tasarim.getHesaplamaSonucu();
        aTanSonuc = Math.atan(Double.parseDouble(aTanValue));
        aTanSonuc = (aTanSonuc*180)/Math.PI;
        viewModel.getSonuc().setValue(String.valueOf(aTanSonuc));
    }
    public void buttonEXTikla(){
        ex = tasarim.getHesaplamaSonucu();
        exsonuc = Math.exp(Double.parseDouble(ex));
        viewModel.getSonuc().setValue(String.valueOf(exsonuc));
    }
    public void buttonXKareTikla(){
        kare = tasarim.getHesaplamaSonucu();
        karedbl = Math.pow(Double.parseDouble(kare),2);
        viewModel.getSonuc().setValue(String.valueOf(karedbl));
    }
    public void buttonXKupTikla(){
        kup = tasarim.getHesaplamaSonucu();
        kupdbl = Math.pow(Double.parseDouble(kup),3);
        viewModel.getSonuc().setValue(String.valueOf(kupdbl));
    }
    public void buttonXYTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        xy = true;
        viewModel.getSonuc().setValue("0");
    }
    public void buttonKesirTikla(){
        kesir = tasarim.getHesaplamaSonucu();
        kesirdbl = (1/(Double.parseDouble(kesir)));
        viewModel.getSonuc().setValue(String.valueOf(kesirdbl));
    }
    public void buttonKokXTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        kokx = Math.sqrt(Double.parseDouble(deger1));
        viewModel.getSonuc().setValue(String.valueOf(kokx));
    }
    public void buttonKupKokXTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        kupkokx = Math.sqrt(Math.sqrt(Double.parseDouble(deger1)));
        viewModel.getSonuc().setValue(String.valueOf(kupkokx));
    }
    public void buttonLog10Tikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        logdbl = Math.log10(Double.parseDouble(deger1));
        viewModel.getSonuc().setValue(String.valueOf(logdbl));
    }
    public void buttonLnTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        lndbl = Math.log(Double.parseDouble(deger1));
        viewModel.getSonuc().setValue(String.valueOf(lndbl));
    }
    public void buttonXFacTikla(){
        xfacstr = tasarim.getHesaplamaSonucu();
        xfacdbl = Double.parseDouble(xfacstr);
        if((xfacdbl%1)!=0){
            viewModel.getSonuc().setValue("HATA");
        }
        else if(xfacdbl==0){
            viewModel.getSonuc().setValue("1");
        }
        else{
            for(int i=1;i<(xfacdbl+1);i++){
                xfac=xfac*i;
            }
            viewModel.getSonuc().setValue(String.valueOf(xfac));
            xfac = 1;
        }
    }
    public void buttonRandTikla(){
        Random r = new Random();
        rnd = r.nextDouble();
        viewModel.getSonuc().setValue(String.valueOf(rnd));
    }

    public void buttonToplamaTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        toplama = true;
        viewModel.getSonuc().setValue("0");
    }
    public void buttonCarpmaTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        carpma = true;
        viewModel.getSonuc().setValue("0");
    }
    public void buttonCikarmaTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        cikarma = true;
        viewModel.getSonuc().setValue("0");
    }
    public void buttonBolmeTikla(){
        deger1 = tasarim.getHesaplamaSonucu();
        bolme = true;
        viewModel.getSonuc().setValue("0");
    }
    public void buttonEsittir(){
        deger2 =tasarim.getHesaplamaSonucu();
        if(toplama==true){
            toplamadeger = Double.parseDouble(deger1)+Double.parseDouble(deger2);
            toplamasonuc = new BigDecimal(Double.toString(toplamadeger)).stripTrailingZeros().toPlainString();
            viewModel.getSonuc().setValue(toplamasonuc);
            toplama = false;
        }
        if(cikarma==true){
            cikarmadeger = Double.parseDouble(deger1)-Double.parseDouble(deger2);
            cikarmaSonuc = new BigDecimal(Double.toString(cikarmadeger)).stripTrailingZeros().toPlainString();
            viewModel.getSonuc().setValue(cikarmaSonuc);
            cikarma = false;
        }
        if(carpma==true){
            carpmadeger = Double.parseDouble(deger1)*Double.parseDouble(deger2);
            carpmaSonuc = new BigDecimal(Double.toString(carpmadeger)).stripTrailingZeros().toPlainString();
            viewModel.getSonuc().setValue(carpmaSonuc);
            carpma = false;
        }
        if(bolme==true){
            bolmedeger = Double.parseDouble(deger1)/Double.parseDouble(deger2);
            bolmeSonuc = new BigDecimal(Double.toString(bolmedeger)).stripTrailingZeros().toPlainString();
            viewModel.getSonuc().setValue(bolmeSonuc);
            bolme = false;
        }
        if(xy==true){
            xydbl = Math.pow(Double.parseDouble(deger1),Double.parseDouble(deger2));
            viewModel.getSonuc().setValue(String.valueOf(xydbl));
            xy = false;
        }
    }
    public void buttonC(){
        viewModel.getSonuc().setValue("0");
    }
    public void buttonNokta(){
        int boyut = tasarim.getHesaplamaSonucu().length() ;
        if(boyut==13){
            Toast.makeText(MainActivity.this,"Max digits exceeded",Toast.LENGTH_SHORT).show();
        }
        else {
            char[] harfler = new char[boyut];
            for (int i = 0; i < boyut; i++) {
                harfler[i] = tasarim.getHesaplamaSonucu().charAt(i);
            }
            int noktaSayac = 0;
            for (int a = 0; a < boyut; a++) {
                if (harfler[a] == '.') {
                    noktaSayac++;
                }
            }
            if (noktaSayac == 0) {
                viewModel.getSonuc().setValue(tasarim.getHesaplamaSonucu() + ".");
            }
        }
    }
    public void buttonReverse(){
        tersinirdeger = Double.parseDouble(tasarim.getHesaplamaSonucu());
        tersinirdeger=tersinirdeger*(-1);
        viewModel.getSonuc().setValue(String.valueOf(tersinirdeger));
    }
    public void buttonYuzeBol(){
        yuzebol = Double.parseDouble(tasarim.getHesaplamaSonucu());
        yuzebol = yuzebol/100;
        viewModel.getSonuc().setValue(String.valueOf(yuzebol));
    }
    /*public static String format(Number n){
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(8);
        return format.format(n);
    }*/
}