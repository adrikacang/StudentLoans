package com.tekmob.studentloans;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.tekmob.studentloans.model.StudentModel;
import com.tekmob.studentloans.model.UserModel;
import com.tekmob.studentloans.util.Util;

import hani.momanii.supernova_emoji_library.Actions.EmojIconActions;
import hani.momanii.supernova_emoji_library.Helper.EmojiconEditText;

/**
 * Created by Asus on 10/28/2016.
 */
public class InvestorHomeActivity extends AppCompatActivity {

    static final String TAG = InvestorHomeActivity.class.getSimpleName();
    static final String STUDENT_REFERENCE = "studentmodel";

    //Firebase and GoogleApiClient
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private GoogleApiClient mGoogleApiClient;
    private DatabaseReference mFirebaseDatabaseReference;
    FirebaseStorage storage = FirebaseStorage.getInstance();

    // Create a storage reference from our app
    StorageReference storageRef = storage.getReferenceFromUrl(Util.URL_STORAGE_REFERENCE);

    //CLass Model
    private StudentModel userModel;

    //Views UI
    private RecyclerView rvListMessage;
    private LinearLayoutManager mLinearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investor_home);
    }


}
