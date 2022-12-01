package com.deliysuf.navigationodev;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.Navigation;
import androidx.transition.FragmentTransitionSupport;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deliysuf.navigationodev.databinding.FragmentSayfaYBinding;


public class SayfaYFragment extends Fragment {
private FragmentSayfaYBinding binding ;
    private OnBackPressedDispatcher OnBackPressedDispatcherOwner;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    binding = FragmentSayfaYBinding.inflate(inflater,container,false);


      /*  OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
               // Navigation.findNavController(binding.getRoot()).navigate(R.id.anasayfaFragment)
                Navigation.findNavController(binding.getRoot()).popBackStack(R.id.anasayfaFragment,false);
            }
        };
      requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),callback);     */


        return binding.getRoot();

    }

}