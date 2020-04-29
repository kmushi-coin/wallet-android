package com.kmushi.wallet.ui;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kmushi.wallet.R;
import com.kmushi.wallet.util.Fonts;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AboutActivity extends BaseWalletActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);

        TextView version = (TextView) findViewById(R.id.about_version);
        if (getWalletApplication().packageInfo() != null) {
            version.setText(getWalletApplication().packageInfo().versionName);
        } else {
            version.setVisibility(View.INVISIBLE);
        }

        //Fonts.setTypeface(findViewById(R.id.translation_globe), Fonts.Font.COINOMI_FONT_ICONS);
    }

    @OnClick(R.id.terms_of_service_button)
    void onTermsOfUseClick() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.terms_of_service_title)
                .setMessage(R.string.terms_of_service)
                .setPositiveButton(R.string.button_ok, null).create().show();
    }

    public void myFace(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/KmushiCoin/"));
        startActivity(browserIntent);
    }

    public void myInstag(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/KmushiCoin/"));
        startActivity(browserIntent);
    }

    public void myTwitt(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/KmushiCoin"));
        startActivity(browserIntent);
    }

    public void myTeleg(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/KmushiCoin_Es"));
        startActivity(browserIntent);
    }

    public void myDiscord(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.gg/HNudRNK"));
        startActivity(browserIntent);
    }

}
