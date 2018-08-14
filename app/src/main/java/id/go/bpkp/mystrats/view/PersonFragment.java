package id.go.bpkp.mystrats.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import id.go.bpkp.mystrats.R;
import id.go.bpkp.mystrats.controller.MAPUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonFragment extends Fragment {


    public PersonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getView().findViewById(R.id.logout_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        keluar();
//                        Toast.makeText(getActivity(), "Test logout", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    private void keluar(){
        MAPUtils.clearLoggedInUser(getContext());
        startActivity(new Intent(getContext(),MAPLoginActivity.class));getActivity().finish();
    }
}
