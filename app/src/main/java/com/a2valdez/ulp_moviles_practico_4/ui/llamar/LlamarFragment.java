package com.a2valdez.ulp_moviles_practico_4.ui.llamar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.a2valdez.ulp_moviles_practico_4.databinding.FragmentLlamarBinding;

public class LlamarFragment extends Fragment {

    private FragmentLlamarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LlamarViewModel mv =
                new ViewModelProvider(this).get(LlamarViewModel.class);

        binding = FragmentLlamarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mv.getMText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String aString) {
                binding.tvMensaje.setText(aString.toString());
            }
        });

        binding.btLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv.llamar(binding.etNumero.getText().toString());
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}