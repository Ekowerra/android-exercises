package fr.android.androidexercises;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Step1Fragment extends Fragment {

    // TODO Override onCreateViewMethod
    private static final String step1 = "This is step 1";

    private TextView textView;
    private Step1Fragment.OnNextStep1Listener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // TODO cast context to listener
        listener = (Step1Fragment.OnNextStep1Listener) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_step1, container, false);
        // TODO findViewById textView (TextView)
        textView = (TextView)view.findViewById(R.id.sept1textView);

        // TODO findViewById nextButton (Button)
        Button nextButton = (Button) view.findViewById(R.id.step1nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO call onNext() from listener
                listener.onNext(1);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // TODO setText(step0)
        textView.setText(step1);
    }

    public interface OnNextStep1Listener {

        // TODO add onNext() method
        void onNext(int step);


    }

}
