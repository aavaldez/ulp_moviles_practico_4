package com.a2valdez.ulp_moviles_practico_4.ui.salir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.a2valdez.ulp_moviles_practico_4.databinding.FragmentSalirBinding;

public class SalirFragment extends Fragment {

    private FragmentSalirBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        SalirDialogo.mostrarDialogo(this.getActivity());

        binding = FragmentSalirBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

}