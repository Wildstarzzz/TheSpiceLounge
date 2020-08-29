package com.sujan.info.thespicelounge.interfaceT;

import android.widget.ProgressBar;

import com.sujan.info.thespicelounge.models.CustomerFeedback;

import java.util.ArrayList;

/**
 * Created by Sujan on 2/8/20.
 */

public interface feedbackListener {
    public void onFeedbackReceived(ArrayList<CustomerFeedback> customerFeedbacks, int foodID, ProgressBar progressBar,boolean isSuccessful);
}
