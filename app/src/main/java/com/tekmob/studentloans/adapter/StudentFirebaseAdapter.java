package com.tekmob.studentloans.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.tekmob.studentloans.R;
import com.tekmob.studentloans.model.StudentModel;

/**
 * Created by Asus on 11/1/2016.
 */
public class StudentFirebaseAdapter extends FirebaseRecyclerAdapter<StudentModel,StudentFirebaseAdapter.MyViewHolder> {

    private ClickListenerHomeInvestor mClickListenerFirebase;

    public StudentFirebaseAdapter(DatabaseReference ref, ClickListenerHomeInvestor mClickListenerFirebase) {
        super(StudentModel.class, R.layout.item_investorhome, StudentFirebaseAdapter.MyViewHolder.class, ref);

    }

    @Override
    protected void populateViewHolder(MyViewHolder viewHolder, StudentModel model, int position) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView name,university,description;
        ImageView profilePicture;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.tv_name);
            university = (TextView)itemView.findViewById(R.id.tv_university);
            description = (TextView) itemView.findViewById(R.id.tv_description);
            profilePicture = (ImageView) itemView.findViewById(R.id.profile_image);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            StudentModel model = getItem(position);
            if (model != null){
                mClickListenerFirebase.click(view, position, model);
            }
        }

        public TextView getName() {
            return name;
        }

        public void setName(TextView name) {
            this.name = name;
        }

        public TextView getUniversity() {
            return university;
        }

        public void setUniversity(TextView university) {
            this.university = university;
        }

        public TextView getDescription() {
            return description;
        }

        public void setDescription(TextView description) {
            this.description = description;
        }

        public ImageView getProfilePicture() {
            return profilePicture;
        }

        public void setProfilePicture(ImageView profilePicture) {
            this.profilePicture = profilePicture;
        }
    }

}
