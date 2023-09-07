package com.a2valdez.ulp_moviles_practico_4.ui.mifoto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.a2valdez.ulp_moviles_practico_4.databinding.FragmentMifotoBinding;

public class MiFotoFragment extends Fragment {

    private FragmentMifotoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MiFotoViewModel galleryViewModel =
                new ViewModelProvider(this).get(MiFotoViewModel.class);
            binding = FragmentMifotoBinding.inflate(inflater, container, false);
            View root = binding.getRoot();
            return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}