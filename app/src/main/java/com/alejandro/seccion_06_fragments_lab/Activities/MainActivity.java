package com.alejandro.seccion_06_fragments_lab.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.alejandro.seccion_06_fragments_lab.Adapters.MailAdapter;
import com.alejandro.seccion_06_fragments_lab.Fragments.DetailsFragment;
import com.alejandro.seccion_06_fragments_lab.Fragments.ListFragment;
import com.alejandro.seccion_06_fragments_lab.Models.Mail;
import com.alejandro.seccion_06_fragments_lab.R;
import com.alejandro.seccion_06_fragments_lab.Utils.Util;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {


    private boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMultiPanel();

    }

    @Override
    public void onListClick(Mail mail) {

        if (isMultiPanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
            detailsFragment.renderMail(mail);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("subject", mail.getSubject());
            intent.putExtra("message", mail.getMessage());
            intent.putExtra("senderName", mail.getSenderName());
            startActivity(intent);
        }

    }

    private void setMultiPanel() {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail) != null);
    }
}
