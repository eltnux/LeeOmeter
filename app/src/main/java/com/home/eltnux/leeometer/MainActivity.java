package com.home.eltnux.leeometer;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        SharedPreferences preferenceSettings;
        SharedPreferences.Editor preferenceEditor;
        final int PREFERENCE_MODE_PRIVATE = 0;
        String name = "Lee";
        preferenceSettings = getPreferences(PREFERENCE_MODE_PRIVATE);
        preferenceEditor = preferenceSettings.edit();
        preferenceEditor.putString("name",name);
        preferenceEditor.apply();
        String pName = preferenceSettings.getString("name","No Name");
        TextView txtConcat = (TextView)findViewById(R.id.todayLee);
        String todayFull = getString(R.string.xtoday) + " " + pName + " " + getString(R.string.xtodayStr);
        txtConcat .setText(todayFull);

        ImageView img=(ImageView)findViewById(R.id.catImg);
        TextView txt=(TextView)findViewById(R.id.emotionText);
        int imageNum = randomInteger(1,9);
        int imageGif = randomInteger(1,2);
        //imageGif = 2;
        //imageNum = 10;
        switch(imageNum){
            case 1: {
                txt.setText(R.string.xAngryCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.gangrycat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xangrycat);
                }
                break;
            }
            case 2: {
                txt.setText(R.string.xAnxiousCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.ganxiouscat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xanxiouscat);
                }
                break;
            }
            case 3: {
                txt.setText(R.string.xDisgustedCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.gdisgustedcat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xdisgustedcat);
                }
                break;
            }
            case 4: {
                txt.setText(R.string.xHappyCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.ghappycat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xhappycat);
                }
                break;
            }
            case 5: {
                txt.setText(R.string.xInterestedCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.ginterestedcat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xinterestedcat);
                }
                break;
            }
            case 6: {
                txt.setText(R.string.xPlayfulCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.gplayfulcat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xplayfulcat);
                }
                break;
            }
            case 7: {
                txt.setText(R.string.xSadCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.gsadcat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xsadcat);
                }
                break;
            }
            case 8: {
                txt.setText(R.string.xScaredCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.gscaredcat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xscaredcat);
                }
                break;
            }
            case 9: {
                txt.setText(R.string.xSurprisedCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.gsurprisedcat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xsurprisedcat);
                }
                break;
            }
            //This is a place holder for testing the gif/png images
            case 10: {
                txt.setText(R.string.xSurprisedCat);
                if (imageGif == 1) {
                    Glide.with(this)
                            .load(R.drawable.gsurprisedcat)
                            .asGif()
                            .override(381,381)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(img);

                } else {
                    img.setImageResource(R.drawable.xsurprisedcat);
                }
                break;
            }
        }
    }

    public int randomInteger(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public void imageClick(View view) {
        this.recreate();
    }
}
