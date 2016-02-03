package sidespell.tech.midtermexam.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import sidespell.tech.midtermexam.R;

public class MainFragment extends Fragment {


    private EditText etInput;
    String input;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // TODO: Find all views here..
        etInput = (EditText)view.findViewById(R.id.etAlbum);
        etInput.setImeOptions(EditorInfo.IME_ACTION_SEARCH);

        input = etInput.getText().toString();

        etInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    performSearch();
                    return true;
                }
                return false;
            }
        });

        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // TODO: Perform logic operations here..
    }

    public void performSearch(){
    //    Toast.makeText(getActivity(), etInput.getText() + " Inputted!", Toast.LENGTH_SHORT).show();
    };
}
