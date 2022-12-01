package com.deliysuf.navigationodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deliysuf.navigationodev.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

private FragmentAnasayfaBinding binding ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     binding = FragmentAnasayfaBinding.inflate(inflater,container,false);

     binding.butonSayfaX.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
           NavDirections directionX  = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaXFragment();
             Navigation.findNavController(view).navigate(directionX);
         }
     });
      binding.buttonSayfaA.setOnClickListener(view->{
          NavDirections directionA = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaAFragment();
          Navigation.findNavController(view).navigate(directionA);
      });
        return binding.getRoot();
    }
}