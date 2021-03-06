package android.bignerdranch.gamefortheages;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;



public class level_2 extends Fragment implements View.OnClickListener {
    View view;


    ImageView maincharacter;
    ImageView cloud_dialoge_1;

    ImageView Button1;
    ImageView Button2;
    ImageView Button3;

    TextView CloudText;

    TextView Button1Text;
    TextView Button2Text;
    TextView Button3Text;





    boolean pressedButton=false;


    private AnimationDrawable mAnimationDrawable;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_level_2,container,false);



        CloudText = view.findViewById(R.id.CloudText);
        cloud_dialoge_1 = (ImageView) view.findViewById(R.id.cloud_dialoge_first);
        maincharacter = view.findViewById(R.id.maincharacter);

        Button1Text=view.findViewById(R.id.Button1Text);
        Button2Text=view.findViewById(R.id.Button2Text);
        Button3Text=view.findViewById(R.id.Button3Text);

        Button1=view.findViewById(R.id.Button1);
        Button2=view.findViewById(R.id.Button2);
        Button3=view.findViewById(R.id.Button3);

        Button1.setOnClickListener(this);
        Button2.setOnClickListener(this);
        Button3.setOnClickListener(this);










        maincharacter.setBackgroundResource(R.drawable.morg);//кадровая анимация героя
        mAnimationDrawable = (AnimationDrawable) maincharacter.getBackground();
        mAnimationDrawable.start();


        Animations.simpleAnimation(cloud_dialoge_1,R.animator.alpha_main_button,view.getContext());


        //cloud_dialoge_1.setImageResource(R.drawable.cloud_dialoge);


        Animations.simpleAnimation(CloudText,R.animator.alpha_main_button,view.getContext());










        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Button1:
                Toast.makeText(getContext(), "net", Toast.LENGTH_SHORT).show();


                break;

            case R.id.Button2:
                Toast.makeText(getContext(), "da", Toast.LENGTH_SHORT).show();
                break;



            case R.id.Button3:
                Toast.makeText(getContext(), "neeeeeeeeeet", Toast.LENGTH_SHORT).show();
                break;




        }



    }
}
