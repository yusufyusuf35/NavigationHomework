package com.deliysuf.navigationodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deliysuf.navigationodev.databinding.FragmentSayfaXBinding;


public class SayfaXFragment extends Fragment {
private FragmentSayfaXBinding binding ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentSayfaXBinding.inflate(inflater,container,false);
        binding.butonSayfayY2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaYFragment);
        });
       return binding.getRoot();
    }
}