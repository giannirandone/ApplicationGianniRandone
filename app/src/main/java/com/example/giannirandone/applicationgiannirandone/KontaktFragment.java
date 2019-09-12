package com.example.giannirandone.applicationgiannirandone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class KontaktFragment extends Fragment {

    TextView textView_linkToLinkedIn;
    TextView textView_linkToXing;
    TextView textView_linkToGitHub;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_kontakt, container, false);

        TextView textView_linkToLinkedIn = (TextView)v.findViewById(R.id.textView_linkToLinkedIn);
        textView_linkToLinkedIn.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_linkToXing = (TextView)v.findViewById(R.id.textView_linkToXing);
        textView_linkToXing.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_linkToGitHub = (TextView)v.findViewById(R.id.textView_linkToGitHub);
        textView_linkToGitHub.setMovementMethod(LinkMovementMethod.getInstance());

        return v;
    }


}
